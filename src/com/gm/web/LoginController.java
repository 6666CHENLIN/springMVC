package com.gm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 陈琳
 * @date 2020/3/30 10:03
 */

@Controller
@RequestMapping(LoginController.BASE_ONTROLLER)
public class LoginController {
public static final String BASE_ONTROLLER="/loginController";
public static final String INDEX_PAGE="../index.jsp";

    //模拟登陆
    @RequestMapping(value = {"/login"})
    public String login() {

        //服务器的处理
        System.out.println("正在登陆······   登陆成功");

        //页面的响应
        return INDEX_PAGE;

    }
}
