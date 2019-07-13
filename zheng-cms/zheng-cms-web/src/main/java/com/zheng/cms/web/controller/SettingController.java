package com.zheng.cms.web.controller;

import com.zheng.common.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 设置控制器
 * Created by zjj on 2019年2月24日20:58:25
 *
 */
@Controller
@RequestMapping(value = "/setting")
public class SettingController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SettingController.class);


    //修改资料
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info(Model model) {
        return thymeleaf("/setting/info");
        //http://ui.zhangshuzheng.cn:1000/zheng-cms-web/index.html
    }

    //修改密码
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String answer(Model model) {
        return thymeleaf("/setting/password");
    }

}