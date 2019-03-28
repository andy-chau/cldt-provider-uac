/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacMenuMainController.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.admin;

import com.google.common.base.Preconditions;
import com.cldt.base.dto.LoginAuthDto;
import com.cldt.common.core.annotation.LogAnnotation;
import com.cldt.common.core.support.BaseController;
import com.cldt.provider.model.domain.UacMenu;
import com.cldt.provider.model.dto.menu.UacEditMenuDto;
import com.cldt.provider.model.dto.menu.UacMenuStatusDto;
import com.cldt.provider.model.vo.MenuVo;
import com.cldt.provider.model.vo.ViewMenuVo;
import com.cldt.provider.service.UacMenuService;
import com.cldt.utils.wrapper.WrapMapper;
import com.cldt.utils.wrapper.Wrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单主页面.
 *
 * @author cldt
 */
@RestController
@RequestMapping(value = "/menu", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Web - UacMenuMainController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UacMenuMainController extends BaseController {

	@Resource
	private UacMenuService uacMenuService;

	/**
	 * 获取菜单列表数据
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/getTree")
	@ApiOperation(httpMethod = "POST", value = "获取菜单树")
	public Wrapper<List<MenuVo>> queryMenuTreeList() {
		List<MenuVo> menuVoList = uacMenuService.getMenuVoList(getLoginAuthDto().getUserId(), null);
		return WrapMapper.ok(menuVoList);
	}

	/**
	 * 编辑菜单.
	 *
	 * @param id the id
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/queryById/{id}")
	@ApiOperation(httpMethod = "POST", value = "编辑菜单")
	public Wrapper<ViewMenuVo> queryMenuVoById(@ApiParam(name = "id", value = "菜单id") @PathVariable Long id) {
		ViewMenuVo menuVo = uacMenuService.getViewVoById(id);
		return WrapMapper.ok(menuVo);
	}


	/**
	 * 根据id修改菜单的禁用状态
	 *
	 * @param uacMenuStatusDto the uac menu status dto
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/modifyStatus")
	@ApiOperation(httpMethod = "POST", value = "修改菜单状态")
	@LogAnnotation
	public Wrapper updateUacMenuStatusById(@ApiParam(name = "uacMenuStatusDto", value = "修改菜单状态Dto") @RequestBody UacMenuStatusDto uacMenuStatusDto) {
		logger.info("根据id修改菜单的禁用状态 uacMenuStatusDto={}", uacMenuStatusDto);
		LoginAuthDto loginAuthDto = getLoginAuthDto();
		uacMenuService.updateUacMenuStatusById(uacMenuStatusDto, loginAuthDto);
		return WrapMapper.ok();
	}

	/**
	 * 新增菜单.
	 *
	 * @param uacMenuAddDto the uac menu add dto
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/save")
	@ApiOperation(httpMethod = "POST", value = "新增菜单")
	@LogAnnotation
	public Wrapper saveMenu(@ApiParam(name = "saveMenu", value = "保存菜单") @RequestBody UacEditMenuDto uacMenuAddDto) {
		UacMenu uacMenu = new UacMenu();
		LoginAuthDto loginAuthDto = getLoginAuthDto();
		BeanUtils.copyProperties(uacMenuAddDto, uacMenu);
		uacMenuService.saveUacMenu(uacMenu, loginAuthDto);
		return WrapMapper.ok();
	}

	/**
	 * 根据id删除菜单
	 *
	 * @param id the id
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/deleteById/{id}")
	@ApiOperation(httpMethod = "POST", value = "删除菜单")
	@LogAnnotation
	public Wrapper<Integer> deleteUacMenuById(@ApiParam(name = "id", value = "菜单id") @PathVariable Long id) {
		logger.info(" 根据id删除菜单 id={}", id);
		LoginAuthDto loginAuthDto = getLoginAuthDto();

		Preconditions.checkArgument(id != null, "菜单ID不能为空");

		// 判断此菜单是否有子节点
		boolean hasChild = uacMenuService.checkMenuHasChildMenu(id);
		if (hasChild) {
			return WrapMapper.wrap(Wrapper.ERROR_CODE, "此菜单含有子菜单, 请先删除子菜单");
		}

		int result = uacMenuService.deleteUacMenuById(id, loginAuthDto);
		return super.handleResult(result);
	}
}