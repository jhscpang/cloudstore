/**
 * 
 */
package cn.edu.bjtu.service;

import java.util.List;

import cn.edu.bjtu.model.FileEntity;

/**
 * @author phobes
 */
public interface IFileService {
	public List<FileEntity> getFiles(String path);
	public FileEntity getFile(String path, String filename);
	public FileEntity getFile(int id);
	public void addFile(FileEntity file);
	public void deleteFile(int id);
	List<FileEntity> getTrashFiles(String path);
	/**
	 * @param path
	 * @param type
	 * @return
	 */
	List<FileEntity> getFilesByType(String path, String type);
}
