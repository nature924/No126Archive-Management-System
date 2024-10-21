package com.entity.view;

import com.entity.PeijiancaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配件采购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("peijiancaigou")
public class PeijiancaigouView  extends PeijiancaigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeijiancaigouView(){
	}
 
 	public PeijiancaigouView(PeijiancaigouEntity peijiancaigouEntity){
 	try {
			BeanUtils.copyProperties(this, peijiancaigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
