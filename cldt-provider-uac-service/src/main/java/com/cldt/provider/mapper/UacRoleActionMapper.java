/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacRoleActionMapper.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.mapper;

import com.cldt.common.core.mybatis.MyMapper;
import com.cldt.provider.model.domain.UacRoleAction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac role action mapper.
 *
 * @author cldt @gmail.com
 */
@Mapper
@Component
public interface UacRoleActionMapper extends MyMapper<UacRoleAction> {
	/**
	 * Delete by action id int.
	 *
	 * @param actionId the action id
	 *
	 * @return the int
	 */
	int deleteByActionId(@Param("actionId") Long actionId);

	/**
	 * Delete by role id list int.
	 *
	 * @param roleIdList the role id list
	 *
	 * @return the int
	 */
	int deleteByRoleIdList(@Param("roleIdList") List<Long> roleIdList);
}