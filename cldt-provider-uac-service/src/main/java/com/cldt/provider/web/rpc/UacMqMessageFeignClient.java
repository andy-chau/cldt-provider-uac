/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacMqMessageFeignClient.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.rpc;


import com.github.pagehelper.PageInfo;
import com.cldt.base.dto.MessageQueryDto;
import com.cldt.base.dto.MqMessageVo;
import com.cldt.common.core.support.BaseController;
import com.cldt.provider.model.service.UacMqMessageFeignApi;
//import com.cldt.provider.service.MqMessageService;
import com.cldt.utils.wrapper.WrapMapper;
import com.cldt.utils.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Mq 消息.
 *
 * @author cldt @gmail.com
 */
@RestController
@Api(value = "API - UacMqMessageFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacMqMessageFeignClient extends BaseController implements UacMqMessageFeignApi {
//	@Resource
//	private MqMessageService mqMessageService;

	@Override
	@ApiOperation(httpMethod = "POST", value = "查询含有的messageKey")
	public Wrapper<List<String>> queryMessageKeyList(@RequestParam("messageKeyList") List<String> messageKeyList) {
//		logger.info("查询消息KEY. messageKeyList={}", messageKeyList);
//		return WrapMapper.ok(mqMessageService.queryMessageKeyList(messageKeyList));
		return WrapMapper.ok();
	}

	@Override
	public Wrapper<PageInfo<MqMessageVo>> queryMessageListWithPage(@RequestBody MessageQueryDto messageQueryDto) {
//		return mqMessageService.queryMessageListWithPage(messageQueryDto);
		return WrapMapper.ok();
	}
}
