package com.ttc.ssm.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ttc.ssm.controller.validation.ValidGroup1;
import com.ttc.ssm.controller.validation.ValidGroup2;
import com.ttc.ssm.exception.CustomException;
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
	
	// 商品分类
	//itemtypes表示最终将方法返回值放在request中的key
	@ModelAttribute("itemTypes")
	public Map<String,String> getItemTypes() {
		Map<String,String> itemTypes = new HashMap<String,String>();
		itemTypes.put("101", "服装");
		itemTypes.put("102", "家电");
		return itemTypes;
		
	}
	
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
	//如果不使用@RequestParam，要求request传入参数名称和controller方法的形参名称一致，方可绑定成功。
	public String editItems(Model model,HttpServletRequest request, Integer id) throws Exception {
		
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
		
//		//测试异常
//		if(itemsCustom == null) {
//			throw new CustomException("修改的商品信息不存在");
//		}
		
//		model.addAttribute("itemsCustom", itemsCustom);
		//为了测试数据回显的@ModelAttribute("items")，修改为items
		model.addAttribute("items", itemsCustom);
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
	

	
	@RequestMapping("/editItemsSubmit")
	// 在需要校验的pojo前边添加@Validated，在需要校验的pojo后边添加BindingResult
	// bindingResult接收校验出错信息
	// 注意：@Validated和BindingResult bindingResult是配对出现，并且形参顺序是固定的（一前一后）。
	public String editItemsSubmit(Model model,HttpServletRequest request,Integer id,
			@Validated(value={ValidGroup1.class,ValidGroup2.class}) ItemsCustom itemsCustom, 
			BindingResult bindingResult,MultipartFile items_pic) throws Exception {
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors) {
				System.out.println(objectError.getDefaultMessage());
				
			}
			
			// 将错误信息传到页面
			model.addAttribute("allErrors", allErrors);
			
			//可以直接使用model将提交pojo回显到页面
			model.addAttribute("items",itemsCustom);
			
			// 出错重新到商品修改页面
			return "items/editItems";
		}
		//原始名称
		String originalFilename = items_pic.getOriginalFilename();
		if(items_pic !=null && originalFilename !=null && originalFilename.length()>0) {
			//存储图片的物理路径
			String pic_path = "D:\\eclipsejuno2\\springmvc_mybatis_upload01\\temp\\";
			//新的图片名称
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片
			File newFile = new File(pic_path + newFileName);
			
			//将内存的数据写入磁盘
			items_pic.transferTo(newFile);
			
			//将新图片名称写到itemsCustom中
			itemsCustom.setPic(newFileName);
			
			
		}
		itemsService.updateItems(id, itemsCustom);
		
//		return "forward:queryItems.action";
		return "success";
	}
	
//	@RequestMapping("/editItemsSubmit")
//	// 在需要校验的pojo前边添加@Validated，在需要校验的pojo后边添加BindingResult
//	// bindingResult接收校验出错信息
//	// 注意：@Validated和BindingResult bindingResult是配对出现，并且形参顺序是固定的（一前一后）。
//	public String editItemsSubmit(Model model,HttpServletRequest request,Integer id,
//			@ModelAttribute("items") @Validated(value={ValidGroup1.class,ValidGroup2.class}) ItemsCustom itemsCustom, BindingResult bindingResult) throws Exception {
//		if(bindingResult.hasErrors()){
//			List<ObjectError> allErrors = bindingResult.getAllErrors();
//			for(ObjectError objectError:allErrors) {
//				System.out.println(objectError.getDefaultMessage());
//				
//			}
//			
//			// 将错误信息传到页面
//			model.addAttribute("allErrors", allErrors);
//			
//			// 出错重新到商品修改页面
//			return "items/editItems";
//		}
//		itemsService.updateItems(id, itemsCustom);
//		
//
//		return "success";
//	}
	
	//批量删除
	@RequestMapping("/deleteItems")
	public String deleteItems(Integer[] items_id) {
		//调用service方法，删除
		System.out.println("---------deleteItems-----");
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
		return "success";
	}
	
	//根据id查询商品信息，返回json数据
	@RequestMapping("/itemsView/{id}")
	public @ResponseBody ItemsCustom itemsView(@PathVariable("id") Integer id) throws Exception {
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
		return itemsCustom;
	}
}
