package com.ttc.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;



public interface ItemsDao {
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	
	public ItemsCustom findItemsById(Integer id) throws Exception;
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception;
}
