/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：MallCartController.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.mall;

import com.cldt.utils.PublicUtil;
import com.cldt.base.dto.LoginAuthDto;
import com.cldt.common.core.support.BaseController;
//import com.cldt.provider.model.constant.OmcApiConstant;
import com.cldt.provider.model.dto.omc.CartListQuery;
import com.cldt.utils.wrapper.WrapMapper;
//import com.cldt.provider.model.vo.CartProductVo;
//import com.cldt.provider.model.vo.CartVo;
//import com.cldt.provider.service.OmcCartFeignApi;
//import com.cldt.provider.service.OmcCartQueryFeignApi;
import com.cldt.utils.wrapper.Wrapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * 购物车管理.
 *
 * @author cldt
 */
@RestController
@RequestMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB - MallCartController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MallCartController extends BaseController {

//	@Resource
//	private OmcCartQueryFeignApi mallCartQueryFeignApi;
//	@Resource
//	private OmcCartFeignApi mallCartFeignApi;


	/**
	 * 登录成功合并购物车.
	 *
	 * @param cartListQuery the cart list query
	 *
	 * @return the wrapper
	 */
//	@PostMapping(value = "mergeUserCart")
//	@ApiOperation(httpMethod = "POST", value = "登录成功合并购物车")
//	public Wrapper<CartVo> mergeUserCart(@RequestBody CartListQuery cartListQuery) {
//		List<CartProductVo> cartProductVoList = cartListQuery.getCartProductVoList();
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		// 1.更新购物车数据
//		if (PublicUtil.isNotEmpty(cartProductVoList)) {
//			for (CartProductVo cartProductVo : cartProductVoList) {
//				cartProductVo.setUserId(loginAuthDto.getUserId());
//			}
//			mallCartFeignApi.updateCartList(cartProductVoList);
//		}
//		return mallCartQueryFeignApi.getCartVo(loginAuthDto.getUserId());
//	}

	/**
	 * 购物车添加商品.
	 *
	 * @param productId the product id
	 * @param count     the count
	 *
	 * @return the wrapper
	 */
	@PostMapping("addProduct/{productId}/{count}")
	@ApiOperation(httpMethod = "POST", value = "购物车添加商品")
	public Wrapper addProduct(@PathVariable Long productId, @PathVariable Integer count) {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.addProduct(userId, productId, count);
		return WrapMapper.ok();
	}


	/**
	 * 购物车更新商品.
	 *
	 * @param productId the product id
	 * @param count     the count
	 *
	 * @return the wrapper
	 */
	@ApiOperation(httpMethod = "POST", value = "购物车更新商品")
	@PostMapping("updateProduct/{productId}/{count}")
	public Wrapper updateProduct(@PathVariable Long productId, @PathVariable Integer count) {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.updateProduct(userId, productId, count);
		return WrapMapper.ok();
	}

	/**
	 * 购物车删除商品.
	 *
	 * @param productIds the product ids
	 *
	 * @return the wrapper
	 */
	@ApiOperation(httpMethod = "POST", value = "购物车删除商品")
	@PostMapping("deleteProduct/{productIds}")
	public Wrapper deleteProduct(@PathVariable String productIds) {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.deleteProduct(userId, productIds);
		return WrapMapper.ok();
	}


	/**
	 * 购物车全选商品.
	 *
	 * @return the wrapper
	 */
	@PostMapping("selectAllProduct")
	@ApiOperation(httpMethod = "POST", value = "购物车全选商品")
	public Wrapper selectAll() {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.selectOrUnSelect(userId, null, OmcApiConstant.Cart.CHECKED);
		return WrapMapper.ok();
	}

	/**
	 * 购物车反选全部商品.
	 *
	 * @return the wrapper
	 */
	@PostMapping("unSelectAllProduct")
	@ApiOperation(httpMethod = "POST", value = "购物车反选全部商品")
	public Wrapper unSelectAll() {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.selectOrUnSelect(userId, null, OmcApiConstant.Cart.UN_CHECKED);
		return WrapMapper.ok();
	}


	/**
	 * 选中商品.
	 *
	 * @param productId the product id
	 *
	 * @return the wrapper
	 */
	@PostMapping("selectProduct/{productId}")
	@ApiOperation(httpMethod = "POST", value = "选中商品")
	public Wrapper select(@PathVariable Long productId) {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.selectOrUnSelect(userId, productId, OmcApiConstant.Cart.CHECKED);
		return WrapMapper.ok();
	}

	/**
	 * 反选商品.
	 *
	 * @param productId the product id
	 *
	 * @return the wrapper
	 */
	@PostMapping("unSelectProduct/{productId}")
	@ApiOperation(httpMethod = "POST", value = "反选商品")
	public Wrapper unSelect(@PathVariable Long productId) {
//		LoginAuthDto loginAuthDto = getLoginAuthDto();
//		Long userId = loginAuthDto.getUserId();
//		return mallCartFeignApi.selectOrUnSelect(userId, productId, OmcApiConstant.Cart.UN_CHECKED);
		return WrapMapper.ok();
	}
}
