/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacRoleMapper.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.mapper;

import com.cldt.common.core.mybatis.MyMapper;
import com.cldt.provider.model.domain.UacRole;
import com.cldt.provider.model.dto.role.BindUserDto;
import com.cldt.provider.model.vo.RoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac role mapper.
 *
 * @author cldt
 */
@Mapper
@Component
public interface UacRoleMapper extends MyMapper<UacRole> {
	/**
	 * Find by role code uac role.
	 *
	 * @param roleCode the role code
	 *
	 * @return the uac role
	 */
	UacRole findByRoleCode(String roleCode);

	/**
	 * Query role list with page list.
	 *
	 * @param role the role
	 *
	 * @return the list
	 */
	List<RoleVo> queryRoleListWithPage(UacRole role);

	/**
	 * Select all role info by user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<UacRole> selectAllRoleInfoByUserId(Long userId);

	/**
	 * Select role list list.
	 *
	 * @param uacRole the uac role
	 *
	 * @return the list
	 */
	List<UacRole> selectRoleList(UacRole uacRole);

	/**
	 * Batch delete by id list int.
	 *
	 * @param idList the id list
	 *
	 * @return the int
	 */
	int batchDeleteByIdList(@Param("idList") List<Long> idList);

	/**
	 * Select all need bind user list.
	 *
	 * @param superManagerRoleId the super manager role id
	 * @param currentUserId      the current user id
	 *
	 * @return the list
	 */
	List<BindUserDto> selectAllNeedBindUser(@Param("superManagerRoleId") Long superManagerRoleId, @Param("currentUserId") Long currentUserId);
}