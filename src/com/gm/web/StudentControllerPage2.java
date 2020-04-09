package com.gm.web;

import com.gm.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 陈琳
 * @date 2020/3/30 10:59
 */

@Controller
@RequestMapping(StudentControllerPage2.BASE_CONTROLLER)
public class StudentControllerPage2 {
    //字符串常量的提取
    public static final String BASE_CONTROLLER = "/studentControllerPage2";
    public static final String INDEX_PAGE = "../index.jsp";

    @RequestMapping("/getData")
    public String getData(@ModelAttribute("student1") Student student1,
                          @ModelAttribute()
                                  HttpServletRequest request, HttpServletResponse response, Model model, ModelMap modelMap) {

        // 1 直接使用servletapi实现模拟数据响应
//       request.setAttribute("name1","name1");
//       request.getSession().setAttribute("name2","name2");
//       return INDEX_PAGE;


        // 2  借助ModelAndView
//       ModelAndView modelAndView=new ModelAndView();
//       modelAndView.setViewName(INDEX_PAGE);
//       modelAndView.addObject("name1",new Student(1,"a","a"));
//       modelAndView.addObject("name2",new Student(2,"b","b"));
//       return modelAndView;

        // 3 使用Model 和ModelMap
        model.addAttribute("name1", "mmmmm");
        modelMap.addAttribute("name2", "mpmpmp");
        modelMap.put("name3", "putput");


        //4 使用@modelattribute注解
        // 方法形参得响应方式   引用数据可以实现 但是基本类型只能响应原本得参数
        student1.setId(77);
        student1.setUsername("老王");

        return INDEX_PAGE;

    }

    //5 数据响应   通过返回值直接响应数到客户端 无需响应视图
    @RequestMapping("/getData2")
    @ResponseBody
    public String getData2() {
        // 如果是争对客户端得Ajax请求，需要给予数据响应

        // 1 直接响应字符串
//        return "java是世界上最好得语言";

        // 2 直接响应引用对象
//
//        Student student=new Student(2,"22","222");
//        return student;

        // 3 直接响应集合
//        Student student = new Student(2, "22", "222");
//        Student student1 = new Student(3, "33", "333");
//        Student student2 = new Student(4, "44", "444");
//        List<Student> list = new ArrayList();
//        list.add(student);
//        list.add(student1);
//        list.add(student2);
//        return list;

        // 4 直接响应json字符串


        String jsonStr = "{\"id\":2,\"username\":\"隔壁老沈\",\"age\" :\"20\"}";
        return jsonStr;


    }

}
