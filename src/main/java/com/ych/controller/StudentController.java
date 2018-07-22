package com.ych.controller;


import com.ych.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//定义控制器，由dispatcher分发请求并交给控制器拦截
@Controller
@RequestMapping("/student")//单纯地拦截请求
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/getStudentInfo", method = RequestMethod.GET)
    public String getStudentInfo(Model model){
        //返回model和新的url跳转地址
        model.addAttribute("students", studentService.getStudentList());
        return "showStudentInfo";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String StudentInfoRegister(){
        return "registerForm";
    }
}
