package com.entity.vo;

import com.entity.PeijiancaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 配件采购
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
public class PeijiancaigouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 配件类型
	 */
	
	private String peijianleixing;
		
	/**
	 * 客户编号
	 */
	
	private String kehubianhao;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 采购价格
	 */
	
	private Float caigoujiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 总额
	 */
	
	private String zonge;
		
	/**
	 * 采购日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigouriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：客户编号
	 */
	 
	public void setKehubianhao(String kehubianhao) {
		this.kehubianhao = kehubianhao;
	}
	
	/**
	 * 获取：客户编号
	 */
	public String getKehubianhao() {
		return kehubianhao;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：采购价格
	 */
	 
	public void setCaigoujiage(Float caigoujiage) {
		this.caigoujiage = caigoujiage;
	}
	
	/**
	 * 获取：采购价格
	 */
	public Float getCaigoujiage() {
		return caigoujiage;
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
	 * 设置：总额
	 */
	 
	public void setZonge(String zonge) {
		this.zonge = zonge;
	}
	
	/**
	 * 获取：总额
	 */
	public String getZonge() {
		return zonge;
	}
				
	
	/**
	 * 设置：采购日期
	 */
	 
	public void setCaigouriqi(Date caigouriqi) {
		this.caigouriqi = caigouriqi;
	}
	
	/**
	 * 获取：采购日期
	 */
	public Date getCaigouriqi() {
		return caigouriqi;
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
