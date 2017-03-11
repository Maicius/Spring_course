package com.ttc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ttc.ssm.mapper.ItemsMapper;
import com.ttc.ssm.mapper.ItemsMapperCustom;
import com.ttc.ssm.po.Items;
import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;
import com.ttc.ssm.service.ItemsService;


public class ItemsServiceImpl implements ItemsService{
	
	
	@Autowired
	ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception{
		// TODO Auto-generated method stub
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

}
