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

@Table(name="t_share")
@Entity
public class ShareEntity {
	private int id;
	private int file_id;
	private int is_groupshare;//是否是组共享
	private int ug_id;//用户id或组id
	private int modify_right;//是否可以修改
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SID", nullable = false, length = 9)
	public int getId() {
		return id;
	}
	
	@Column(name = "FID", nullable = false, length = 9)
	public int getFile_id() {
		return file_id;
	}
	
	@Column(name = "ISGSHARE", nullable = false, length = 2)
	public int getIs_groupshare() {
		return is_groupshare;
	}
	
	@Column(name = "UGID", nullable = false, length = 9)
	public int getUg_id() {
		return ug_id;
	}
	
	@Column(name = "MODIFYRIGHT", nullable = false, length = 9)
	public int getModify_right() {
		return modify_right;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public void setIs_groupshare(int is_groupshare) {
		this.is_groupshare = is_groupshare;
	}
	public void setUg_id(int ug_id) {
		this.ug_id = ug_id;
	}
	public void setModify_right(int modify_right) {
		this.modify_right = modify_right;
	}
	
	
	
}
