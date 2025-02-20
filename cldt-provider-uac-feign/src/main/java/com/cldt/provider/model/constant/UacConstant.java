/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacConstant.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.constant;

/**
 * The class Uac constant.
 *
 * @author cldt
 */
public class UacConstant {

	/**
	 * The constant MENU_ROOT.
	 */
	public static final String MENU_ROOT = "root";

	/**
	 * token变量
	 *
	 * @author cldt
	 */
	public static final class Token {
		/**
		 * 用户名密码加密秘钥
		 */
		public static final String SEC_TOKEN = "SEC_TOKEN";
		/**
		 * 验证码
		 */
		public static final String KAPTCHA = "KAPTCHA";

		/**
		 * The constant SMS_TOKEN.
		 */
		public static final String SMS_TOKEN = "SMS_TOKEN";
		/**
		 * The constant AUTH_TOKEN_KEY.
		 */
		public static final String AUTH_TOKEN_KEY = "PAAS_TOKEN_KEY";
		/**
		 * The constant REGISTER_TOKEN_KEY.
		 */
		public static final String REGISTER_TOKEN_KEY = "REGISTER_TOKEN_KEY";
		/**
		 * The constant RESET_PWD_TOKEN_KEY.
		 */
		public static final String RESET_PWD_TOKEN_KEY = "RESET_PWD_TOKEN_KEY";

		/**
		 * 登录人信息
		 */
		public static final String TOKEN_AUTH_DTO = "TOKEN_AUTH_DTO";

		/**
		 * The class Jwt.
		 *
		 * @author cldt
		 */
		public static final class Jwt {
			/**
			 * The constant VIEW.
			 */
			public static final String VIEW = "JWT_VIEW_PRIVATE";
			/**
			 * The constant API.
			 */
			public static final String API = "JWT_API_PRIVATE";
		}
	}

	/**
	 * The class User.
	 *
	 * @author cldt
	 */
	public static final class User {
		/**
		 * The constant LOGIN_NAME.
		 */
		public static final String LOGIN_NAME = "LOGIN_NAME";
	}

	/**
	 * The class Cookie.
	 *
	 * @author cldt
	 */
	public static final class Cookie {
		/**
		 * 用户名密码加密秘钥
		 */
		public static final String CLDT_DOMAIN = "cldt.com";
		/**
		 * token 前缀
		 */
		public static final String CLDT_PATH = "/ ";

	}
}
