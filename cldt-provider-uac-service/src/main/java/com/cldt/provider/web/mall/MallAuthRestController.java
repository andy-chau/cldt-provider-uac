/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：MallAuthRestController.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.web.mall;

import com.github.pagehelper.PageInfo;
import com.cldt.common.core.support.BaseController;
import com.cldt.utils.wrapper.WrapMapper;
//import com.cldt.provider.model.dto.ProductCategoryDto;
//import com.cldt.provider.model.dto.ProductReqDto;
//import com.cldt.provider.model.vo.ProductDetailVo;
//import com.cldt.provider.service.MdcProductCategoryQueryFeignApi;
//import com.cldt.provider.service.MdcProductQueryFeignApi;
import com.cldt.utils.wrapper.Wrapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;


/**
 * The class Mall auth rest controller.
 *
 * @author cldt
 */
@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "WEB - MallAuthRestController", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MallAuthRestController extends BaseController {

//	@Resource
//	private MdcProductQueryFeignApi mdcProductQueryFeignApi;
//
//	@Resource
//	private MdcProductCategoryQueryFeignApi mdcProductCategoryQueryFeignApi;

	/**
	 * 查询商品列表.
	 *
	 * @param productReqDto the product req dto
	 *
	 * @return the product category dto by pid
	 */
//	@PostMapping(value = "/product/queryProductList")
//	@ApiOperation(httpMethod = "POST", value = "查询商品列表")
//	public Wrapper<PageInfo> queryProductList(@RequestBody ProductReqDto productReqDto) {
//		logger.info("getProductCategoryDtoByPid - 查询分类信息 productReqDto={}", productReqDto);
//		return mdcProductCategoryQueryFeignApi.getProductList(productReqDto);
//	}

	/**
	 * 查询商品详情信息.
	 *
	 * @param productId the product id
	 *
	 * @return the wrapper
	 */
//	@GetMapping(value = "/product/queryProductDetail/{productId}")
//	@ApiOperation(httpMethod = "POST", value = "查询商品详情信息")
//	public Wrapper<ProductDetailVo> queryProductDetail(@PathVariable Long productId) {
//		logger.info("getProductCategoryDtoByPid - 查询商品详情信息 productId={}", productId);
//		return mdcProductQueryFeignApi.getProductDetail(productId);
//	}

	/**
	 * 查询分类信息.
	 *
	 * @param pid the pid
	 *
	 * @return the product category dto by pid
	 */
//	@GetMapping(value = "/category/getProductCategoryDtoByPid/{pid}")
//	public Wrapper<List<ProductCategoryDto>> getProductCategoryDtoByPid(@PathVariable Long pid) {
//		logger.info("getProductCategoryDtoByPid - 查询分类信息 pid={}", pid);
//		Wrapper<List<ProductCategoryDto>> productCategoryData = mdcProductCategoryQueryFeignApi.getProductCategoryData(pid);
//		logger.info("productCategoryData={}", productCategoryData);
//		return productCategoryData;
//	}
}
