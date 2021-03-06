/**
 * 
 */
package cn.edu.bjtu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author phobes
 */
@Table(name="t_file")
@Entity
public class FileEntity {
	private int id;
	private int user_id;
	private String filename;
	private FileFormate fileFormate;//文件格式
	private int size;
	
	private Date upload_time;
	private int can_shared;//是否可以共享
	private int state;
	private int version_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FID", nullable = false, length = 9)
	public int getId() {
		return id;
	}
	
	@Column(name = "UID", nullable = false, length = 9)
	public int getUser_id() {
		return user_id;
	}
	
	@Column(name = "FILENAME", nullable = false, length = 200)
	public String getFilename() {
		return filename;
	}
	
	@Column(name = "FILEFORNATE", nullable = false)
	public FileFormate getFileFormate() {
		return fileFormate;
	}
	
	@Column(name = "SIZE", nullable = false, length = 10)
	public int getSize() {
		return size;
	}
	
	@Column(name = "UPLOAD_TIME", nullable = false, columnDefinition="DATE")
	public Date getUpload_time() {
		return upload_time;
	}
	
	@Column(name = "CAN_SHARED", nullable = false, length=2)
	public int getCan_shared() {
		return can_shared;
	}
	
	@Column(name = "STATE", nullable = false, length=2)
	public int getState() {
		return state;
	}
	
	@Column(name = "VERSION_ID", nullable = false, length=2)
	public int getVersion_id() {
		return version_id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void setFileFormate(FileFormate fileFormate) {
		this.fileFormate = fileFormate;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}
	public void setCan_shared(int can_shared) {
		this.can_shared = can_shared;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void setVersion_id(int version_id) {
		this.version_id = version_id;
	}
	
	
}
