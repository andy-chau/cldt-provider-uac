/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：EmailProducer.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.mq.producer;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.cldt.utils.RedisKeyUtil;
import com.cldt.base.constant.AliyunMqTopicConstants;
import com.cldt.base.enums.ErrorCodeEnum;
//import com.cldt.provider.model.domain.MqMessageData;
//import com.cldt.provider.model.dto.PcSendEmailRequest;
import com.cldt.provider.model.enums.UacEmailTemplateEnum;
import com.cldt.provider.model.exceptions.UacBizException;
import com.cldt.provider.service.UacFreeMarkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

/**
 * The class Email producer.
 *
 * @author cldt@gmail.com
 */
@Component
@Slf4j
public class EmailProducer {
	@Resource
	private UacFreeMarkerService uacFreeMarkerService;

	/**
	 * Send email mq.
	 *
	 * @param emailSet          the email set
	 * @param emailTemplateEnum the email template enum
	 * @param param             the param
	 */
//	public MqMessageData sendEmailMq(Set<String> emailSet, UacEmailTemplateEnum emailTemplateEnum, AliyunMqTopicConstants.MqTagEnum tagEnum, Map<String, Object> param) {
//		log.info("pcSendEmailRequest - 发送邮件MQ. emailSet={}, param={}", emailSet, param);
//		String msgBody;
//		try {
//
//			Preconditions.checkArgument(emailTemplateEnum != null, "邮箱模板信息不存在");
//			PcSendEmailRequest request = new PcSendEmailRequest();
//
//			String templateLocation = emailTemplateEnum.getLocation();
//			String text = uacFreeMarkerService.getTemplate(param, templateLocation);
//
//			request.setText(text);
//			request.setTo(emailSet);
//			request.setSubject(emailTemplateEnum.getSubject());
//
//			msgBody = JSON.toJSONString(request);
//		} catch (Exception e) {
//			log.error("发送邮件验证码 smsMessage转换为json字符串失败", e);
//			throw new UacBizException(ErrorCodeEnum.UAC10011021);
//		}
//		String topic = tagEnum.getTopic();
//		String tag = tagEnum.getTag();
//		String key = RedisKeyUtil.createMqKey(topic, tag, emailSet.toString(), msgBody);
//		return new MqMessageData(msgBody, topic, tag, key);
//	}
}
