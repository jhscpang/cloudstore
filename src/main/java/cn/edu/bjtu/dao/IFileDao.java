/**
 * 
 */
package cn.edu.bjtu.dao;

import java.util.List;

import cn.edu.bjtu.model.FileEntity;

/**
 * @author phobes
 */
public interface IFileDao extends IBaseDao<FileEntity>{
	public List<FileEntity> getFiles(String path);
	public FileEntity getFile(String path, String filename);
	public FileEntity getFile(int id);
	public void deleteFile(int id);
}
