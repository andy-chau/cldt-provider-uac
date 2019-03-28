/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：RefreshTokenDto.java

 * 联系方式：cldt@gmail.com

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.dto.token;


import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * The class Refresh token dto.
 *
 * @author cldt @gmail.com
 */
@Data
public class RefreshTokenDto {
	@NotBlank
	private String refreshToken;
	@NotBlank
	private String accessToken;
}
