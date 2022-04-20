package com.callor.app;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 여기는 Controller
 * @Cotroller 클래스에 부착하는 주석
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		//model 객체에 변수명="데이터" 속성을 추가하여 jsp에 렌더링할 데이터를 준비하기
		//model.addAttribute("변수명","데이터");  타입에 관계없다. 아무타입이나 가능.
		model.addAttribute("my_name","홍길동");
		
		String[] st = {"홍길동","이몽룡","성춘향"};
		model.addAttribute("ST",st);
		return "home";
	}
	
}
