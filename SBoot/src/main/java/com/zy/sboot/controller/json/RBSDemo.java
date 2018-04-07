package com.zy.sboot.controller.json;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RBSDemo {
     
	   @RequestMapping("/test")
	   String getBean(){
		      return "test";
		   
	   }
}
