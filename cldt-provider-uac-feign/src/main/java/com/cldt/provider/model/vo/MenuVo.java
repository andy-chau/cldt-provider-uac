/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：MenuVo.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The class Menu vo.
 *
 * @author cldt
 */
@Data
@ApiModel("菜单")
public class MenuVo implements Serializable {
	/**
	 * serialVersionUID:用一句话描述这个变量表示什么.
	 *
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -2099147126084213856L;

	/**
	 * menu.id;
	 */
	@ApiModelProperty("菜单编号")
	private Long id;

	/**
	 * 父id
	 */
	@ApiModelProperty("父id")
	private Long pid;

	/**
	 * 菜单编码
	 */
	@ApiModelProperty("菜单编码")
	private String menuCode;

	/**
	 * 菜单名称
	 */
	@ApiModelProperty("菜单名称")
	private String menuName;

	/**
	 * 菜单URL
	 */
	@ApiModelProperty("菜单URL")
	private String url;
	/**
	 * 图标
	 */
	@ApiModelProperty("图标")
	private String icon;

	/**
	 * 序号
	 */
	@ApiModelProperty("序号")
	private String number;

	/**
	 * 备注(研发中心)
	 */
	@ApiModelProperty("备注(研发中心)")
	private String remark;

	/**
	 * 删除标识
	 */
	@ApiModelProperty("删除标识")
	private Short yn;
	private MenuVo parentMenu;

	private List<MenuVo> subMenu;

	private boolean hasMenu = false;

}