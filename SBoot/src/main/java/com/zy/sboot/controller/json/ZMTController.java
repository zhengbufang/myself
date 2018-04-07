package com.zy.sboot.controller.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZMTController {
       
	   
	   @RequestMapping("/getJSON")
	   ResultBean<Person> getJSON(){
		    Person per = new Person();
		    per.setAge(21);
		    per.setName("郑不凡2");
		    ResultBean<Person> bean = new ResultBean<Person>();
		    List<Person> list = new ArrayList<Person>();
		    list.add(per);
		    bean.setCode(1);
		    bean.setDate(new Date());
		    bean.setMessage("SUCCESS");
		    bean.setResult(list);
		    bean.setSex("man");
		    return bean;
		   
	   }
}
