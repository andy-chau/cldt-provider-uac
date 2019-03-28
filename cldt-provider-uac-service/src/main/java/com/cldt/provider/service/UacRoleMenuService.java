/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacRoleMenuService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

import com.cldt.provider.model.domain.UacRoleMenu;
import com.cldt.common.core.support.IService;

import java.util.List;
import java.util.Set;


/**
 * The interface Uac role menu service.
 *
 * @author cldt @gmail.com
 */
public interface UacRoleMenuService extends IService<UacRoleMenu> {
	/**
	 * Del role menu list int.
	 *
	 * @param uacRoleMenus the uac role menus
	 *
	 * @return the int
	 */
	int delRoleMenuList(Set<UacRoleMenu> uacRoleMenus);

	/**
	 * Delete by role id.
	 *
	 * @param roleId the role id
	 */
	void deleteByRoleId(Long roleId);

	/**
	 * List by role id list.
	 *
	 * @param roleId the role id
	 *
	 * @return the list
	 */
	List<UacRoleMenu> listByRoleId(Long roleId);

	/**
	 * Insert.
	 *
	 * @param roleId     the role id
	 * @param menuIdList the menu id list
	 */
	void insert(Long roleId, Set<Long> menuIdList);

	/**
	 * Delete by role id list.
	 *
	 * @param roleIdList the role id list
	 */
	void deleteByRoleIdList(List<Long> roleIdList);
}
