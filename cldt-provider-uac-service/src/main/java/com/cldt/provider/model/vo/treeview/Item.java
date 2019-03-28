/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：Item.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo.treeview;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * The class Item.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel
public class Item {

	private Long id;
	/**
	 * 节点的名字
	 */
	private String text;

	/**
	 * 节点的类型："item":文件 "folder":目录
	 */
	private String type;

	/**
	 * 子节点的信息
	 */
	private AdditionalParameters additionalParameters;

}
