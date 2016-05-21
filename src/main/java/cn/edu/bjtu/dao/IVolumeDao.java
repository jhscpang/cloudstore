/**
 * 
 */
package cn.edu.bjtu.dao;

import cn.edu.bjtu.model.VolumeEntity;

/**
 * 
 * @author pang
 */
public interface IVolumeDao extends IBaseDao<VolumeEntity>{
	//根据用户id查找套餐
	public VolumeEntity getByUserInfoId(Integer userInfoId);
}
