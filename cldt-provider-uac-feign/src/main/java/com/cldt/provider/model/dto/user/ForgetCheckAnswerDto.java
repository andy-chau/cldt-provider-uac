/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：ForgetCheckAnswerDto.java

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
 * The class Forget check answer dto.
 *
 * @author cldt
 */
@Data
@ApiModel
public class ForgetCheckAnswerDto implements Serializable {
	private static final long serialVersionUID = -4611532562847293450L;
	@ApiModelProperty(value = "登录名")
	private String loginName;
	@ApiModelProperty(value = "问题")
	private String email;
	@ApiModelProperty(value = "答案")
	private String answer;
}
