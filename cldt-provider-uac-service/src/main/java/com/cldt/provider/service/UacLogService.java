/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacLogService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;


import com.github.pagehelper.PageInfo;
import com.cldt.base.dto.LoginAuthDto;
import com.cldt.common.core.annotation.OperationLogDto;
import com.cldt.common.core.support.IService;
import com.cldt.provider.model.domain.UacLog;
import com.cldt.provider.model.dto.log.UacLogMainDto;

import java.util.List;

/**
 * The interface Uac log service.
 *
 * @author cldt
 */
public interface UacLogService extends IService<UacLog> {

	/**
	 * Save log int.
	 *
	 * @param uacLog       the uac log
	 * @param loginAuthDto the login auth dto
	 *
	 * @return the int
	 */
	int saveLog(UacLog uacLog, LoginAuthDto loginAuthDto);

	/**
	 * Query user log list with user id list.
	 *
	 * @param userId the user id
	 *
	 * @return the list
	 */
	List<UacLog> selectUserLogListByUserId(Long userId);

	/**
	 * Save operation log integer.
	 *
	 * @param operationLogDto the operation log dto
	 *
	 * @return the integer
	 */
	Integer saveOperationLog(OperationLogDto operationLogDto);

	/**
	 * Query log list with page wrapper.
	 *
	 * @param uacLogQueryDtoPage the uac log query dto page
	 *
	 * @return the wrapper
	 */
	PageInfo queryLogListWithPage(UacLogMainDto uacLogQueryDtoPage);
}
