/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：ForgetResetPasswordDto.java

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
 * 忘记密码.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel
public class ForgetResetPasswordDto implements Serializable {
	private static final long serialVersionUID = 5478700873789068921L;
	@ApiModelProperty(value = "登录名")
	private String loginName;
	@ApiModelProperty(value = "密码")
	private String loginPwd;
	@ApiModelProperty(value = "邮箱")
	private String email;
	@ApiModelProperty(value = "验证码")
	private String emailCode;
	@ApiModelProperty(value = "token")
	private String forgetToken;
}
