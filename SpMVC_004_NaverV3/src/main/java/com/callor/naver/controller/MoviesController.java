package com.callor.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/movie")
public class MoviesController {
	
	@RequestMapping(value= {"/",""})
	public String home() {
		return null;
	}
	@RequestMapping(value="/list")
	public String list() {
		return null;
	}

}
