/**
 * 
 */
package cn.edu.bjtu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.org.apache.xpath.internal.operations.Bool;

import cn.edu.bjtu.dao.IRegisterDao;
import cn.edu.bjtu.dao.IUserDao;
import cn.edu.bjtu.model.UserEntity;
import cn.edu.bjtu.model.UserInfoEntity;
import cn.edu.bjtu.service.IRegisterService;
import cn.edu.bjtu.service.IUserService;

/**
 * @author pang
 */
@Transactional
@Service("registerService")
public class RegisterServiceImpl implements IRegisterService {

	private IRegisterDao registerDao;

	public IRegisterDao getRegisterDao() {
		return registerDao;
	}

	@Resource
	public void setRegisterDao(IRegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	@Override
	public int save(UserInfoEntity userInfo) {
		if(null == userInfo) 
			return -1;
		Boolean isExist = registerDao.isExist(userInfo.getEmail());
		if(isExist) {
			return -1;
		}else {
			registerDao.save(userInfo);
		}
		return userInfo.getId();
	}


}
