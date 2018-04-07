package com.zy.sboot.controller.json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
/**
 * 在运行类的子包下可以访问
 * @author 郑不凡
 * @date 2017年11月25日下午4:10:55
 * @version 1.0
 */
public class ZMController {
       
	   @RequestMapping("ko")
	   String isOk(){
		      return "of ko";    
	   }
}
