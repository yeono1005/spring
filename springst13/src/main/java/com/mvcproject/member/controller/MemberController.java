package com.mvcproject.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mvcproject.member.controller.model.dao.MemberDAO;
import com.mvcproject.member.controller.model.service.MemberService;
import com.mvcproject.member.controller.model.vo.Member;

@Controller
public class MemberController {

	@Autowired	// 연결해줌. 굳이 new MemberDAO(); 를 안붙여줘도됨
	MemberService memberService;
	
	// 모든 회원 리스트
	@RequestMapping(value="memberList.do", method=RequestMethod.GET)
	public ModelAndView memberListService(ModelAndView modelAndView) throws Exception {
		
		List<Member> memberList = memberService.selectMemberAll();
		
		/*
		  for(int i=0; i<memberList.size(); i++) { // System.out.println(i); Member
		  member = memberList.get(i); System.out.println(i
		  +"name : "+member.getName());
		  System.out.println("email : "+member.getEmail()); }
		 */
		
		modelAndView.addObject("memberList", memberList);
		
		modelAndView.setViewName("member/memberList");
		
		return modelAndView;
	}
	
	// id만 select
	@RequestMapping(value="memberView.do", method=RequestMethod.GET)
	public String memberViewService(@RequestParam("id") String id ,Model model) throws Exception {
		
		// vo에다가 dao.selectMember()메소드 담아줌
		Member member = memberService.selectMember(id);
		
		model.addAttribute("member",member);
		
		return "member/memberView"; // model은 데이터를 문자열로 반환해야함.
	}
	
	
	// 회원삭제
	@RequestMapping(value="memberDel.do", method=RequestMethod.GET) //@GetMapping("memberDel.do") @PostMapping 으로 쓰이기도 함. @RequestMapping과 동일.
	public ModelAndView deleteMember(Member member, ModelAndView modelAndView) throws Exception {
		
		int cnt = memberService.deleteMember(member);
		
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("member/memberDelComplete");
		
		return modelAndView;
		
	}
	
	// 회원생성(insert) 페이지 띄우는곳
	@RequestMapping(value="memberIns.do", method=RequestMethod.GET)
	public ModelAndView insertMember(ModelAndView modelAndView) throws Exception {
		
		modelAndView.setViewName("member/memberInsert");
		return modelAndView;
		
	}
	
	// 회원생성(insert) 폼에서 오는곳
	@RequestMapping(value="memberIns.do", method=RequestMethod.POST)
	public ModelAndView insertMember(Member member ,ModelAndView modelAndView) throws Exception {

		int cnt = memberService.insertMember(member);
		
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("member/memberInsComplete");
		//modelAndView.setViewName("redirect:memberList.do"); jsp페이지가 아니고 .do 컨트롤러로 가려면
		
		return modelAndView;
	
	}
	
	// 회원수정 페이지 띄우는곳
	@RequestMapping(value="memberUpt.do", method=RequestMethod.GET)
	public ModelAndView updateMember(@RequestParam("id") String id, ModelAndView modelAndView) throws Exception {
		
		Member member = memberService.selectMember(id);
		
		modelAndView.addObject("member", member);
		
		modelAndView.setViewName("member/memberUpdate");
		return modelAndView;
	}
	
	// 회원수정 폼에서 오는 곳
	@RequestMapping(value="memberUpt.do", method=RequestMethod.POST)
	public ModelAndView updateMember(Member member, ModelAndView modelAndView) throws Exception {
		
		int cnt = memberService.updateMember(member);
		
		modelAndView.addObject("cnt", cnt);
		//modelAndView.setViewName("redirect:memberList.do");
		modelAndView.setViewName("member/memberUptComplete");
		
		return modelAndView;
		
	}
	
	
	
}