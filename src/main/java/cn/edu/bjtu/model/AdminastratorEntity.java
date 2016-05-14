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
@Table(name="t_admin")
@Entity
public class AdminastratorEntity {
	private int id;
	private String user_name;
	private String password;
	private Date register_time;
//	admin_level管理员类型
	private int admin_level;
	private int state;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AID", nullable = false, length = 9)
	public int getId() {
		return id;
	}
	
	@Column(name = "ANAME", nullable = false, length = 20)
	public String getUser_name() {
		return user_name;
	}

	@Column(name = "UPASSWORD", nullable = false, length = 32)
	public String getPassword() {
		return password;
	}
	
	@Column(name = "REGISTER_TIME", nullable = false, columnDefinition="DATE")
	public Date getRegister_time() {
		return register_time;
	}
	
	@Column(name  = "ADMINLEVEL", nullable = false, length = 9)
	public int getAdmin_level() {
		return admin_level;
	}
	
	@Column(name  = "ASTATE", nullable = false, length = 9)
	public int getState() {
		return state;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}
	public void setAdmin_level(int admin_level) {
		this.admin_level = admin_level;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
