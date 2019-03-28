/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacGroupStatusEnum.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.enums;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * The enum Uac group status enum.
 *
 * @author cldt@gmail.com
 */
public enum UacGroupStatusEnum {
	/**
	 * 启用
	 */
	ENABLE(0, "启用"),
	/**
	 * 禁用
	 */
	DISABLE(1, "禁用");

	/**
	 * The Status.
	 */
	int status;
	/**
	 * The Value.
	 */
	String value;

	/**
	 * Gets name.
	 *
	 * @param status the status
	 *
	 * @return the name
	 */
	public static String getName(int status) {
		for (UacGroupStatusEnum ele : UacGroupStatusEnum.values()) {
			if (status == ele.getStatus()) {
				return ele.getValue();
			}
		}
		return null;
	}

	UacGroupStatusEnum(int status, String value) {
		this.status = status;
		this.value = value;
	}

	/**
	 * Gets status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Gets value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	private static List<Integer> getStatusList() {
		List<Integer> list = Lists.newArrayList();
		for (UacGroupStatusEnum ele : UacGroupStatusEnum.values()) {
			list.add(ele.getStatus());
		}
		return list;
	}

	/**
	 * Contains boolean.
	 *
	 * @param status the status
	 *
	 * @return the boolean
	 */
	public static boolean contains(Integer status) {
		List<Integer> statusList = getStatusList();
		return statusList.contains(status);
	}
}