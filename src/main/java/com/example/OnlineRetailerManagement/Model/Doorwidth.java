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
@Table(name="Doorwidth")
public class Doorwidth {
	@Id
	private Long doorwidthid;
	private Long doorwidth;
	Doorwidth(){}
	public Doorwidth(Long doorwidthid, Long doorwidth) {
		super();
		this.doorwidthid = doorwidthid;
		this.doorwidth = doorwidth;
	}
	public Long getDoorwidthid() {
		return doorwidthid;
	}
	public void setDoorwidthid(Long doorwidthid) {
		this.doorwidthid = doorwidthid;
	}
	public Long getDoorwidth() {
		return doorwidth;
	}
	public void setDoorwidth(Long doorwidth) {
		this.doorwidth = doorwidth;
	}	
}
