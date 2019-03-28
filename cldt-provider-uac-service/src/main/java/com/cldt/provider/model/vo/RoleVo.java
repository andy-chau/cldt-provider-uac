/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RoleVo.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import com.cldt.base.dto.BaseVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The class Role vo.
 *
 * @author cldt @gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleVo extends BaseVo {

	private static final long serialVersionUID = 3819529748816533170L;

	/**
	 * 角色编码
	 */
	private String roleCode;

	private String roleName;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 备注
	 */
	private String remark;
}