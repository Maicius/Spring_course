package com.ttc.ssm.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ttc.ssm.dao.ItemsDao;
import com.ttc.ssm.exception.CustomException;


import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;
import com.ttc.ssm.service.ItemsService;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService{
	
	
	@Autowired
	ItemsDao itemsDao;
	
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception{
		
		return itemsDao.findItemsList(itemsQueryVo);
	}
	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		ItemsCustom itemsCustom = null;
		try{
			itemsCustom = itemsDao.findItemsById(id);
		}catch(IndexOutOfBoundsException ex) {
			throw new CustomException("修改的商品信息不存在"); 
		}
		
		return itemsCustom;
	}
	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		
		itemsCustom.setId(id);
		itemsDao.updateItems(id, itemsCustom);
	}

}
