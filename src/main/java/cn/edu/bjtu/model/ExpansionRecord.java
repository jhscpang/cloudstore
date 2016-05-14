/**
 * 
 */
package cn.edu.bjtu.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pang 购买记录
 */
@Table(name = "t_expansionrecord")
@Entity
public class ExpansionRecord {
	private int id;
	private Date expansionTime;// 扩容时间
	private String channel;// 获得渠道
	private String capacity;// 容量大小
	private String period;// 有效期
	private String status;// 状态

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UID", nullable = false, length = 9)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getExpansionTime() {
		return expansionTime;
	}

	public void setExpansionTime(Date expansionTime) {
		this.expansionTime = expansionTime;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
