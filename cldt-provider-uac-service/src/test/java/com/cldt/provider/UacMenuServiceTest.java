package com.cldt.provider;

import com.cldt.provider.model.vo.MenuVo;
import com.cldt.provider.service.UacMenuService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class UacMenuServiceTest extends CldtUacApplicationTests {
	@Resource
	private UacMenuService uacMenuService;

	@Test
	public void findMenuListByUserIdTest() {
		List<MenuVo> menuVoListByUserId = uacMenuService.getMenuVoList(1L, 1L);
		logger.info("findByLoginNameTest = {}", menuVoListByUserId);
	}
}
