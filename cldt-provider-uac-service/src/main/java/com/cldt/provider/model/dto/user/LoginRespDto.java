package com.cldt.provider.model.dto.user;

import com.cldt.base.dto.LoginAuthDto;
import com.cldt.provider.model.vo.MenuVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * The class Login resp dto.
 *
 * @author cldt@gmail.com
 */
@Data
@ApiModel(value = "发送短信参数Dto")
public class LoginRespDto implements Serializable {
	private static final long serialVersionUID = -8992761897550131632L;
	@ApiModelProperty(value = "登陆信息")
	private LoginAuthDto loginAuthDto;
	@ApiModelProperty(value = "菜单集合")
	private List<MenuVo> menuList;
}
