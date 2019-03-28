/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UserBindRoleVo.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import com.cldt.provider.model.dto.user.BindRoleDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * The class Role bind user dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel(value = "角色绑定用户")
public class UserBindRoleVo implements Serializable {

	private static final long serialVersionUID = -2521583668470612548L;
	/**
	 * 未绑定的用户集合
	 */
	@ApiModelProperty(value = "所有用户集合")
	private Set<BindRoleDto> allRoleSet;

	/**
	 * 已经绑定的用户集合
	 */
	@ApiModelProperty(value = "已经绑定的用户集合")
	private Set<Long> alreadyBindRoleIdSet;
}
