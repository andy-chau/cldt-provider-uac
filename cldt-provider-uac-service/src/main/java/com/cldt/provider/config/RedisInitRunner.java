/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RedisInitRunner.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * The class Redis init runner.
 *
 * @author cldt
 */
@Component
@Order(value = 1)
@Slf4j
public class RedisInitRunner implements CommandLineRunner {

	/**
	 * Run.
	 *
	 * @param args the args
	 */
	@Override
	public void run(String... args) {
		log.info(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111 <<<<<<<<<<<<<");
	}

}