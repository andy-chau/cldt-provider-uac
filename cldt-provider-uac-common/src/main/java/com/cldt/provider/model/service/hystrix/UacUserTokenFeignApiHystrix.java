/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacUserTokenFeignApiHystrix.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.service.hystrix;


import org.springframework.stereotype.Component;

import com.cldt.provider.model.service.UacUserTokenFeignApi;
import com.cldt.utils.wrapper.Wrapper;

/**
 * The class Uac user token feign api hystrix.
 *
 * @author cldt
 */
@Component
public class UacUserTokenFeignApiHystrix implements UacUserTokenFeignApi {

	@Override
	public Wrapper<Integer> updateTokenOffLine() {
		return null;
	}
}
