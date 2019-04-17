/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacApplication.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt;

import javax.sql.DataSource;

import liquibase.integration.spring.SpringLiquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cldt.provider.service.impl.PcSmsCodeSender;
import com.cldt.security.core.validate.code.sms.SmsCodeSender;

/**
 * The class cldt uac application.
 *
 * @author cldt
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
public class UacApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(UacApplication.class, args);
	}

	@Bean
	public SpringLiquibase springLiquibase(DataSource dataSource) {

		SpringLiquibase springLiquibase = new SpringLiquibase();

		springLiquibase.setDataSource(dataSource);
		springLiquibase.setChangeLog("classpath:/liquibase/index.xml");

		return springLiquibase;
	}

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:org/springframework/security/messages_zh_CN");
		return messageSource;
	}

	@Bean
	public SmsCodeSender smsCodeSender() {
		return new PcSmsCodeSender();
	}
}
