// miniprogram/pages/firstVisit/firstVisit.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },

  //商家入驻填写信息
  gotoWriteInfo: function (event) {
    let url = event.currentTarget.dataset.url;
    if ("../home/home" == url){
      wx.switchTab({
        url: url,
      })
    }else{
      wx.navigateTo({
        url: "../writeinfo-bus-2/writeinfo-bus-2",
      })
    }
    

  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})