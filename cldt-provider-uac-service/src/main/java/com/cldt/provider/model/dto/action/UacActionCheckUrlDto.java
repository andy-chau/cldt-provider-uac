/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacActionCheckUrlDto.java

 * 联系方式：cldt

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
 * The class Uac menu check url dto.
 *
 * @author cldt
 */
@Data
@ApiModel(value = "UacActionCheckUrlDto")
public class UacActionCheckUrlDto implements Serializable {
	private static final long serialVersionUID = 839437721293973234L;
	/**
	 * 权限的id
	 */
	@ApiModelProperty(value = "权限的id")
	private Long actionId;
	/**
	 * 权限的url
	 */
	@ApiModelProperty(value = "权限地址")
	@NotBlank(message = "权限地址不能为空")
	private String url;


}
