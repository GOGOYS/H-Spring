package com.callor.school.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.service.StudentService;

import lombok.extern.slf4j.Slf4j;

/*
 * private static final Logger log =
 * LoggerFactory.getLogger(HomeController.class);
 * 클래스에 @slf4j를 부착해서 다음코드를 lombok이 대신 만들어준다.
 */
@Slf4j
@Controller
public class HomeController {
	
	/*
	 * 생성자 주입방식
	 * HomeController homeController = new HomeController(stService);
	 * 
	 */
	private final  StudentService stService;
	public HomeController(StudentService stService) {
		this.stService = stService;
	}
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		log.trace("Hello");
		log.debug("Hello");
		log.info("Hello");
		log.warn("hello");
		log.error("Hello");
		
		return "home";
	}
	
}
