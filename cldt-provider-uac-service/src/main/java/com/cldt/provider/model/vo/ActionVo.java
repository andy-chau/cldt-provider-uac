/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：ActionVo.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import com.cldt.base.dto.BaseVo;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The class Action vo.
 *
 * @author cldt @gmail.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel
public class ActionVo extends BaseVo {
	private static final long serialVersionUID = 2019306004446193459L;
	/**
	 * 资源路径
	 */
	private String url;

	/**
	 * 权限名称
	 */
	private String actionName;

	/**
	 * 权限
	 */
	private String actionCode;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 菜单ID
	 */
	private Long menuId;

	/**
	 * 菜单名称
	 */
	private String menuName;
}
