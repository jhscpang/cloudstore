/**
 * 
 */
package cn.edu.bjtu.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.edu.bjtu.dao.IFileDao;
import cn.edu.bjtu.model.FileEntity;
import cn.edu.bjtu.model.FileFormate;

/**
 * @author phobes
 */
@Repository("fileDao")
public class FileDaoImpl extends BaseDaoImpl<FileEntity> implements IFileDao {

	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#getFiles(java.lang.String)
	 */
	@Override
	public List<FileEntity> getFiles(String path) {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String hql = "from FileEntity where path =? and state=?";
		Query query = session.createQuery(hql);
		query.setString(0, path);
		query.setInteger(1, 1);
		//return this.find("From FileEntity where path = \"" + path + "\"");
		return query.list();
	}
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#getFiles(java.lang.String)
	 */
	@Override
	public List<FileEntity> getFilesByType(String path, FileFormate filetype) {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String hql = "from FileEntity where path =? and state=? and fileformate=?";
		Query query = session.createQuery(hql);
		query.setString(0, path);
		query.setInteger(1, 1);
		query.setString(2,filetype.toString());
		//query.setInteger(2, 2);
		//return this.find("From FileEntity where path = \"" + path + "\"");
		return query.list();
	}
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#getFiles(java.lang.String)
	 */
	@Override
	public List<FileEntity> getTrashFiles(String path) {
		// TODO Auto-generated method stub
		Session session = this.getCurrentSession();
		String hql = "from FileEntity where path =? and state=?";
		Query query = session.createQuery(hql);
		query.setString(0, path);
		query.setInteger(1, 0);
		//return this.find("From FileEntity where path = \"" + path + "\"");
		return query.list();
	}
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#getFile(java.lang.String, java.lang.String)
	 */
	@Override
	public FileEntity getFile(String path, String filename) {
		// TODO Auto-generated method stub
		return this.get("From FileEntity where path = " + path + "and filename = " + filename);
	}
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#getFile(int)
	 */
	@Override
	public FileEntity getFile(int id) {
		// TODO Auto-generated method stub
		return this.get("From FileEntity where id = " + id);
	}
	/* (non-Javadoc)
	 * @see cn.edu.bjtu.dao.IFileDao#deleteFile(int)
	 */
	@Override
	public void deleteFile(int id) {
		// TODO Auto-generated method stub
		FileEntity file  = this.getFile(id);
		this.delete(file);
	}

}
