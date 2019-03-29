/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacUserTokenFeignApi.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.cldt.provider.model.service.hystrix.UacUserTokenFeignApiHystrix;
import com.cldt.security.feign.OAuth2FeignAutoConfiguration;
import com.cldt.utils.wrapper.Wrapper;

/**
 * The interface Uac user token feign api.
 *
 * @author cldt
 */
@FeignClient(value = "cldt-provider-uac-service", configuration = OAuth2FeignAutoConfiguration.class, fallback = UacUserTokenFeignApiHystrix.class)
public interface UacUserTokenFeignApi {

	/**
	 * 超时token更新为离线.
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/api/uac/token/updateTokenOffLine")
	Wrapper<Integer> updateTokenOffLine();
}
