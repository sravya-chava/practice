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
@Table(name="Doortype")
public class Doortype {
	@Id
	private long doortypeid;
	private String doortypename;
	Doortype(){}
	public Doortype(long doortypeid, String doortypename) {
		super();
		this.doortypeid = doortypeid;
		this.doortypename = doortypename;
	}
	public long getDoortypeid() {
		return doortypeid;
	}
	public void setDoortypeid(long doortypeid) {
		this.doortypeid = doortypeid;
	}
	public String getDoortypename() {
		return doortypename;
	}
	public void setDoortypename(String doortypename) {
		this.doortypename = doortypename;
	}
	@Override
	public String toString() {
		return "Doortype [doortypeid=" + doortypeid + ", doortypename=" + doortypename + "]";
	}
}
