/**
 * 
 */
package cn.edu.bjtu.dao;

import cn.edu.bjtu.model.UserInfoEntity;

/**
 * 
 * @author pang
 */
public interface IRegisterDao extends IBaseDao<UserInfoEntity>{
	public boolean isExist(String email);
	
}
