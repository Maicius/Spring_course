package com.ttc.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ttc.ssm.po.Items;
import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		//调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
		itemsList = itemsService.findItemsList(null);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
	}
	
	@RequestMapping("/editItems")
	public ModelAndView editItems() throws Exception {
		ItemsCustom itemsCustom = itemsService.findItemsById(1);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsCustom", itemsCustom);
		modelAndView.setViewName("/items/editItems");
		return modelAndView;
	}
	
	@RequestMapping("/editItemsSubmit")
	public ModelAndView editItemsSubmit() throws Exception {
//		itemsService.updateItems(id, itemsCustom);
		ModelAndView modelAndView = new ModelAndView();
	
		modelAndView.setViewName("success");
		return modelAndView;
	}
}
