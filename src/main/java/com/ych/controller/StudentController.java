package com.ych.controller;


import com.ych.exception.SpittleNotFoundException;
import com.ych.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

    @RequestMapping(value = "/showRegisterInform",method = RequestMethod.GET)
    public String showStudentRegisterInform(){
        return "registerInform";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showStudentInfo(){
        //System.out.println();
        return null;
    }

    /**
     * 该注解定义了对错误的统一处理，里面的参数是错误的类型，定义了该注解后，任何执行了该异常处理的程序都会执行该方法
     * 并返回一个统一的逻辑视图。
     * 该方法中也可以定义模型数据。
     * @return 返回统一的逻辑视图，由视图解析器解析后映射到.jsp中
     */
    @ExceptionHandler(SpittleNotFoundException.class)
    public String handleException(){
        return "error";
    }


}
