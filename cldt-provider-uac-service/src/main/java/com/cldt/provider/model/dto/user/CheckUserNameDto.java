/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：CheckUserNameDto.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * The class Check user name dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel(value = "校验真实姓名唯一性Dto ")
public class CheckUserNameDto implements Serializable {

	private static final long serialVersionUID = 3802825234063017559L;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private Long userId;

	/**
	 * 用户姓名
	 */
	@ApiModelProperty(value = "用户姓名")
	private String userName;
}
