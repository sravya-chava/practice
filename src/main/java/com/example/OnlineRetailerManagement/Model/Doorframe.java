package com.example.OnlineRetailerManagement.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doorframe {
	@Id
	private long doorframeid ;
	private String doorframename ;
	Doorframe(){}
	public Doorframe(long doorframeid, String doorframename) {
		super();
		this.doorframeid = doorframeid;
		this.doorframename = doorframename;
	}
	public long getDoorframeid() {
		return doorframeid;
	}
	public void setDoorframeid(long doorframeid) {
		this.doorframeid = doorframeid;
	}
	public String getDoorframename() {
		return doorframename;
	}
	public void setDoorframename(String doorframename) {
		this.doorframename = doorframename;
	}
	@Override
	public String toString() {
		return "DoorFrame [doorframeid=" + doorframeid + ", doorframename=" + doorframename + "]";
	}
	
}
