package com.example.gospo.calculator;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv){
        int result = num1+num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("alien")
    public String alien(){
        return "alien";
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(int aid, String aname, ModelAndView mv){
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);
        mv.addObject("alien", alien);
        mv.setViewName("resultAlien");
        return mv;
    }
}
