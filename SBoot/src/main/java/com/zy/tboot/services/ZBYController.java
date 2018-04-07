package com.zy.tboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zy.tboot.databse.ZBY;

@RestController
public class ZBYController {
       
	   @Autowired
	   ZBYService zBYService;
	    
	   @RequestMapping("/save")
	   String saveZBY(){
		      ZBY zby = new ZBY();
		      zby.setAge(18);
		      zby.setName("鄭不凡");
		      zby.setSex("男");
		      if(null != zBYService){
		    	  zBYService.save(zby);
		    	  return "OK";
		      }
		      return "fail";
	   }
}
