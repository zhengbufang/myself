package com.zy.tboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.tboot.databse.ZBY;

@Service
public class ZBYService {
       @Autowired
	   private ZBYMapper zbyMapper;
        
       public void save(ZBY zby){ 
    	      if(null != zbyMapper){
    	    	  zbyMapper.save(zby);
    	      }
       }
}
