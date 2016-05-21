/**
 * 
 */
package cn.edu.bjtu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.dao.IVolumeDao;
import cn.edu.bjtu.model.VolumeEntity;
import cn.edu.bjtu.service.IVolumeService;

/**
 * @author pang
 */
@Transactional
@Service("volumeService")
public class VolumeServiceImpl implements IVolumeService {

	private IVolumeDao volumeDao;

	public IVolumeDao getVolumeDao() {
		return volumeDao;
	}

	@Resource
	public void setVolumeDao(IVolumeDao volumeDao) {
		this.volumeDao = volumeDao;
	}

	//购买容量套餐
	@Override
	public boolean buyVolume(Integer userInfoId, String type) {

		if(type == null || "".equals(type) || !type.equals("5") || !type.equals("10") || !type.equals("15")) {
			return false;
		}
		if (userInfoId == null || userInfoId <= 0) {
			return false;
		}
		
		VolumeEntity volumeEntity = volumeDao.getByUserInfoId(userInfoId);
		volumeEntity.setType(type);
		volumeDao.saveOrUpdate(volumeEntity);
		return true;
		
	}
	
	
}
