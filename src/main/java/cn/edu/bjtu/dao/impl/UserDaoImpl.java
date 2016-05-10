/**
 * 
 */
package cn.edu.bjtu.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.edu.bjtu.dao.IUserDao;
import cn.edu.bjtu.model.UserEntity;

/**
 * 
 * @author pang
 */

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<UserEntity> implements IUserDao {
	
	@Override
	public boolean isExist(UserEntity user) {
		Session session = this.getCurrentSession();
		String hql = "from UserEntity where username =? and password = ?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		if (query.list().size() >= 1) {
			return true;
		}
		return false;
	}

	@Override
	public UserEntity getByName(String name) {
		return this.get("From UserEntity where name = " + name);
	}
	

}
