/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UserVo.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.cldt.base.dto.BaseVo;
import com.cldt.provider.model.domain.UacRole;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * The class User vo.
 *
 * @author cldt
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserVo extends BaseVo {

	private static final long serialVersionUID = -5489240986004922469L;

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 工号
	 */
	private String userCode;

	/**
	 * 姓名
	 */
	private String userName;

	/**
	 * 手机号
	 */
	private String mobileNo;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 用户来源
	 */
	private String userSource;

	/**
	 * 操作员类型（1:超级管理员, 0:普通操作员）
	 */
	private String type;

	/**
	 * 最后登录IP地址
	 */
	private String lastLoginIp;

	/**
	 * 最后登录时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastLoginTime;

	/**
	 * 组织名称
	 */
	private String groupName;

	/**
	 * 用户角色信息
	 */
	private Set<UacRole> roles;

	/**
	 * 用户拥有的菜单权限和按钮权限
	 */
	private List<MenuVo> authTree;
}
