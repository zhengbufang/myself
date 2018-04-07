package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
@MapperScan("com.zy.mybatis.mapper")
public class RunClass {
		/**
		 * 提供对第三方Fastjson 的支持
		 * @return
		 */
	   @Bean
	   public HttpMessageConverters fastJsonHttpMessageConverters(){
		      FastJsonHttpMessageConverter fc = new FastJsonHttpMessageConverter();
		      FastJsonConfig fastJsonConfig = new FastJsonConfig();
		      fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		      fc.setFastJsonConfig(fastJsonConfig);
		      HttpMessageConverter<?> converter = fc;
		      return new HttpMessageConverters(converter);
	   }
	
	
       public static void main(String[] args) {
    	   SpringApplication.run(RunClass.class,args);
	}
}
