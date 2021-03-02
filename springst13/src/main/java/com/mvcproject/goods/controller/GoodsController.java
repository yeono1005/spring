package com.mvcproject.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.goods.controller.model.service.GoodsService;
import com.mvcproject.goods.controller.model.vo.Goods;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	// 상품 리스트
	@RequestMapping(value="goodsList.do", method=RequestMethod.GET)
	public ModelAndView goodsList(ModelAndView modelAndView) throws Exception {
		List<Goods> goodsList = goodsService.selectGoodsAll();
		modelAndView.addObject("goodsList", goodsList);
		modelAndView.setViewName("Goods/GoodsList");
		return modelAndView;
	}

	/*
	// 상품 코드 상세페이지 modelAndView
	@RequestMapping(value="goodsView.do", method=RequestMethod.GET)
	public ModelAndView GoodsView(@RequestParam("code") String code, ModelAndView modelAndView) throws Exception {
		Goods goods = goodsService.selectGoods(code);
		modelAndView.addObject("goods", goods);
		modelAndView.setViewName("Goods/GoodsView");
		return modelAndView;
	}
	*/
	
	@RequestMapping(value="goodsView.do", method=RequestMethod.GET)
	public String GoodsView(@RequestParam("code") String code, Model model) throws Exception {
		Goods goods = goodsService.selectGoods(code);
		model.addAttribute("goods", goods);
		return "Goods/GoodsView";
	}
	
	
	// 상품 등록페이지
	@RequestMapping(value="goodsInsert.do", method=RequestMethod.GET)
	public ModelAndView insertGoods(ModelAndView modelAndView) throws Exception {
		modelAndView.setViewName("Goods/GoodsInsert");
		return modelAndView;
	}
	
	// 상품 등록페이지 post
	@RequestMapping(value="goodsInsert.do", method=RequestMethod.POST)
	public ModelAndView insertGoods(Goods goods, ModelAndView modelAndView) throws Exception {
		int cnt = goodsService.insertGoods(goods);
		
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("Goods/GoodsInsertCom");
		return modelAndView;
	}
	
	// 상품 삭제페이지
	@RequestMapping(value="goodsDelete.do", method=RequestMethod.GET)
	public ModelAndView deleteGoods(Goods goods, ModelAndView modelAndView) throws Exception {
		int cnt = goodsService.deleteGoods(goods);
		
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("Goods/GoodsDeleteCom");
		return modelAndView;
	}
	
	// 상품 수정 페이지 get
	@RequestMapping(value="goodsUpdate.do", method=RequestMethod.GET)
	public ModelAndView updateGoods(@RequestParam("code") String code ,ModelAndView modelAndView) throws Exception {
		Goods goods = goodsService.selectGoods(code);
		
		modelAndView.addObject("goods", goods);
		modelAndView.setViewName("Goods/goodsUpdate");
		return modelAndView;
	}
	
	// 상품 수정페이지
	@RequestMapping(value="goodsUpdate.do", method=RequestMethod.POST)
	public ModelAndView updateGoods(Goods goods, ModelAndView modelAndView) throws Exception {

		int cnt = goodsService.updateGoods(goods);

		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("Goods/GoodsUpdateCom");
		return modelAndView;
	}
	
	
	
	
	
}
