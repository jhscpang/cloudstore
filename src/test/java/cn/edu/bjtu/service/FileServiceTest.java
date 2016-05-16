/**
 * 
 */
package cn.edu.bjtu.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.UserEntity;

/**
 * @author phobes
 */
@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class FileServiceTest {
	@Resource
	private IFileService fileService;
	@Test
	public void getfiles(){
		String path = "home/phobes/cloudStore/upload/admin";
		FileEntity file = new FileEntity();
		file.setFilename("haha");
		
		List<FileEntity> result = fileService.getFiles(path);
		fileService.addFile(file);
//		System.out.println(result);
	}
}
