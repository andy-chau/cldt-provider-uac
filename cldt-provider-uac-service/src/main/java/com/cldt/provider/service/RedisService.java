/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RedisService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

import java.util.concurrent.TimeUnit;

/**
 * The interface Redis service.
 *
 * @author cldt
 */
public interface RedisService {

	/**
	 * Gets key.
	 *
	 * @param key the key
	 *
	 * @return the key
	 */
	String getKey(String key);

	/**
	 * Delete key.
	 *
	 * @param key the key
	 */
	void deleteKey(String key);

	/**
	 * Sets key.
	 *
	 * @param key   the key
	 * @param value the value
	 */
	void setKey(String key, String value);

	/**
	 * Sets key.
	 *
	 * @param key     the key
	 * @param value   the value
	 * @param timeout the timeout
	 * @param unit    the unit
	 */
	void setKey(String key, String value, final long timeout, final TimeUnit unit);
}
