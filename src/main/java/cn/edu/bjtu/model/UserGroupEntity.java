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

@Table(name="t_usergroup")
@Entity
public class UserGroupEntity {
	private int id;
	private int group_id;
	private int user_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UGID", nullable = false, length = 9)
	public int getId() {
		return id;
	}
	
	@Column(name = "GID", nullable = false, length = 9)
	public int getGroup_id() {
		return group_id;
	}
	
	@Column(name = "UID", nullable = false, length = 9)
	public int getUser_id() {
		return user_id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
}
