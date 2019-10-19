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
@Table(name="Doorunitfinish")
public class Doorunitfinish {
	@Id
	private long doorunitfinishid;
	private String doorunitfinishname;
	public Doorunitfinish() {}
	public Doorunitfinish(long doorunitfinishid, String doorunitfinishname) {
		super();
		this.doorunitfinishid = doorunitfinishid;
		this.doorunitfinishname = doorunitfinishname;
	}
	public long getDoorunitfinishid() {
		return doorunitfinishid;
	}
	public void setDoorunitfinishid(long doorunitfinishid) {
		this.doorunitfinishid = doorunitfinishid;
	}
	public String getDoorunitfinishname() {
		return doorunitfinishname;
	}
	public void setDoorunitfinishname(String doorunitfinishname) {
		this.doorunitfinishname = doorunitfinishname;
	}
	@Override
	public String toString() {
		return "Doorunitfinish [doorunitfinishid=" + doorunitfinishid + ", doorunitfinishname=" + doorunitfinishname
				+ "]";
	}
	
}

