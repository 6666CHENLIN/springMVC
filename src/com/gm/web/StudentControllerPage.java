package com.gm.web;

import com.gm.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author 陈琳
 * @date 2020/3/30 10:59
 */

@Controller
@RequestMapping(StudentControllerPage.BASE_CONTROLLER)
public class StudentControllerPage {
    //字符串常量的提取
    public static final String BASE_CONTROLLER = "/studentControllerPage";
    public static final String INDEX_PAGE = "../index.jsp";

    // 提供页面的响应跳转
    @RequestMapping("/addStu")
    public ModelAndView addStu(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        System.out.println(" 跳转页面中········");

        //方式一：直接用servletapi实现页面跳转
        //        request.getRequestDispatcher("../index.jsp").forward(request,response);
//        response.sendRedirect(request.getContextPath()+"/index.jsp");


        //方式二：字符串实现转发或则重定向
//        return "redirect:/index.jsp";  //redirect默认从项目根目录进行请求
//        return "forward:../index.jsp";

        //方式三：可以直接响应ModelAndView:内部维护了页面
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("../index.jsp");
//        modelAndView.setViewName("redirect:/index.jsp");
//        modelAndView.setViewName("forward:../index.jspp");

        return modelAndView;
        //方式四：可以直接页面字符串的地址 进行响应(同方式二)


        //小结：二和四是同一种响应方式，如果不指定响应方式。默认是请求转发，也可以指定响应方式





    }
}
