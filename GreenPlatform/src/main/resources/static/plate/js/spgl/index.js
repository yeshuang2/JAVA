var grid;
$(function(){
    initEvent();
    initGrid();
});

/**
 * 初始化事件
 */
function initEvent(){
    initMenu();
    $("#btnReset").click(function(){
        $("#insertForm input").val("");
        $("#insertForm textarea").val("");
        $("#insertForm select").val("");
    });
    $("#btnAdd").click(function(){
        $("#myModalLabel").html("新增商品");
        $("#btnReset").click();
        $("#cSpbh").val("");
        $("#addUserModel").modal('show');
    });

    $("#btnSearch").click(function(){
        loadGridData();
    });
    $("#btnSave").click(function(){
        checkRequire();
        $("#insertForm").bootstrapValidator('validate');//提交验证

        if ($("#insertForm").data('bootstrapValidator').isValid()) {
            if($("#cSpbh").val()){
                f_submitData("1","/plate/updTGreenSpSpmx");
            }else{
                f_submitData("0","/plate/insertTGreenSpSpmx");
            }
        }
    });
}

function initMenu(){
    $(".center_main_left").find("li").each(function () {
        var a = $(this).find("a:first")[0];
        if ($(a).attr("href") === location.pathname) {
            $(this).addClass("active");
        } else {
            $(this).removeClass("active");
        }
    });
}

/**
 * 初始化表格
 */
function initGrid(){
    grid = new dhtmlXGridObject('gridbox');
    grid.setImagePath("/publicFrame/dhtmlx-4.5/skins/web/imgs/");
    grid.setHeader("操作,商品名称,商品描述,商品价格,商品单位,状态");
    grid.setInitWidthsP("15,10,40,15,10,9.5");
    grid.setColAlign("center,center,center,center,center,center");
    grid.setColTypes("ro,ro,ro,ro,ro,ro");
    grid.enableMultiselect(false);
    grid.init();
}

/**
 * 查询数据
 */
function loadGridData(){
    grid.clearAll();
    var sendRequest = new SendRequest("/plate/selectTGreenSpSpmx","POST");//构造对象
    sendRequest.addParamObj({
        "cSpmc":$("#cSpmcSearch").val()
    });//构造请求参数

    sendRequest.sendRequest(function(ret){
        console.log(ret);
        if(ret.flag != "0"){
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "查询出错,系统错误！",
                closeable: true,
                buttonLabel: "确定"
            });
        }else{
            if(ret.object.length > 0){
                $("#commonInfo").hide();
                initData(ret.object);
            }else{
                $("#commonInfo").show();
                $("#commonInfo").text("没有查询结果！");
            }
        }
    });//发送请求并获取返回结果
}

/**
 * 表格赋值
 * @param data
 */
function initData(data){
    for (var i=0; i<data.length; i++){
        var opLinkBuff = new StringBuffer();
        opLinkBuff.append("<button type=\"button\" class=\"btn btn-sm btn-primary \" onclick=\"f_upd(\'"+data[i].cSpbh+"\');\" id=\"xg_link_"+data[i].cSpbh+"\" >修改</button>")
        opLinkBuff.append("<button type=\"button\" class=\"btn btn-sm btn-warning \" onclick=\"f_del(\'"+data[i].cSpbh+"\');\" id=\"del_link_"+data[i].cSpbh+"\" >删除</button>")

        grid.addRow(data[i].cSpbh,[
            opLinkBuff.toString(),
            data[i].cSpmc,
            data[i].cSpms,
            data[i].cSpjg,
            data[i].cSpdw,
            data[i].cZt
        ]);
        grid.setUserData(data[i].cSpbh,'data',data[i]);
    }
}

/**
 * 验证表单
 */
function checkRequire(){
    $('#insertForm').bootstrapValidator({
        excluded: [':disabled'],
        message: '表单验证有误',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            /*invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'*/
        },
        fields: {
            cSpmc: {
                message: '商品名称验证失败',
                validators: {
                    notEmpty: {
                        message: '商品名称不能为空'
                    }
                }
            },
            cSpjg: {
                message: '商品价格验证失败',
                validators: {
                    notEmpty: {
                        message: '商品价格不能为空'
                    },
                    regexp: {
                        regexp: /^[0-9]+$/,
                        message: '商品价格只能是数字'
                    }
                }
            }
        }
    });
}


/**
 * 发送请求保存数据
 * type:操作类型，0新增/1修改/2删除
 * reqURL：服务地址
 */
function f_submitData(type,reqURL){
    var sendRequest = new SendRequest(reqURL,"POST");//构造对象

    if ("0" === type) {
        sendRequest.addParamObj({
            "cSpmc":$("#cSpmc").val(),
            "cSpjg":$("#cSpjg").val(),
            "cSpms":$("#cSpms").val(),
            "cZt":'1'
        });//构造请求参数
    }else if("1" === type){
        sendRequest.addParamObj({
            "cSpbh":$("#cSpbh").val(),
            "cSpmc":$("#cSpmc").val(),
            "cSpjg":$("#cSpjg").val(),
            "cSpms":$("#cSpms").val(),
            "cZt":'1'
        });//构造请求参数
    }else if("2" === type){
        sendRequest.addParamObj({
            "cSpbh":$("#cSpbh").val()
        });//构造请求参数
    }

    sendRequest.sendRequest(function(ret){
        $("#btnSave").attr("disabled",false);
        if("0" != ret.flag){
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "操作失败！"+ret.msg,
                closeable: true,
                buttonLabel: "确定"
            });
        }else{
            BootstrapDialog.alert({
                type: BootstrapDialog.TYPE_WARNING,
                size: BootstrapDialog.SIZE_SMALL,
                title: '提示',
                message: "操作成功",
                closeable: true,
                buttonLabel: "确定"
            });
            $("#btnRet,#btnReset").click();
            loadGridData();
        }
    });//发送请求并获取返回结果
}

/*
修改用户,页面赋值
 */
function f_upd(id){
    var data = grid.getUserData(id,"data");
    $("#btnAdd").click();//触发新增按钮点击事件（设置人员id为空，清空输入框，打开模态框，初始化下拉框）
    $("#myModalLabel").html("修改商品");
    setInputArea(nullToEmptyForObject(data));
}
/*
删除用户
 */
function f_del(id){
    $("#cSpbh").val(id);
    BootstrapDialog.confirm({
        type: BootstrapDialog.TYPE_DANGER,
        size: BootstrapDialog.SIZE_SMALL,
        title: '提示',
        message: "确认删除吗！",
        closeable: true,
        btnOKLabel: "确定",
        btnCancelLabel: "取消",
        callback: function (ret) {
            if(ret){
                f_submitData('2',"/plate/delTGreenSpSpmx");
            }
        }
    });
}



