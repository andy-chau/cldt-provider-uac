/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacMqMessageApiHystrix.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.service.hystrix;


import java.util.List;

import org.springframework.stereotype.Component;

import com.cldt.base.dto.MessageQueryDto;
import com.cldt.base.dto.MqMessageVo;
import com.cldt.provider.model.service.UacMqMessageFeignApi;
import com.cldt.utils.wrapper.Wrapper;
import com.github.pagehelper.PageInfo;


/**
 * The class Uac mq message api hystrix.
 *
 * @author cldt @gmail.com
 */
@Component
public class UacMqMessageApiHystrix implements UacMqMessageFeignApi {

	@Override
	public Wrapper<List<String>> queryMessageKeyList(final List<String> messageKeyList) {
		return null;
	}

	@Override
	public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(final MessageQueryDto messageQueryDto) {
		return null;
	}

}
