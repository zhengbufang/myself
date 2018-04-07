package com.zy.tboot.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
   
	@Bean
	public RemoteIpFilter remoteIpFilter(){
		return new RemoteIpFilter();
	}
	@Bean
	public FilterRegistrationBean testFilter(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
		List<String> list = new ArrayList<String>();
		list.add("/*");
		registration.setFilter(new MyFilter());
		registration.setUrlPatterns(list);
		registration.addInitParameter("zy","zby");
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}
	public class MyFilter implements Filter{

		@Override
		public void destroy() {
		}

		@Override
		public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) srequest;
			System.out.println("this is MyFilter,url :"+request.getRequestURI());
			filterChain.doFilter(srequest, sresponse);
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			
		}
		
	}
} 
