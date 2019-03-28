/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RedisSetService.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

import java.util.Set;

/**
 * The interface Redis set service.
 *
 * @author cldt@gmail.com
 */
public interface RedisSetService {
	/**
	 * 返回集合中的所有成员
	 *
	 * @param key the key
	 *
	 * @return the all value
	 */
	Set<String> getAllValue(String key);

	/**
	 * 向集合添加一个或多个成员
	 *
	 * @param key   the key
	 * @param value the value
	 *
	 * @return the long
	 */
	Long add(String key, String... value);

	/**
	 * 移除集合中一个或多个成员
	 *
	 * @param key   the key
	 * @param value the value
	 *
	 * @return the long
	 */
	Long remove(String key, String... value);

}
