/**
 * 
 */
package cn.edu.bjtu.dao;

import cn.edu.bjtu.model.UserInfo;

/**
 * 
 * @author pang
 */
public interface IRegisterDao extends IBaseDao<UserInfo>{
	public boolean isExist(String email);
	
}
