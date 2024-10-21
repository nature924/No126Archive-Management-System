package com.entity.view;

import com.entity.ShebeiweixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备维修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("shebeiweixiu")
public class ShebeiweixiuView  extends ShebeiweixiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeiweixiuView(){
	}
 
 	public ShebeiweixiuView(ShebeiweixiuEntity shebeiweixiuEntity){
 	try {
			BeanUtils.copyProperties(this, shebeiweixiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
