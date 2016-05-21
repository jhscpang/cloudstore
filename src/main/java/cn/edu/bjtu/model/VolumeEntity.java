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
 * @author pang 用户注册信息
 */
@Table(name = "t_volumeentity")
@Entity
public class VolumeEntity {
	private int id;
	private Integer userInfoId;
	private String type = "0"; //默认是没有套餐， 另外有提供三种套餐
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UID", nullable = false, length = 9)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
