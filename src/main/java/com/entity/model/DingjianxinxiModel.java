package com.entity.model;

import com.entity.DingjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 定检信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public class DingjianxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 设备类型
	 */
	
	private String shebeileixing;
		
	/**
	 * 检查情况
	 */
	
	private String jianchaqingkuang;
		
	/**
	 * 检查时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchashijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备类型
	 */
	 
	public void setShebeileixing(String shebeileixing) {
		this.shebeileixing = shebeileixing;
	}
	
	/**
	 * 获取：设备类型
	 */
	public String getShebeileixing() {
		return shebeileixing;
	}
				
	
	/**
	 * 设置：检查情况
	 */
	 
	public void setJianchaqingkuang(String jianchaqingkuang) {
		this.jianchaqingkuang = jianchaqingkuang;
	}
	
	/**
	 * 获取：检查情况
	 */
	public String getJianchaqingkuang() {
		return jianchaqingkuang;
	}
				
	
	/**
	 * 设置：检查时间
	 */
	 
	public void setJianchashijian(Date jianchashijian) {
		this.jianchashijian = jianchashijian;
	}
	
	/**
	 * 获取：检查时间
	 */
	public Date getJianchashijian() {
		return jianchashijian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
