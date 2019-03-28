/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RedisSetServiceImpl.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service.impl;

import com.cldt.provider.service.RedisSetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * The class Redis set service.
 *
 * @author cldt@gmail.com
 */
@Slf4j
@Service
public class RedisSetServiceImpl implements RedisSetService {
	@Resource
	private StringRedisTemplate rt;

	@Override
	public Set<String> getAllValue(String key) {
		Set<String> result;
		SetOperations<String, String> setOps = rt.opsForSet();
		result = setOps.members(key);
		log.info("getAllValue - 根据key获取元素. [OK] key={}, value={}", key, result);
		return result;
	}

	@Override
	public Long add(String key, String... value) {
		SetOperations<String, String> setOps = rt.opsForSet();
		Long result = setOps.add(key, value);
		log.info("add - 向key里面添加元素, key={}, value={}, result={}", key, value, result);
		return result;
	}

	@Override
	public Long remove(String key, String... value) {
		SetOperations<String, String> setOps = rt.opsForSet();
		Long result = setOps.remove(key, (Object) value);
		log.info("remove - 根据key移除元素, key={}, value={}, result={}", key, value, result);
		return result;
	}
}
