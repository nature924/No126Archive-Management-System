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
 * 配件信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-21 20:47:16
 */
@TableName("peijianxinxi")
public class PeijianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeijianxinxiEntity() {
		
	}
	
	public PeijianxinxiEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 配件简介
	 */
					
	private String peijianjianjie;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
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
