/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacLogMainController.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.admin;

import com.github.pagehelper.PageInfo;
import com.cldt.common.core.support.BaseController;
import com.cldt.provider.model.dto.log.UacLogMainDto;
import com.cldt.provider.service.UacLogService;
import com.cldt.utils.wrapper.WrapMapper;
import com.cldt.utils.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 日志管理.
 *
 * @author cldt@gmail.com
 */
@RestController
@RequestMapping(value = "/log", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Web - UacLogMainController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacLogMainController extends BaseController {
	@Resource
	private UacLogService uacLogService;

	/**
	 * 查询日志列表.
	 *
	 * @param uacLogQueryDtoPage the uac log query dto page
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/queryListWithPage")
	@ApiOperation(httpMethod = "POST", value = "查询日志列表")
	public Wrapper queryLogListWithPage(@ApiParam(name = "uacLogQueryDtoPage", value = "日志查询条件") @RequestBody UacLogMainDto uacLogQueryDtoPage) {
		logger.info("查询日志处理列表 uacLogQueryDtoPage={}", uacLogQueryDtoPage);
		PageInfo pageInfo = uacLogService.queryLogListWithPage(uacLogQueryDtoPage);
		return WrapMapper.ok(pageInfo);
	}
}
