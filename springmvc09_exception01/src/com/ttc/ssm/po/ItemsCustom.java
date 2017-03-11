package com.ttc.ssm.po;

import java.util.Date;


public class ItemsCustom extends Items {
	
	public ItemsCustom(){
		
	}
	//添加商品信息的扩展属性
	public ItemsCustom(Integer id,String name,Float price,String pic,Date createTime,String detail){
		super(id,name,price,pic,createTime,detail);
    }

}
