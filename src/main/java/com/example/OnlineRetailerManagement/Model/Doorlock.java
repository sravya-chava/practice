package com.example.OnlineRetailerManagement.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Doorlock")
public class Doorlock {
	@Id
	private long doorlockid;
	private String doorlockname;
	Doorlock(){}
	public Doorlock(long doorlockid, String doorlockname) {
		super();
		this.doorlockid = doorlockid;
		this.doorlockname = doorlockname;
	}
	public long getDoorlockid() {
		return doorlockid;
	}
	public void setDoorlockid(long doorlockid) {
		this.doorlockid = doorlockid;
	}
	public String getDoorlockname() {
		return doorlockname;
	}
	public void setDoorlockname(String doorlockname) {
		this.doorlockname = doorlockname;
	}
	@Override
	public String toString() {
		return "Doorlock [doorlockid=" + doorlockid + ", doorlockname=" + doorlockname + "]";
	}
	
}
