/**
 * 
 */
package cn.edu.bjtu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author phobes
 */

@Table(name="t_version")
@Entity
public class VersionEntity {
	private int version_id;
	private int file_id;
	private String version_name;
	private int modify_user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VID", nullable = false, length = 9)
	public int getVersion_id() {
		return version_id;
	}
	
	@Column(name = "FID", nullable = false, length = 9)
	public int getFile_id() {
		return file_id;
	}
	
	@Column(name = "VNAME", nullable = false, length = 200)
	public String getVersion_name() {
		return version_name;
	}
	
	@Column(name = "MODIFYUSER", nullable = false, length = 9)
	public int getModify_user() {
		return modify_user;
	}
	public void setVersion_id(int version_id) {
		this.version_id = version_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public void setVersion_name(String version_name) {
		this.version_name = version_name;
	}
	public void setModify_user(int modify_user) {
		this.modify_user = modify_user;
	}
	
}
