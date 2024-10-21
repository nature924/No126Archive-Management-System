package com.entity.vo;

import com.entity.PeijianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 配件信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public class PeijianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配件类型
	 */
	
	private String peijianleixing;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 生产商
	 */
	
	private String shengchanshang;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 配件简介
	 */
	
	private String peijianjianjie;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：配件类型
	 */
	 
	public void setPeijianleixing(String peijianleixing) {
		this.peijianleixing = peijianleixing;
	}
	
	/**
	 * 获取：配件类型
	 */
	public String getPeijianleixing() {
		return peijianleixing;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：生产商
	 */
	 
	public void setShengchanshang(String shengchanshang) {
		this.shengchanshang = shengchanshang;
	}
	
	/**
	 * 获取：生产商
	 */
	public String getShengchanshang() {
		return shengchanshang;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：配件简介
	 */
	 
	public void setPeijianjianjie(String peijianjianjie) {
		this.peijianjianjie = peijianjianjie;
	}
	
	/**
	 * 获取：配件简介
	 */
	public String getPeijianjianjie() {
		return peijianjianjie;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
