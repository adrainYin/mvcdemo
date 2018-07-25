package com.ych.controller;

import com.ych.dao.SpittleDao;
import com.ych.unity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/spittle")
public class SpittleController {

    @Autowired
    SpittleDao spittleDao;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String processRegister(){
        return null;
    }

    public String processRegisterWithFlash(Spittle spittle, RedirectAttributes model){

        spittleDao.saveSpittle(spittle);
        model.addAttribute("spittle", spittle);
        model.addFlashAttribute(spittle);
        return "showRegisterWithFlash";
    }
}
