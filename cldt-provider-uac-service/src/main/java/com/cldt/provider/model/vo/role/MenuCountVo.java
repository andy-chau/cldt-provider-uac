/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：MenuCountVo.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.vo.role;

import lombok.Data;

/**
 * 一级菜单下绑定子菜单个数
 *
 * @author cldt
 */
@Data
public class MenuCountVo {

	/**
	 * 一级菜单id
	 */
	private Long id;

	/**
	 * 一级菜单名称
	 */
	private String menuName;

	/**
	 * 一级菜单下绑定子菜单个数
	 */
	private int childNum;

	/**
	 * Equals boolean.
	 *
	 * @param obj the obj
	 *
	 * @return the boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else {
			if (obj instanceof MenuCountVo) {
				MenuCountVo m = (MenuCountVo) obj;
				if (m.id.equals(this.id)) {
					return true;
				}
			}

			return false;
		}
	}

	/**
	 * Hash code int.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
