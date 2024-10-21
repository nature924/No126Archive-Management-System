package com.entity.view;

import com.entity.ShebeileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("shebeileixing")
public class ShebeileixingView  extends ShebeileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeileixingView(){
	}
 
 	public ShebeileixingView(ShebeileixingEntity shebeileixingEntity){
 	try {
			BeanUtils.copyProperties(this, shebeileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
