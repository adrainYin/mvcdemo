package com.ych.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Controller实质上也是一个bean，不过被WebConfig扫描，受DispatcherServlet的管理
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    //定义处理http的请求和请求方式，而且对于请求的解析是通过DisPatcherServlet对所有的Controller遍历处理的结果
    //处理请求的value字段表示请求的路径，和类级别定义的路径拼接而成。而且value可以是数组，用来映射多个请求。
    @RequestMapping(value = "/number{id}", method = RequestMethod.GET)
    //对请求路径的操作要放到方法的参数列表中，用@PathVariable实现
    public String home(@PathVariable("id") long id, Model model){
        model.addAttribute("id", id);
        //对应view去找视图名的映射
        return "hello";    //返回视图名称，这里注意一定要定义字符串的模式。DispatcherServlet会要求视图解析器将逻辑的名称映射成真正的视图。
    }
}
