package com.callor.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.school.domain.StudentVO;
import com.callor.school.service.StudentService;

/*
 * Controller level에 @RequestMapping을 설정하면
 * Controller의 mapping과 method의 mapping이 서로 연결되어
 *  RequestMapping을 구현한다.
 *  
 *  localhost:8080/school/student : StudentController의 mapping이 연결
 *  localhost:8080/school/student/list : StudentController#list의 mapping이 연결
 */
@RequestMapping(value="/student")
@Controller
public class StudentController {
	
	/*
	 * Dependency inject 중
	 * 생성자 injection 
	 * 생성자에서 값을 초기화 한다.
	 */
	private final StudentService stService;
	public StudentController(StudentService stService) {
		this.stService = stService;
	}
	
	/*
	 * 매서드는 자신의 type에 맞는 return값을 반환하는데
	 * class 메서드들은 null값도 return할 수 있다.
	 */
	
	/*
	 * return type이 String type인 method의 경우
	 * null 값을 return하면 Request Path와 같은 jsp파일을 찾아서
	 * rendering을 수행한다.
	 * 단, @ResponseBody 설정이 없어야한다.
	 */
	@RequestMapping(value="/list_view", method=RequestMethod.GET)
	public String list(Model model) {
		List<StudentVO> stList = stService.selectAll();
		model.addAttribute("STUDENTS", stList);
		return "student/list_view";
		
	}
	
	@RequestMapping(value="/input", method=RequestMethod.GET)
	public String input() {
		return "/student/input";
		
	}
	@RequestMapping(value="/detail_view", method=RequestMethod.GET)
	public String detail_view() {
		return "/student/detail_view";
		
	}
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update() {
		return null;
		
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete() {
		return null;
		
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail() {
		return "student/detail";
		
	}
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert() {
		return "student/insert";
		
	}
	

	@RequestMapping(value="/list_view2", method=RequestMethod.GET)
	public String list_view2() {
		return "student/list_View2";		
	}


	

}
