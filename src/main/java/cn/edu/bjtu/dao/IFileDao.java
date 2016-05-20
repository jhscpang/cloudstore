/**
 * 
 */
package cn.edu.bjtu.dao;

import java.util.List;

import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.FileFormate;

/**
 * @author phobes
 */
public interface IFileDao extends IBaseDao<FileEntity>{
	public List<FileEntity> getFiles(String path);
	public FileEntity getFile(String path, String filename);
	public FileEntity getFile(int id);
	public void deleteFile(int id);
	/**
	 * @param path
	 * @return
	 */
	List<FileEntity> getTrashFiles(String path);
	/**
	 * @param path
	 * @param fileType
	 * @return
	 */
	public List<FileEntity> getFilesByType(String path, FileFormate fileType);
}
