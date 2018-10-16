package com.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class TestController {
    private static  final Logger LOGGER = LogManager.getLogger(TestController.class);
    @RequestMapping(value="test.do",method = RequestMethod.GET)
    public ModelAndView toTest(HttpServletRequest request){
        ModelAndView result = new ModelAndView();
        LOGGER.info("我爱北京天安门");
        result.setViewName("hello");
        return result;
    }
}
