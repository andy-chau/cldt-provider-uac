/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：BindAuthVo.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * The class Bind auth vo.
 *
 * @author cldt @gmail.com
 */
@Data
@ApiModel
public class BindAuthVo {
	/**
	 * 包含按钮权限和菜单权限
	 */
	private List<MenuVo> authTree;
	/**
	 * 该角色含有的权限ID
	 */
	private List<Long> checkedAuthList;
}
