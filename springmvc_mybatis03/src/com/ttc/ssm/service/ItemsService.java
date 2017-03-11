package com.ttc.ssm.service;

import java.util.List;

import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;



public interface ItemsService {
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	public ItemsCustom findItemsById(Integer id) throws Exception;
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception;
}
