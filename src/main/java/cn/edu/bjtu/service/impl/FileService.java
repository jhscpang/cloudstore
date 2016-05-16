/**
 * 
 */
package cn.edu.bjtu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bjtu.dao.IFileDao;
import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.service.IFileService;

/**
 * @author phobes
 */
@Transactional
@Service("fileService")
public class FileService implements IFileService{

	@Resource
	private IFileDao fileDao;
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.service.IFileService#getFiles(java.lang.String)
	 */
	@Override
	public List<FileEntity> getFiles(String path) {
		// TODO Auto-generated method stub
		return fileDao.getFiles(path);
	}

	/* (non-Javadoc)
	 * @see cn.edu.bjtu.service.IFileService#getFile(java.lang.String, java.lang.String)
	 */
	@Override
	public FileEntity getFile(String path, String filename) {
		// TODO Auto-generated method stub
		return fileDao.getFile(path, filename);
	}

	/* (non-Javadoc)
	 * @see cn.edu.bjtu.service.IFileService#getFile(int)
	 */
	@Override
	public FileEntity getFile(int id) {
		// TODO Auto-generated method stub
		return fileDao.getFile(id);
	}

	/* (non-Javadoc)
	 * @see cn.edu.bjtu.service.IFileService#addFile(cn.edu.bjtu.model.FileEntity)
	 */
	@Override
	public void addFile(FileEntity file) {
		// TODO Auto-generated method stub
		fileDao.save(file);
	}

	/* (non-Javadoc)
	 * @see cn.edu.bjtu.service.IFileService#deleteFile(int)
	 */
	@Override
	public void deleteFile(int id) {
		// TODO Auto-generated method stub
		fileDao.deleteFile(id);
	}

}
