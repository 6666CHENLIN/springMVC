package com.gm.web;

import com.gm.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈琳
 * @date 2020/3/30 10:59
 */

@Controller
@RequestMapping(StudentController.BASE_CONTROLLER)
public class StudentController {
    //字符串常量的提取
    public static final String BASE_CONTROLLER="/studentController";
    public static final String INDEX_PAGE="../index.jsp";


    // 查询：需要传递基本类型的ID
    @RequestMapping(value = "/getStudentById",method = RequestMethod.GET)
    public String getStudentById(int id){

        System.out.println("模拟查询 "+id);
        return INDEX_PAGE;
    }

    @RequestMapping("/addStu")
    public String addStu(Student student){

        System.out.println(student);

        return INDEX_PAGE;

    }

    @RequestMapping("/getStuByIds")
    public String getids(int id[], Student student){
        System.out.println(Arrays.toString(id));
        System.out.println("集合"+student.getSex());

        return INDEX_PAGE;
    }

    //测试与servletapi的成员集成使用
    @RequestMapping("/servletapi")
    public String getServletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println("请求对象"+request);
        System.out.println("session"+request.getSession());
        System.out.println("响应对象"+response);

        System.out.println("其他对象"+session);

        return INDEX_PAGE;

    }

}
