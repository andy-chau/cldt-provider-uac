/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：CheckGroupCodeDto.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * The class Check group code dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel
public class CheckGroupCodeDto implements Serializable {

	private static final long serialVersionUID = -7471245927289653237L;
	@ApiModelProperty(value = "组织ID")
	private Long groupId;

	@ApiModelProperty(value = "组织code")
	private String groupCode;
}
