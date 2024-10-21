package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 配件采购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("peijiancaigou")
public class PeijiancaigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeijiancaigouEntity() {
		
	}
	
	public PeijiancaigouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 配件名称
	 */
					
	private String peijianmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：配件名称
	 */
	public void setPeijianmingcheng(String peijianmingcheng) {
		this.peijianmingcheng = peijianmingcheng;
	}
	/**
	 * 获取：配件名称
	 */
	public String getPeijianmingcheng() {
		return peijianmingcheng;
	}
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
