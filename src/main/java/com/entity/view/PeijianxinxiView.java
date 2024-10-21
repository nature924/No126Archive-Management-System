package com.entity.view;

import com.entity.PeijianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配件信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("peijianxinxi")
public class PeijianxinxiView  extends PeijianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeijianxinxiView(){
	}
 
 	public PeijianxinxiView(PeijianxinxiEntity peijianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, peijianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
