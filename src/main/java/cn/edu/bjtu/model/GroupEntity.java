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

/**
 * @author phobes
 */

@Table(name="t_group")
@Entity
public class GroupEntity {
	private int group_id;
	private String group_name;
	
	private Date create_time;
	private int group_manager;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GID", nullable = false, length = 9)
	public int getGroup_id() {
		return group_id;
	}
	
	@Column(name = "GName", nullable = false, length = 100)
	public String getGroup_name() {
		return group_name;
	}
	
	@Column(name = "GCREATETIME", nullable = false, columnDefinition="DATE")
	public Date getCreate_time() {
		return create_time;
	}
	
	@Column(name = "GMANAGER", nullable = false)
	public int getGroup_manager() {
		return group_manager;
	}
	
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public void setGroup_manager(int group_manager) {
		this.group_manager = group_manager;
	}
}
