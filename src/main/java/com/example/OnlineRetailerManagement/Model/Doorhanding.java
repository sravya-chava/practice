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
@Table(name="Doorhanding")
public class Doorhanding {
	@Id
	private long doorhandingid;
	private String doorhandingname;
	Doorhanding(){}
	public Doorhanding(long doorhandingid, String doorhandingname) {
		super();
		this.doorhandingid = doorhandingid;
		this.doorhandingname = doorhandingname;
	}
	public long getDoorhandingid() {
		return doorhandingid;
	}
	public void setDoorhandingid(long doorhandingid) {
		this.doorhandingid = doorhandingid;
	}
	public String getDoorhandingname() {
		return doorhandingname;
	}
	public void setDoorhandingname(String doorhandingname) {
		this.doorhandingname = doorhandingname;
	}
	@Override
	public String toString() {
		return "Doorhanding [doorhandingid=" + doorhandingid + ", doorhandingname=" + doorhandingname + "]";
	}

}

