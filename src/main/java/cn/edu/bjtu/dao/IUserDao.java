/**
 * 
 */
package cn.edu.bjtu.dao;

import cn.edu.bjtu.model.UserEntity;

/**
 * 
 * @author pang
 */
public interface IUserDao extends IBaseDao<UserEntity>{
	public boolean isExist(UserEntity user);
	//根据名字查找
	public UserEntity getByName(String name);
}
