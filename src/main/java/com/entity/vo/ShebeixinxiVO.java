package com.entity.vo;

import com.entity.ShebeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public class ShebeixinxiVO  implements Serializable {
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
	 * 设备型号
	 */
	
	private String shebeixinghao;
		
	/**
	 * 保养日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baoyangriqi;
		
	/**
	 * 定检日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dingjianriqi;
		
	/**
	 * 设备简介
	 */
	
	private String shebeijianjie;
		
	/**
	 * 设备状态
	 */
	
	private String shebeizhuangtai;
				
	
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
	 * 设置：设备型号
	 */
	 
	public void setShebeixinghao(String shebeixinghao) {
		this.shebeixinghao = shebeixinghao;
	}
	
	/**
	 * 获取：设备型号
	 */
	public String getShebeixinghao() {
		return shebeixinghao;
	}
				
	
	/**
	 * 设置：保养日期
	 */
	 
	public void setBaoyangriqi(Date baoyangriqi) {
		this.baoyangriqi = baoyangriqi;
	}
	
	/**
	 * 获取：保养日期
	 */
	public Date getBaoyangriqi() {
		return baoyangriqi;
	}
				
	
	/**
	 * 设置：定检日期
	 */
	 
	public void setDingjianriqi(Date dingjianriqi) {
		this.dingjianriqi = dingjianriqi;
	}
	
	/**
	 * 获取：定检日期
	 */
	public Date getDingjianriqi() {
		return dingjianriqi;
	}
				
	
	/**
	 * 设置：设备简介
	 */
	 
	public void setShebeijianjie(String shebeijianjie) {
		this.shebeijianjie = shebeijianjie;
	}
	
	/**
	 * 获取：设备简介
	 */
	public String getShebeijianjie() {
		return shebeijianjie;
	}
				
	
	/**
	 * 设置：设备状态
	 */
	 
	public void setShebeizhuangtai(String shebeizhuangtai) {
		this.shebeizhuangtai = shebeizhuangtai;
	}
	
	/**
	 * 获取：设备状态
	 */
	public String getShebeizhuangtai() {
		return shebeizhuangtai;
	}
			
}
