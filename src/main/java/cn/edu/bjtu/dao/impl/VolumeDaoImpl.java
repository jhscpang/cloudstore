/**
 * 
 */
package cn.edu.bjtu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.bjtu.dao.IVolumeDao;
import cn.edu.bjtu.model.VolumeEntity;

/**
 * 
 * @author pang
 */

@Repository("volumeDao")
public class VolumeDaoImpl extends BaseDaoImpl<VolumeEntity> implements IVolumeDao {

	//根据用户id查找套餐
	@Override
	public VolumeEntity getByUserInfoId(Integer userInfoId) {
		return this.get("From VolumeEntity where userInfoId = " + userInfoId);
	}
	
}
