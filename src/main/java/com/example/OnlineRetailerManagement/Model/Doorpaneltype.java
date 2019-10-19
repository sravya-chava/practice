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
@Table(name="Doorpaneltype")
public class Doorpaneltype {
	@Id
	private long doorpanelid;
	private String doorpanelname;
	Doorpaneltype(){};
	public Doorpaneltype(long doorpanelid, String doorpanelname) {
		super();
		this.doorpanelid = doorpanelid;
		this.doorpanelname = doorpanelname;
	}
	public long getDoorpanelid() {
		return doorpanelid;
	}
	public void setDoorpanelid(long doorpanelid) {
		this.doorpanelid = doorpanelid;
	}
	public String getDoorpanelname() {
		return doorpanelname;
	}
	public void setDoorpanelname(String doorpanelname) {
		this.doorpanelname = doorpanelname;
	}
	@Override
	public String toString() {
		return "Doorpaneltype [doorpanelid=" + doorpanelid + ", doorpanelname=" + doorpanelname + "]";
	}
	
	
}

