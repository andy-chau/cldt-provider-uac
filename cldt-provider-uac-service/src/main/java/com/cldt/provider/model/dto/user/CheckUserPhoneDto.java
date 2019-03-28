/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：CheckUserPhoneDto.java

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
 * The class Check user phone dto.
 *
 * @author cldt
 */
@Data
@ApiModel(value = "校验用户电话号码唯一性Dto ")
public class CheckUserPhoneDto implements Serializable {

	private static final long serialVersionUID = 3378874756673320539L;
	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	private Long userId;

	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String mobileNo;
}
