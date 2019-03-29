package com.cldt.provider;

import com.github.pagehelper.PageInfo;
import com.cldt.provider.model.domain.UacUser;
import com.cldt.provider.service.UacUserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


/**
 * The class Uac user service test.
 * @author cldt
 */
public class UacUserServiceTest extends CldtUacApplicationTests {
	@Resource
	private UacUserService uacUserService;

	/**
	 * Find by login name test.
	 */
	@Test
	public void findByLoginNameTest() {
		List<UacUser> uacUsers = uacUserService.selectAll();
		logger.info("findByLoginNameTest = {}", uacUsers);
	}

	/**
	 * Query user list with page test.
	 */
	@Test
	public void queryUserListWithPageTest() {
		PageInfo pageInfo = uacUserService.queryUserListWithPage(new UacUser());
		logger.info("queryUserListWithPage = {}", pageInfo);
	}


}
