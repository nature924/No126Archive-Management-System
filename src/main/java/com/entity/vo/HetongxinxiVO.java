package com.entity.vo;

import com.entity.HetongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 合同信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public class HetongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 合同名称
	 */
	
	private String hetongmingcheng;
		
	/**
	 * 甲方
	 */
	
	private String jiafang;
		
	/**
	 * 乙方
	 */
	
	private String yifang;
		
	/**
	 * 总额
	 */
	
	private Float zonge;
		
	/**
	 * 合同文件
	 */
	
	private String hetongwenjian;
		
	/**
	 * 签订日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandingriqi;
		
	/**
	 * 合同内容
	 */
	
	private String hetongneirong;
		
	/**
	 * 有效期
	 */
	
	private String youxiaoqi;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：合同名称
	 */
	 
	public void setHetongmingcheng(String hetongmingcheng) {
		this.hetongmingcheng = hetongmingcheng;
	}
	
	/**
	 * 获取：合同名称
	 */
	public String getHetongmingcheng() {
		return hetongmingcheng;
	}
				
	
	/**
	 * 设置：甲方
	 */
	 
	public void setJiafang(String jiafang) {
		this.jiafang = jiafang;
	}
	
	/**
	 * 获取：甲方
	 */
	public String getJiafang() {
		return jiafang;
	}
				
	
	/**
	 * 设置：乙方
	 */
	 
	public void setYifang(String yifang) {
		this.yifang = yifang;
	}
	
	/**
	 * 获取：乙方
	 */
	public String getYifang() {
		return yifang;
	}
				
	
	/**
	 * 设置：总额
	 */
	 
	public void setZonge(Float zonge) {
		this.zonge = zonge;
	}
	
	/**
	 * 获取：总额
	 */
	public Float getZonge() {
		return zonge;
	}
				
	
	/**
	 * 设置：合同文件
	 */
	 
	public void setHetongwenjian(String hetongwenjian) {
		this.hetongwenjian = hetongwenjian;
	}
	
	/**
	 * 获取：合同文件
	 */
	public String getHetongwenjian() {
		return hetongwenjian;
	}
				
	
	/**
	 * 设置：签订日期
	 */
	 
	public void setQiandingriqi(Date qiandingriqi) {
		this.qiandingriqi = qiandingriqi;
	}
	
	/**
	 * 获取：签订日期
	 */
	public Date getQiandingriqi() {
		return qiandingriqi;
	}
				
	
	/**
	 * 设置：合同内容
	 */
	 
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
				
	
	/**
	 * 设置：有效期
	 */
	 
	public void setYouxiaoqi(String youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	
	/**
	 * 获取：有效期
	 */
	public String getYouxiaoqi() {
		return youxiaoqi;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
