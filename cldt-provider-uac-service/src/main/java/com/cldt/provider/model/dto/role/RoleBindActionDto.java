/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RoleBindActionDto.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.role;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * The class Grant auth role.
 *
 * @author cldt
 */
@Data
@ApiModel
public class RoleBindActionDto implements Serializable {

	private static final long serialVersionUID = -8589698204017834593L;
	/**
	 * 按钮权限
	 */
	@ApiModelProperty(value = "按钮权限")
	private Set<Long> actionIdList;
	/**
	 * 角色Id
	 */
	@ApiModelProperty(value = "角色Id")
	private Long roleId;
}
