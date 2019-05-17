package com.greenplatform.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.greenplatform.model.PlateCodeDmlb;
import com.greenplatform.model.PlateCodeDmz;
import com.greenplatform.model.PlateUser;
import com.greenplatform.model.TGreenSpSpmx;
import com.greenplatform.model.base.ReturnModel;
import com.greenplatform.service.PlateService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Luowenlv on 2019/5/7,11:25
 */
@Controller
@RequestMapping(value = "/plate")
public class PlateController {

    @Autowired
    PlateService plateService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(PlateUser plateUser) {
        return "plate/yhgl/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "plate/login/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel login(PlateUser plateUser){
        ReturnModel returnModel = plateService.selectPlateuser(plateUser,"login");
        return returnModel;
    }

    @RequestMapping(value = "/selectPlateuser",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel selectPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.selectPlateuser(plateUser);
        return returnModel;
    }

    @RequestMapping(value = "/insertPlateuser",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel insertPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.insertPlateuser(plateUser);
        return returnModel;
    }

    @RequestMapping(value = "/updPlateuser",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel updPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.updPlateuser(plateUser);
        return returnModel;
    }

    @RequestMapping(value = "/delPlateuser",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel delPlateuser(PlateUser plateUser){
        ReturnModel returnModel = plateService.delPlateuser(plateUser);
        return returnModel;
    }
    @RequestMapping(value = "/selectPlateCodeDmz",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel selectPlateCodeDmz(PlateCodeDmz plateCodeDmz){
        ReturnModel returnModel = plateService.selectPlateCodeDmz(plateCodeDmz);
        return returnModel;
    }

    @RequestMapping(value = "/selectTGreenSpSpmx",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel selectTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.selectTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @RequestMapping(value = "/insertTGreenSpSpmx",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel insertTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.insertTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @RequestMapping(value = "/delTGreenSpSpmx",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel delTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.delTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }

    @RequestMapping(value = "/updTGreenSpSpmx",method = RequestMethod.POST)
    @ResponseBody
    public ReturnModel updTGreenSpSpmx(TGreenSpSpmx tGreenSpSpmx){
        ReturnModel returnModel = plateService.updTGreenSpSpmx(tGreenSpSpmx);
        return returnModel;
    }


}
