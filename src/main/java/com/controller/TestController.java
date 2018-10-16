package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value="test.do",method = RequestMethod.GET)
    public ModelAndView toTest(HttpServletRequest request){
        ModelAndView result = new ModelAndView();
        System.out.println("进入方法了啊!!!");
        result.setViewName("hello");
        return result;
    }
}
