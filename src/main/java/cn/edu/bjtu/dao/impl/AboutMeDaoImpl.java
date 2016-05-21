/**
 * 
 */
package cn.edu.bjtu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.bjtu.dao.IAboutMeDao;
import cn.edu.bjtu.model.UserDetailInfoEntity;

/**
 * 
 * @author pang
 */

@Repository("aboutMeDao")
public class AboutMeDaoImpl extends BaseDaoImpl<UserDetailInfoEntity> implements IAboutMeDao {
	
}