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
import cn.edu.bjtu.model.UserInfo;
import cn.edu.bjtu.utils.EmailUtil;

/**
 * 
 * @author pang
 */

@Repository("registerDao")
public class RegisterDaoImpl extends BaseDaoImpl<UserEntity> implements IRegisterDao {
	
	@Override
	public boolean isExist(String email) {
		List<UserInfo> userInfos = this.find("From UserInfo where email = '" + email + "'");
		if (userInfos.size() >= 1) {
			return true;
		}
		return false;
	}
	

}
