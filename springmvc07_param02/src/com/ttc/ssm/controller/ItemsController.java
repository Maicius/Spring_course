package com.ttc.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ttc.ssm.po.Items;
import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;
import com.ttc.ssm.service.ItemsService;

@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public ModelAndView queryItems(HttpServletRequest request,ItemsQueryVo itemsQueryVo) throws Exception{
		//调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
		itemsList = itemsService.findItemsList(itemsQueryVo);

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
	
	public String editItems(Model model,HttpServletRequest request, Integer id) throws Exception {
		
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("itemsCustom", itemsCustom);
//		modelAndView.setViewName("/items/editItems");
//		return modelAndView;

		model.addAttribute("itemsCustom", itemsCustom);
		return "/items/editItems";
	}
	
	//如果不使用@RequestParam，要求request传入参数名称和controller方法的形参名称一致，方可绑定成功。
//	public ModelAndView editItems(HttpServletRequest request,Integer id) throws Exception {
//		
//		
//		ItemsCustom itemsCustom = itemsService.findItemsById(id);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("itemsCustom", itemsCustom);
//		modelAndView.setViewName("/items/editItems");
//		return modelAndView;
//	}
	
//	public ModelAndView editItems() throws Exception {
//		ItemsCustom itemsCustom = itemsService.findItemsById(1);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("itemsCustom", itemsCustom);
//		modelAndView.setViewName("/items/editItems");
//		return modelAndView;
//	}
	
	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit(HttpServletRequest request,Integer id,ItemsCustom itemsCustom) throws Exception {
		itemsService.updateItems(id, itemsCustom);
		
//		return "forward:queryItems.action";
		return "success";
	}
	
	//批量删除
	@RequestMapping("/deleteItems")
	public String deleteItems(Integer[] items_id) {
		//调用service方法，删除
		System.out.println("---------deleteItems-----");
		for(Integer i : items_id) {
			System.out.println("---------items_id-------" +i);
		}
		return "success";
	}
	
	//批量修改查询
	@RequestMapping("/editItemsQuery")
	public ModelAndView editItemsQuery(HttpServletRequest request,ItemsQueryVo itemsQueryVo) throws Exception{
		//调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
		itemsList = itemsService.findItemsList(itemsQueryVo);

		//返回ModelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);
		
		//指定视图

		modelAndView.setViewName("items/editItemsQuery");
		
		return modelAndView;
	}
	
	//批量修改提交
	@RequestMapping("/editItemsAllSubmit")
	public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo) {
		//调用service方法
		System.out.println("---------editItemsAllSubmit-----");
		for(ItemsCustom itemsCustom : itemsQueryVo.getItemsList()) {
			System.out.println("---------itemsCustom-------" +itemsCustom.getName());
		}
		return "success";
	}
}
