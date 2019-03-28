/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacGroupMapper.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.mapper;

import com.cldt.common.core.mybatis.MyMapper;
import com.cldt.provider.model.domain.UacGroup;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * The interface Uac group mapper.
 *
 * @author cldt
 */
@Mapper
@Component
public interface UacGroupMapper extends MyMapper<UacGroup> {
}