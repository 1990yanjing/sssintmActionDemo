package com.wangyan.ssmWebAction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController")
@RequestMapping("/my")
public class MyController {

	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		ModelAndView mView = new ModelAndView();
		mView.setViewName("index");
		return mView;
	}
	
	@RequestMapping("/hehe")
	public String hehe() {
		
		return "hehe";
	}
}
