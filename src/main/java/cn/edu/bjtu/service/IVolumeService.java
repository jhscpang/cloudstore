/**
 * 
 */
package cn.edu.bjtu.service;

/**
 * @author pang
 */
public interface IVolumeService {
	//购买容量套餐
	public boolean buyVolume(Integer userInfoId, String type);
}
