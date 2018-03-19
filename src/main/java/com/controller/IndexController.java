package com.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IndexController {

	private	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
    @RequestMapping("index")
    public String index() {
    	
    	 logger.debug("This is a debug message");  
         logger.info("This is an info message");  
         logger.warn("This is a warn message");  
         logger.error("This is an error message");  
        return "hello world!";
    }
}
