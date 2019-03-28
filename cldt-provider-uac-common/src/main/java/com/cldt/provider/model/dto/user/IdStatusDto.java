/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：IdStatusDto.java

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
 * The class Id status dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel
public class IdStatusDto implements Serializable {
	private static final long serialVersionUID = -1976690893998068416L;

	@ApiModelProperty(value = "用户ID", required = true)
	private Long id;
	@ApiModelProperty(value = "推送状态", required = true)
	private Integer status;
}
