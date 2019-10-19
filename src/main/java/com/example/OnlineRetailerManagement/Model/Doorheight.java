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
@Table(name="Doorheight")
public class Doorheight {
	@Id
	private Long doorheightid;
	private Long doorheight;
	Doorheight(){}
	public Doorheight(Long doorheightid, Long doorheight) {
		super();
		this.doorheightid = doorheightid;
		this.doorheight = doorheight;
	}
	public Long getDoorheightid() {
		return doorheightid;
	}
	public void setDoorheightid(Long doorheightid) {
		this.doorheightid = doorheightid;
	}
	public Long getDoorheight() {
		return doorheight;
	}
	public void setDoorheight(Long doorheight) {
		this.doorheight = doorheight;
	}
	@Override
	public String toString() {
		return "Doorheight [doorheightid=" + doorheightid + ", doorheight=" + doorheight + "]";
	}
}
