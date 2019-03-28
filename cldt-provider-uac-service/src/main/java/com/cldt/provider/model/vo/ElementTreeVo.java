/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：ElementTreeVo.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The class Element tree vo.
 *
 * @author cldt@gmail.com
 */
@Data
public class ElementTreeVo implements Serializable {
	private static final long serialVersionUID = -7266614376023024646L;

	private String label;

	private List<ElementTreeVo> children;
}
