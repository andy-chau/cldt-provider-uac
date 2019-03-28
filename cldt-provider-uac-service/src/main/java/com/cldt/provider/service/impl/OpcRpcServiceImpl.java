/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：OpcRpcServiceImpl.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service.impl;

import com.cldt.base.constant.GlobalConstant;
import com.cldt.base.enums.ErrorCodeEnum;
//import com.cldt.provider.exceptions.MdcBizException;
//import com.cldt.provider.model.dto.gaode.GaodeLocation;
//import com.cldt.provider.service.OpcGaodeFeignApi;
import com.cldt.provider.service.OpcRpcService;
import com.cldt.utils.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * The class Opc rpc service.
 *
 * @author cldt
 */
@Slf4j
@Service
public class OpcRpcServiceImpl implements OpcRpcService {
//	@Resource
//	private OpcGaodeFeignApi opcGaodeFeignApi;

	@Override
	public String getLocationById(String addressId) {
		try {
//			Wrapper<GaodeLocation> wrapper = opcGaodeFeignApi.getLocationByIpAddr(addressId);
//			if (wrapper == null) {
//				throw new MdcBizException(ErrorCodeEnum.GL99990002);
//			}
//			if (wrapper.error()) {
//				throw new MdcBizException(ErrorCodeEnum.MDC10021002);
//			}
//
//			GaodeLocation result = wrapper.getResult();

//			assert result != null;
//			return result.getProvince().contains("市") ? result.getCity() : result.getProvince() + GlobalConstant.Symbol.SHORT_LINE + result.getCity();
		} catch (Exception e) {
			log.error("getLocationById={}", e.getMessage(), e);
		}
		return null;
	}
}
