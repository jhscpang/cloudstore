/**
 * 
 */
package cn.edu.bjtu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.edu.bjtu.dao.IRegisterDao;
import cn.edu.bjtu.dao.IUserDao;
import cn.edu.bjtu.model.UserEntity;
import cn.edu.bjtu.model.UserInfoEntity;
import cn.edu.bjtu.utils.EmailUtil;

/**
 * 
 * @author pang
 */

@Repository("registerDao")
public class RegisterDaoImpl extends BaseDaoImpl<UserInfoEntity> implements IRegisterDao {
	
	@Override
	public boolean isExist(String email) {
		List<UserInfoEntity> userInfos = this.find("From UserInfoEntity where email = '" + email + "'");
		if (userInfos.size() >= 1) {
			return true;
		}
		return false;
	}
	

}
