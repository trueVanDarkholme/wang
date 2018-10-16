package com.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.controller.TestController;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {
    private static  final Logger LOGGER = LogManager.getLogger(TestController.class);
    public void toTest2(){
        LOGGER.info("我爱北京天安门");
    }
}
