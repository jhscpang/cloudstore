/**
 * 
 */
package cn.edu.bjtu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.dao.IAboutMeDao;
import cn.edu.bjtu.model.UserDetailInfoEntity;
import cn.edu.bjtu.service.IAboutMeService;

/**
 * @author pang
 */
@Transactional
@Service("aboutMeService")
public class AboutMeServiceImpl implements IAboutMeService {

	private IAboutMeDao aboutMeDao;

	public IAboutMeDao getAboutMeDao() {
		return aboutMeDao;
	}

	@Resource
	public void setAboutMeDao(IAboutMeDao aboutMeDao) {
		this.aboutMeDao = aboutMeDao;
	}

	// 获取个人资料信息
	@Override
	public UserDetailInfoEntity getUserDetailInfo(Integer userInfoId) {
		if(userInfoId == null || userInfoId <= 0) 
			return new UserDetailInfoEntity();
		
		return aboutMeDao.get(UserDetailInfoEntity.class, userInfoId);
	}

	// 更新个人资料信息
	@Override
	public void updateUserDetailInfo(Integer userInfoId, String country, String address, String phone) {
		UserDetailInfoEntity userDetailInfo = getUserDetailInfo(userInfoId);
		
		userDetailInfo.setCountry(country);
		userDetailInfo.setAddress(address);
		userDetailInfo.setPhone(phone);
		
		aboutMeDao.update(userDetailInfo);
	}
	

}
