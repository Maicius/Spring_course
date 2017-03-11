package com.ttc.ssm.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ttc.ssm.dao.ItemsDao;
import com.ttc.ssm.po.ItemsCustom;
import com.ttc.ssm.po.ItemsQueryVo;

@Repository("itemsDao")
public class ItemsDaoImpl implements ItemsDao{
	
	private static List<ItemsCustom> itemList = null;
	
	static{
		itemList = new ArrayList<ItemsCustom>();

		itemList.add(new ItemsCustom(1,"冰箱", 5000.0f, "D://io",new Date(),"冰箱质量好价格低" ));
		itemList.add(new ItemsCustom(2,"洗衣机", 2000.0f, "D://io",new Date(),"洗衣机质量好价格低" ));
		itemList.add(new ItemsCustom(3,"笔记本电脑", 8000.0f, "D://io",new Date(),"笔记本电脑质量好价格低" ));
		itemList.add(new ItemsCustom(4,"空调", 2000.0f, "D://io",new Date(),"空调质量好价格低" ));
		itemList.add(new ItemsCustom(5,"彩电", 6000.0f, "D://io",new Date(),"彩电质量好价格低" ));
	}
	
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception{
		
		ItemsCustom itemsCustom = itemsQueryVo.getItemsCustom();
		//无条件查询
		if(itemsCustom == null) 
			return itemList;
		else { //根据名字查询
			List<ItemsCustom> itemList2 = new ArrayList<ItemsCustom>();
			String name = itemsCustom.getName();
			if("".equals(name)) {
				return itemList;
			} else {
				
				for(ItemsCustom itemsCustom2: itemList) {
					ItemsCustom items = getItems(itemsCustom2,name);
					if(items != null) {
						itemList2.add(itemsCustom2);
					}
					
				}
			}
		return itemList2;
		}
	}
	
	//根据商品名字查找商品对象
	public ItemsCustom getItems(ItemsCustom itemsCustom,String name) {
		if(itemsCustom.getName().equals(name)) {
			return itemsCustom;
		} else {
			return null;
		}
	}
	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		
		ItemsCustom itemsCustom = itemList.get(id-1);
		
		return itemsCustom;
	}
	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
				
		itemList.set(id-1, itemsCustom);
	}

}
