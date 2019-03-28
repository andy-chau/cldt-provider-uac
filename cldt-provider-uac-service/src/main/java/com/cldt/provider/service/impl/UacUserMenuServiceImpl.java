package com.cldt.provider.service.impl;


import com.cldt.common.core.support.BaseService;
import com.cldt.provider.model.domain.UacUserMenu;
import com.cldt.provider.service.UacUserMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The class Uac user menu service.
 *
 * @author cldt@gmail.com
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UacUserMenuServiceImpl extends BaseService<UacUserMenu> implements UacUserMenuService {
}
