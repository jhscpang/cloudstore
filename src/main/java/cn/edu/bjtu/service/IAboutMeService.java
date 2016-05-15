/**
 * 
 */
package cn.edu.bjtu.service;

import cn.edu.bjtu.model.UserDetailInfo;

/**
 * @author pang
 */
public interface IAboutMeService {
	// 获取个人资料信息
	public UserDetailInfo getUserDetailInfo(Integer userInfoId);

	// 更新个人资料信息
	public void updateUserDetailInfo(Integer userInfoId, String country, String address, String phone);
}
