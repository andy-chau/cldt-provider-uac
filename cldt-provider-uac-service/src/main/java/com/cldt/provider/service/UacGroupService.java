/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacGroupService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;


import com.cldt.base.dto.LoginAuthDto;
import com.cldt.provider.model.domain.UacGroup;
import com.cldt.provider.model.dto.group.GroupBindUserDto;
import com.cldt.provider.model.dto.group.GroupBindUserReqDto;
import com.cldt.provider.model.dto.user.IdStatusDto;
import com.cldt.provider.model.vo.GroupZtreeVo;
import com.cldt.provider.model.vo.MenuVo;
import com.cldt.common.core.support.IService;

import java.util.List;

/**
 * The interface Uac group service.
 *
 * @author cldt
 */
public interface UacGroupService extends IService<UacGroup> {

	/**
	 * Update uac group status by id int.
	 *
	 * @param idStatusDto  the id status dto
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the int
	 */
	int updateUacGroupStatusById(IdStatusDto idStatusDto, LoginAuthDto loginAuthDto);

	/**
	 * Delete uac group by id int.
	 *
	 * @param id the id
	 *
	 * @return the int
	 */
	int deleteUacGroupById(Long id);

	/**
	 * Query by id uac group.
	 *
	 * @param groupId the group id
	 *
	 * @return the uac group
	 */
	UacGroup queryById(Long groupId);

	/**
	 * Gets group tree.
	 *
	 * @param id the id
	 *
	 * @return the group tree
	 */
	List<GroupZtreeVo> getGroupTree(Long id);

	/**
	 * Find current user have group info list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<MenuVo> getGroupTreeListByUserId(Long userId);

	/**
	 * Gets group bind user dto.
	 *
	 * @param groupId the group id
	 * @param userId  the user id
	 *
	 * @return the group bind user dto
	 */
	GroupBindUserDto getGroupBindUserDto(Long groupId, Long userId);

	/**
	 * Bind uac user 4 group int.
	 *
	 * @param groupBindUserReqDto the group bind user req dto
	 * @param loginAuthDto        the login auth dto
	 */
	void bindUacUser4Group(GroupBindUserReqDto groupBindUserReqDto, LoginAuthDto loginAuthDto);

	/**
	 * Save uac group int.
	 *
	 * @param group        the group
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the int
	 */
	int saveUacGroup(UacGroup group, LoginAuthDto loginAuthDto);

	/**
	 * Gets by id.
	 *
	 * @param id the id
	 *
	 * @return the by id
	 */
	UacGroup getById(Long id);
}
