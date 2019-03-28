/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacTokenMainController.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.admin;

import com.github.pagehelper.PageInfo;
import com.cldt.common.core.support.BaseController;
import com.cldt.provider.model.dto.token.TokenMainQueryDto;
import com.cldt.provider.service.UacUserTokenService;
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
 * token主页面.
 *
 * @author cldt @gmail.com
 */
@RestController
@RequestMapping(value = "/token", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Web - UacTokenMainController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacTokenMainController extends BaseController {

	@Resource
	private UacUserTokenService uacUserTokenService;

	/**
	 * 分页查询角色信息.
	 *
	 * @param token the token
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/queryListWithPage")
	@ApiOperation(httpMethod = "POST", value = "查询在线用户列表")
	public Wrapper queryUacActionListWithPage(@ApiParam(name = "token") @RequestBody TokenMainQueryDto token) {
		logger.info("查询在线用户列表. token={}", token);
		PageInfo pageInfo = uacUserTokenService.listTokenWithPage(token);
		return WrapMapper.ok(pageInfo);
	}
}
