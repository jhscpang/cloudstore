package cn.edu.bjtu.service;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.bjtu.model.UserEntity;
import cn.edu.bjtu.service.IUserService;
/**
 * @author pang
 */
@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
	@Resource
	private IUserService userService;
	@Test
	public void testIsExist(){
		UserEntity user = new UserEntity();
		user.setUsername("phn");
		user.setPassword("123456");
		boolean result = userService.isExist(user);
		System.out.println(result);
	}

}
