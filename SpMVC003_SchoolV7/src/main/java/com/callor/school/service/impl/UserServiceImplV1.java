package com.callor.school.service.impl;

import org.springframework.stereotype.Service;

import com.callor.school.model.UserVO;
import com.callor.school.service.UserService;


//UserServiceImplV1 클래스를 Component(bean)으로 등록하기
//이걸 꼭 붙여야 오류가 안난다>
@Service
public class UserServiceImplV1 implements UserService{

	@Override
	public UserVO login(UserVO userVO) {
		
		String username = userVO.getUsername();
		String password = userVO.getPassword();
		
		if(userVO.getUsername().equalsIgnoreCase("qaz75391")
			&& password.equals("12341234")){
				userVO.setName("홍길동");
				userVO.setRole("ADMIN");
				userVO.setEmail("callor@callor.com");
			}else {
				userVO = null;
			}
		return userVO;
	}

	@Override
	public UserVO join(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
