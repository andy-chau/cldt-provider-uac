/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UserRegisterDto.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * The class User register dto.
 *
 * @author cldt
 */
@Data
@ApiModel(value = "用户注册Dto")
public class UserRegisterDto implements Serializable {

	private static final long serialVersionUID = -8019925037057525804L;
	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "登录名")
	private String loginName;
	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String mobileNo;

	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String loginPwd;

	/**
	 * 确认密码
	 */
	@ApiModelProperty(value = "确认密码")
	private String confirmPwd;

	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱")
	private String email;

	/**
	 * 注册token
	 */
	@ApiModelProperty(value = "注册渠道")
	private String registerSource;
}
