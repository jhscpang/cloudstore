/**
 * 
 */
package cn.edu.bjtu.service;

import cn.edu.bjtu.model.UserDetailInfoEntity;

/**
 * @author pang
 */
public interface IAboutMeService {
	// 获取个人资料信息
	public UserDetailInfoEntity getUserDetailInfo(Integer userInfoId);

	// 更新个人资料信息
	public void updateUserDetailInfo(Integer userInfoId, String country, String address, String phone);
}
