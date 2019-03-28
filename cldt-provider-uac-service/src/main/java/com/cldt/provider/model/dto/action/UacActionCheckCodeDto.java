/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacActionCheckCodeDto.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.action;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;


/**
 * The class Uac menu check code dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel(value = "UacActionCheckCodeDto")
public class UacActionCheckCodeDto implements Serializable {
	private static final long serialVersionUID = 8687848883145768024L;
	/**
	 * 权限的id
	 */
	@ApiModelProperty(value = "权限的id")
	private Long actionId;
	/**
	 * 权限的url
	 */
	@ApiModelProperty(value = "权限编码")
	@NotBlank(message = "权限编码不能为空")
	private String actionCode;


}
