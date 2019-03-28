/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：OpcRpcService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

/**
 * The interface Opc rpc service.
 *
 * @author cldt @gmail.com
 */
public interface OpcRpcService {

	/**
	 * Gets location by id.
	 *
	 * @param addressId the address id
	 *
	 * @return the location by id
	 */
	String getLocationById(String addressId);
}
