/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：ZtreeAuthTypeEnum.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.enums;


/**
 * The enum Ztree auth type enum.
 *
 * @author cldt
 */
public enum ZtreeAuthTypeEnum {
	/**
	 * 菜单
	 */
	MENU("MENU", "菜单"),
	/**
	 * 按钮
	 */
	BUTTON("BUTTON", "按钮");

	/**
	 * The Type.
	 */
	String type;
	/**
	 * The Name.
	 */
	String name;

	ZtreeAuthTypeEnum(String type, String name) {
		this.type = type;
		this.name = name;
	}

	/**
	 * Gets type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets name.
	 *
	 * @param type the type
	 *
	 * @return the name
	 */
	public static String getName(String type) {
		for (ZtreeAuthTypeEnum ele : ZtreeAuthTypeEnum.values()) {
			if (type.equals(ele.getType())) {
				return ele.getName();
			}
		}
		return null;
	}

	/**
	 * Gets enum.
	 *
	 * @param type the type
	 *
	 * @return the enum
	 */
	public static ZtreeAuthTypeEnum getEnum(String type) {
		for (ZtreeAuthTypeEnum ele : ZtreeAuthTypeEnum.values()) {
			if (type.equals(ele.getType())) {
				return ele;
			}
		}
		return ZtreeAuthTypeEnum.MENU;
	}
}
