package com.mvc.exam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // 사용자의 명령을 입력 받아 매핑되는 메소드를 실행하는 클래스 mapping value가 겹치면 안된다. method도 겹치면 안된다.
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);	// logger log 출력
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView modelAndView) {
		// ModelAndView 데이터, view 위치를 저장하는 객체
		// Model 데이터만 저장하는 객체
		logger.debug("index 실행");
		
		modelAndView.addObject("myMessage","spring 첫 테스트"); // setAttribute와 비슷하게 생각하면 된다.
		//modelAndView.setViewName("mapping할 jsp 위치 파일명");
		modelAndView.setViewName("layout2");
		
		//modelAndView.addObject("myMessage","index페이지");
		return modelAndView;
	}
	
}