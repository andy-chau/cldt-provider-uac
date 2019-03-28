/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：SmsService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

import com.cldt.provider.model.dto.sms.SmsMessage;

import javax.servlet.http.HttpServletResponse;


/**
 * The interface Sms service.
 *
 * @author cldt
 */
public interface SmsService {
	/**
	 * Send sms code.
	 *
	 * @param smsMessage the sms message
	 * @param ipAddr     the ip addr
	 */
	void sendSmsCode(SmsMessage smsMessage, String ipAddr);

	/**
	 * Submit reset pwd phone.
	 *
	 * @param mobile   the mobile
	 * @param response the response
	 *
	 * @return the string
	 */
	String submitResetPwdPhone(String mobile, HttpServletResponse response);
}
