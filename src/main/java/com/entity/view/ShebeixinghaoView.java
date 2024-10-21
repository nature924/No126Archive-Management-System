package com.entity.view;

import com.entity.ShebeixinghaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备型号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("shebeixinghao")
public class ShebeixinghaoView  extends ShebeixinghaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeixinghaoView(){
	}
 
 	public ShebeixinghaoView(ShebeixinghaoEntity shebeixinghaoEntity){
 	try {
			BeanUtils.copyProperties(this, shebeixinghaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
