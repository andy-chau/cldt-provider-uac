/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacLoginService.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;


import com.cldt.provider.model.dto.user.LoginRespDto;

/**
 * The interface Uac login service.
 *
 * @author cldt@gmail.com
 */
public interface UacLoginService {

	/**
	 * Login after login resp dto.
	 *
	 * @param applicationId the application id
	 *
	 * @return the login resp dto
	 */
	LoginRespDto loginAfter(Long applicationId);

}
