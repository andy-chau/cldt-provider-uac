/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：EmailService.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.service;

import com.cldt.provider.model.dto.email.SendEmailMessage;

/**
 * The interface Email service.
 *
 * @author cldt
 */
public interface EmailService {
	/**
	 * 重置密码发送邮件.
	 *
	 * @param email the email
	 */
	void submitResetPwdEmail(String email);

	/**
	 * 发送验证码
	 *
	 * @param sendEmailMessage the send email message
	 * @param loginName        the login name
	 */
	void sendEmailCode(SendEmailMessage sendEmailMessage, String loginName);

	/**
	 * 校验验证码 返回 token 用户最后修改密码使用
	 *
	 * @param sendEmailMessage the send email message
	 * @param loginName        the login name
	 */
	void checkEmailCode(SendEmailMessage sendEmailMessage, String loginName);
}
