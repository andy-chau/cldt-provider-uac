/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacRoleBindUserController.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.admin;

import com.cldt.base.dto.LoginAuthDto;
import com.cldt.common.core.annotation.LogAnnotation;
import com.cldt.common.core.support.BaseController;
import com.cldt.provider.model.dto.role.RoleBindUserDto;
import com.cldt.provider.model.dto.role.RoleBindUserReqDto;
import com.cldt.provider.service.UacRoleService;
import com.cldt.utils.wrapper.WrapMapper;
import com.cldt.utils.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色绑定用户.
 *
 * @author cldt
 */
@RestController
@RequestMapping(value = "/role", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Web - UacRoleBindUserController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacRoleBindUserController extends BaseController {

	@Resource
	private UacRoleService uacRoleService;

	/**
	 * 角色绑定用户.
	 *
	 * @param roleBindUserReqDto the role bind user req dto
	 *
	 * @return the wrapper
	 */
	@LogAnnotation
	@PostMapping(value = "/bindUser")
	@ApiOperation(httpMethod = "POST", value = "角色绑定用户")
	public Wrapper bindUser(@ApiParam(name = "uacRoleBindUserReqDto", value = "角色绑定用户") @RequestBody RoleBindUserReqDto roleBindUserReqDto) {
		logger.info("roleBindUser={}", roleBindUserReqDto);
		LoginAuthDto loginAuthDto = getLoginAuthDto();
		uacRoleService.bindUser4Role(roleBindUserReqDto, loginAuthDto);
		return WrapMapper.ok();
	}

	/**
	 * 获取角色绑定用户页面数据.
	 *
	 * @param roleId the role id
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/getBindUser/{roleId}")
	@ApiOperation(httpMethod = "POST", value = "获取角色绑定用户页面数据")
	public Wrapper<RoleBindUserDto> getBindUser(@ApiParam(name = "roleId", value = "角色id") @PathVariable Long roleId) {
		logger.info("获取角色绑定用户页面数据. roleId={}", roleId);
		LoginAuthDto loginAuthDto = super.getLoginAuthDto();
		Long currentUserId = loginAuthDto.getUserId();
		RoleBindUserDto bindUserDto = uacRoleService.getRoleBindUserDto(roleId, currentUserId);
		return WrapMapper.ok(bindUserDto);
	}
}
