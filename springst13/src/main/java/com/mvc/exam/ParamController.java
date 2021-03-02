package com.mvc.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {

	@RequestMapping(value = "/param1.do", method = RequestMethod.GET)
	public ModelAndView param1(@RequestParam(value = "name", required = false, defaultValue = "empty") String name,
		@RequestParam(value = "age", defaultValue = "0") int age, 
		@RequestParam(value = "id", defaultValue = "empty", required = false) String id, ModelAndView modelAndView) throws Exception {
		// @RequestParam("키값")은 주소의(param1.do?name=kim&age=10) 뒤의 키값을 받아오는 것
		// requried = false는 파라미터 필수여부(t/f) 주소의 물음표 뒤에 값이 따로 없어도 실행이 됨
		// defaultValue는 null값이 아니고 empty로 처리됨.
		
		System.out.println("name : "+name+", age : "+age+", id : "+id);
		
		modelAndView.setViewName("param1link");
		
		return modelAndView;
	
	}
	
	@RequestMapping(value = "/param2.do", method = RequestMethod.GET)
	public ModelAndView param2(Goods goods, ModelAndView modelAndView) throws Exception {
		
		System.out.println("code : "+ goods.getCode());
		System.out.println("name : "+ goods.getName());
		System.out.println("price : "+ goods.getPrice());
		System.out.println("color : "+ goods.getColor());
		
		modelAndView.setViewName("form01");
		return modelAndView;

	}
	
	@RequestMapping(value = "/param3.do", method = RequestMethod.GET)
	public ModelAndView param3(Goods2 goods2, ModelAndView modelAndView) throws Exception {
		
		Date date = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		
		System.out.println("ShopNum : " + goods2.ShopNum);
		System.out.println("name : " + goods2.name);
		System.out.println("code : " + goods2.code);
		System.out.println("price: " + goods2.price);
		System.out.println("num :  " + goods2.num);
		System.out.println("date : " + format1.format(date));
		
		modelAndView.setViewName("form02");
		
		return modelAndView;
		
	}
}