package com.mvcproject.goods.controller.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcproject.goods.controller.model.dao.GoodsDAO;
import com.mvcproject.goods.controller.model.vo.Goods;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsDAO goodsDAO;

	@Override
	public List<Goods> selectGoodsAll() throws Exception {
		List<Goods> goodsList = goodsDAO.selectGoodsAll();
		return goodsList;
	}
	
	@Override
	public Goods selectGoods(String code) throws Exception {
		Goods goods = goodsDAO.selectGoods(code);
		return goods;
	}
	
	@Override
	public int deleteGoods(Goods goods) throws Exception {
		int cnt = goodsDAO.deleteGoods(goods);
		return cnt;
	}
	
	@Override
	public int insertGoods(Goods goods) throws Exception {
		int cnt = goodsDAO.insertGoods(goods);
		return cnt;
	}
	
	@Override
	public int updateGoods(Goods goods) throws Exception {
		int cnt = goodsDAO.updateGoods(goods);
		return cnt;
	}
}
