/**
 * 
 */
package cn.edu.bjtu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.dao.IUserDao;
import cn.edu.bjtu.model.UserEntity;
import cn.edu.bjtu.service.IUserService;

/**
 * @author pang
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public boolean isExist(UserEntity user) {
		return userDao.isExist(user);
		
	}

}
