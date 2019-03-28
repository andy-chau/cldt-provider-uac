/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacLogMapper.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.mapper;

import com.cldt.common.core.mybatis.MyMapper;
import com.cldt.provider.model.domain.UacLog;
import com.cldt.provider.model.dto.log.UacLogMainDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac log mapper.
 *
 * @author cldt
 */
@Mapper
@Component
public interface UacLogMapper extends MyMapper<UacLog> {
	/**
	 * Select user log list with user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<UacLog> selectUserLogListByUserId(@Param("userId") Long userId);

	/**
	 * Query log list with page list.
	 *
	 * @param uacLogQueryDtoPage the uac log query dto page
	 *
	 * @return the list
	 */
	List<UacLog> queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage);
}