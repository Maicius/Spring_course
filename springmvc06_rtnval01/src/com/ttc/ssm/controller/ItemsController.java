package com.ttc.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ttc.ssm.po.Items;
import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.service.ItemsService;

@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception{
		
		//测试请求转发时，共享request数据
		System.out.println("测试request共享性"+request.getParameter("id"));
		
		//调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
		itemsList = itemsService.findItemsList(null);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("items/itemsList");
		
		return modelAndView;
	}
	
//	@RequestMapping("/editItems")
	//限制http请求方法，可以post和get
	@RequestMapping(value="/editItems",method={RequestMethod.GET,RequestMethod.POST} )
	//controller方法返回string
	public String editItems(Model model) throws Exception {
		ItemsCustom itemsCustom = itemsService.findItemsById(1);

		model.addAttribute("itemsCustom", itemsCustom);
		return "/items/editItems";
	}
	
//	public ModelAndView editItems() throws Exception {
//		ItemsCustom itemsCustom = itemsService.findItemsById(1);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("itemsCustom", itemsCustom);
//		modelAndView.setViewName("/items/editItems");
//		return modelAndView;
//	}
	
	@RequestMapping("/editItemsSubmit")
	//请求转发
		public String editItemsSubmit(HttpServletRequest request) throws Exception {

			return "forward:queryItems.action";
//			return "success";
		}
	//重定向
//	public String editItemsSubmit() throws Exception {
//
//		return "redirect:queryItems.action";
////		return "success";
//	}
	
//	public ModelAndView editItemsSubmit() throws Exception {
//
//		ModelAndView modelAndView = new ModelAndView();
//	
//		modelAndView.setViewName("success");
//		return modelAndView;
//	}
}
