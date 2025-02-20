package com.cldt.provider.service.impl;

import com.cldt.base.enums.ErrorCodeEnum;
import com.cldt.common.core.support.BaseService;
import com.cldt.provider.mapper.UacRoleMenuMapper;
import com.cldt.provider.model.domain.UacRoleMenu;
import com.cldt.provider.model.exceptions.UacBizException;
import com.cldt.provider.service.UacRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * The class Uac role menu service.
 *
 * @author cldt
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UacRoleMenuServiceImpl extends BaseService<UacRoleMenu> implements UacRoleMenuService {
	@Resource
	private UacRoleMenuMapper uacRoleMenuMapper;

	@Override
	public int delRoleMenuList(Set<UacRoleMenu> uacRoleMenus) {
		int result = 0;
		for (UacRoleMenu uacRoleMenu : uacRoleMenus) {
			result += uacRoleMenuMapper.delete(uacRoleMenu);
		}
		return result;
	}

	@Override
	public void deleteByRoleId(Long roleId) {
		if (roleId == null) {
			throw new UacBizException(ErrorCodeEnum.UAC10012001);
		}
		UacRoleMenu roleMenu = new UacRoleMenu();
		roleMenu.setRoleId(roleId);
		uacRoleMenuMapper.delete(roleMenu);
	}

	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public List<UacRoleMenu> listByRoleId(Long roleId) {
		if (roleId == null) {
			throw new UacBizException(ErrorCodeEnum.UAC10012001);
		}
		UacRoleMenu roleMenu = new UacRoleMenu();
		roleMenu.setRoleId(roleId);
		return uacRoleMenuMapper.select(roleMenu);
	}

	@Override
	public void insert(Long roleId, Set<Long> menuIdList) {
		if (roleId == null) {
			throw new UacBizException(ErrorCodeEnum.UAC10012001);
		}
		UacRoleMenu uacRoleMenu = new UacRoleMenu();
		uacRoleMenu.setRoleId(roleId);
		for (Long menuId : menuIdList) {
			uacRoleMenu.setMenuId(menuId);
			uacRoleMenuMapper.insertSelective(uacRoleMenu);
		}
	}

	@Override
	public void deleteByRoleIdList(final List<Long> roleIdList) {
		uacRoleMenuMapper.deleteByRoleIdList(roleIdList);
	}
}
