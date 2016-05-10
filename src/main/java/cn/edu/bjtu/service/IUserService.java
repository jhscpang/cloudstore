/**
 * 
 */
package cn.edu.bjtu.service;

import cn.edu.bjtu.model.UserEntity;

/**
 * @author pang
 */
public interface IUserService {
	public boolean isExist(UserEntity user);
}
