package com.zheng.cms.web.controller;

import com.zheng.cms.dao.model.*;
import com.zheng.cms.rpc.api.CmsCategoryService;
import com.zheng.cms.rpc.api.CmsMenuService;
import com.zheng.cms.rpc.api.CmsSystemService;
import com.zheng.cms.rpc.api.CmsTagService;
import com.zheng.common.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 个人中心控制器
 * Created by zjj on 2019年2月24日20:58:25
 *
 */
@Controller
@RequestMapping(value = "/home")
public class PersonalController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonalController.class);


    //个人博客
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return thymeleaf("/home/index");
        //http://ui.zhangshuzheng.cn:1000/zheng-cms-web/index.html
    }

    //我的问题
    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public String question(Model model) {
        return thymeleaf("/home/question/index");
    }

    //我的回答
    @RequestMapping(value = "/answer", method = RequestMethod.GET)
    public String answer(Model answer) {
        return thymeleaf("/home/answer/index");
    }

    //我的收藏
    @RequestMapping(value = "/collection", method = RequestMethod.GET)
    public String collection(Model model) {
        return thymeleaf("/home/collection/index");
    }

    //退出
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model) {
        return thymeleaf("/home/logout");
    }

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return thymeleaf("/home/login");
    }
    //注册
    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg(Model model) {
        return thymeleaf("/home/reg");
    }

    //系统消息
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message(Model model) {
        return thymeleaf("/home/message");
    }

    //私信
    @RequestMapping(value = "/letter", method = RequestMethod.GET)
    public String letter(Model model) {
        return thymeleaf("/home/letter");
    }





}