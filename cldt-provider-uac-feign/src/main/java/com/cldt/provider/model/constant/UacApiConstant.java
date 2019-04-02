/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacApiConstant.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.constant;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The class Uac api constant.
 *
 * @author cldt
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UacApiConstant {
	/**
	 * token变量
	 */
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public static final class Valid {
		/**
		 * The constant EMAIL.
		 */
		public static final String EMAIL = "email";
		/**
		 * The constant LOGIN_NAME.
		 */
		public static final String LOGIN_NAME = "loginName";
		/**
		 * The constant MOBILE_NO.
		 */
		public static final String MOBILE_NO = "mobileNo";
	}
}
