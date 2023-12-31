package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 社团信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 21:06:36
 */
public class ShetuanxinxiAddActivityItemVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId
	private Long id;


	/**
	 * 社团名称
	 */

	private String shetuanmingcheng;

	/**
	 * 社团类型
	 */
	
	private String shetuanleixing;
		
	/**
	 * 社团图片
	 */
	
	private String shetuantupian;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 社团人数
	 */
	
	private Integer shetuanrenshu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 社团简介
	 */
	
	private String shetuanjianjie;

	/**
	 * 活动个数
	 */
	private String huodonggeshu;


	public String getHuodonggeshu() {
		return huodonggeshu;
	}

	public void setHuodonggeshu(String huodonggeshu) {
		this.huodonggeshu = huodonggeshu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShetuanmingcheng() {
		return shetuanmingcheng;
	}

	public void setShetuanmingcheng(String shetuanmingcheng) {
		this.shetuanmingcheng = shetuanmingcheng;
	}

	/**
	 * 设置：社团类型
	 */
	 
	public void setShetuanleixing(String shetuanleixing) {
		this.shetuanleixing = shetuanleixing;
	}
	
	/**
	 * 获取：社团类型
	 */
	public String getShetuanleixing() {
		return shetuanleixing;
	}
				
	
	/**
	 * 设置：社团图片
	 */
	 
	public void setShetuantupian(String shetuantupian) {
		this.shetuantupian = shetuantupian;
	}
	
	/**
	 * 获取：社团图片
	 */
	public String getShetuantupian() {
		return shetuantupian;
	}
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
				
	
	/**
	 * 设置：社团人数
	 */
	 
	public void setShetuanrenshu(Integer shetuanrenshu) {
		this.shetuanrenshu = shetuanrenshu;
	}
	
	/**
	 * 获取：社团人数
	 */
	public Integer getShetuanrenshu() {
		return shetuanrenshu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：社团简介
	 */
	 
	public void setShetuanjianjie(String shetuanjianjie) {
		this.shetuanjianjie = shetuanjianjie;
	}
	
	/**
	 * 获取：社团简介
	 */
	public String getShetuanjianjie() {
		return shetuanjianjie;
	}



}
