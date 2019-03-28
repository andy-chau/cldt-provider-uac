/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：CheckGroupNameDto.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.group;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * The class Check group name dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel
public class CheckGroupNameDto {

	@ApiModelProperty(value = "组织ID")
	private Long groupId;

	@ApiModelProperty(value = "组织名称")
	private String groupName;
}
