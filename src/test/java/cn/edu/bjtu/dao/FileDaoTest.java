/**
 * 
 */
package cn.edu.bjtu.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.UserEntity;

/**
 * @author phobes
 */
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class FileDaoTest {
	@Resource
	private IFileDao fileDao;
	@Resource
	private IUserDao userDao;
	
	@Test 
	public void getUser(){
		userDao.getByName("admin");
	}
	@Test
	public void testGetFiles() {
		String path = "home/phobes/cloudStore/upload/admin";
		FileEntity file = new FileEntity();
		file.setFilename("haha");
		
		List<FileEntity> result = fileDao.getFiles(path);
		//fileDao.save(file);
		//System.out.println(result);
	}
	
}
