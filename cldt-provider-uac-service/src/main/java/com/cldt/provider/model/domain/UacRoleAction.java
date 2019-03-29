/*
 * Copyright (c) 2018. cldt All Rights Reserved.

 * 类名称：UacRoleAction.java

 * 联系方式：cldt

 * 博客地址: http://blog.cldt
 * 项目官网: http://cldt
 */

package com.cldt.provider.model.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The class Uac role action.
 *
 * @author cldt
 */
@Data
@Table(name = "uac_role_action")
@Alias(value = "uacRoleAction")
public class UacRoleAction implements Serializable {
	private static final long serialVersionUID = -4240611881810188284L;

	@Id
	@Column(name = "role_id")
	private Long roleId;

	@Id
	@Column(name = "action_id")
	private Long actionId;
}