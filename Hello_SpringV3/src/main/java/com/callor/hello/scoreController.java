package com.callor.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.hello.domain.ScoreVO;

@Controller
public class scoreController {
	
	
	/*
	 * ResponseBody가 붙어있으면 출력되는 그대로 페이지에 뜬다.
	 * ResponseBody가 안붙어있으면 view파일에 있는 같은 이름의 파일이 열림
	 */
	@ResponseBody
	@RequestMapping(value= "/print")
	public String printScore() {
		
		int intKor =100;
		int intEng =100;
		
		int intSum = intKor + intEng;
		
		return intSum + "";
		
	}
	
	// 405-허용되지 않는 메서드
	//RequestMethod.GET이 지정되어 있는게 없어서 브라우저에서 못열어잉
	// get으로 요청했는데 get을 찾을수 없다.
	
//	@RequestMapping(value="/score", method=RequestMethod.GET)
//	public String score() {		
//		return "score";
//	}
	
	// 404-오류
	// score요청과ㅣ 맞는 주소를 찾을 수 없어잉
	//RequestMethod.GET 도 없을 경우
	
	@RequestMapping(value="/score",method=RequestMethod.GET)
	public String score(ScoreVO scoreVO, Model model) {
		model.addAttribute("SCORE",scoreVO);
		return "SCORE";
	}
	
	
	

}
