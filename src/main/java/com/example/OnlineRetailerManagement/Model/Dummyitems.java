package com.example.OnlineRetailerManagement.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
public class Dummyitems {
	private long productid;
	private long doortypeid;
	private long doorframeid;
	private long doorwidthid;
	private long doorheightid;
	private long doorpanelid;
	private long doorhandingid;
	private long doorassemblyid;
	private long doorunitfinishid;
	private long doorglasstypeid;
	private long doorglassdesignid;
	private long doorglasscoatingid;
	private long doorglassthicknessid;
	private long doorhandleid;
	private long doorhandlecolorid;
	private long doorlockid;
	private long predrillid;
	private long doorframethicknessid;
	public Dummyitems() {}
	public Dummyitems(long productid, long doortypeid, long doorframeid, long doorwidthid, long doorheightid,
			long doorpanelid, long doorhandingid, long doorassemblyid, long doorunitfinishid, long doorglasstypeid,
			long doorglassdesignid, long doorglasscoatingid, long doorglassthicknessid, long doorhandleid,
			long doorhandlecolorid, long doorlockid, long predrillid, long doorframethicknessid) {
		super();
		this.productid = productid;
		this.doortypeid = doortypeid;
		this.doorframeid = doorframeid;
		this.doorwidthid = doorwidthid;
		this.doorheightid = doorheightid;
		this.doorpanelid = doorpanelid;
		this.doorhandingid = doorhandingid;
		this.doorassemblyid = doorassemblyid;
		this.doorunitfinishid = doorunitfinishid;
		this.doorglasstypeid = doorglasstypeid;
		this.doorglassdesignid = doorglassdesignid;
		this.doorglasscoatingid = doorglasscoatingid;
		this.doorglassthicknessid = doorglassthicknessid;
		this.doorhandleid = doorhandleid;
		this.doorhandlecolorid = doorhandlecolorid;
		this.doorlockid = doorlockid;
		this.predrillid = predrillid;
		this.doorframethicknessid = doorframethicknessid;
	}
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public long getDoortypeid() {
		return doortypeid;
	}
	public void setDoortypeid(long doortypeid) {
		this.doortypeid = doortypeid;
	}
	public long getDoorframeid() {
		return doorframeid;
	}
	public void setDoorframeid(long doorframeid) {
		this.doorframeid = doorframeid;
	}
	public long getDoorwidthid() {
		return doorwidthid;
	}
	public void setDoorwidthid(long doorwidthid) {
		this.doorwidthid = doorwidthid;
	}
	public long getDoorheightid() {
		return doorheightid;
	}
	public void setDoorheightid(long doorheightid) {
		this.doorheightid = doorheightid;
	}
	public long getDoorpanelid() {
		return doorpanelid;
	}
	public void setDoorpanelid(long doorpanelid) {
		this.doorpanelid = doorpanelid;
	}
	public long getDoorhandingid() {
		return doorhandingid;
	}
	public void setDoorhandingid(long doorhandingid) {
		this.doorhandingid = doorhandingid;
	}
	public long getDoorassemblyid() {
		return doorassemblyid;
	}
	public void setDoorassemblyid(long doorassemblyid) {
		this.doorassemblyid = doorassemblyid;
	}
	public long getDoorunitfinishid() {
		return doorunitfinishid;
	}
	public void setDoorunitfinishid(long doorunitfinishid) {
		this.doorunitfinishid = doorunitfinishid;
	}
	public long getDoorglasstypeid() {
		return doorglasstypeid;
	}
	public void setDoorglasstypeid(long doorglasstypeid) {
		this.doorglasstypeid = doorglasstypeid;
	}
	public long getDoorglassdesignid() {
		return doorglassdesignid;
	}
	public void setDoorglassdesignid(long doorglassdesignid) {
		this.doorglassdesignid = doorglassdesignid;
	}
	public long getDoorglasscoatingid() {
		return doorglasscoatingid;
	}
	public void setDoorglasscoatingid(long doorglasscoatingid) {
		this.doorglasscoatingid = doorglasscoatingid;
	}
	public long getDoorglassthicknessid() {
		return doorglassthicknessid;
	}
	public void setDoorglassthicknessid(long doorglassthicknessid) {
		this.doorglassthicknessid = doorglassthicknessid;
	}
	public long getDoorhandleid() {
		return doorhandleid;
	}
	public void setDoorhandleid(long doorhandleid) {
		this.doorhandleid = doorhandleid;
	}
	public long getDoorhandlecolorid() {
		return doorhandlecolorid;
	}
	public void setDoorhandlecolorid(long doorhandlecolorid) {
		this.doorhandlecolorid = doorhandlecolorid;
	}
	public long getDoorlockid() {
		return doorlockid;
	}
	public void setDoorlockid(long doorlockid) {
		this.doorlockid = doorlockid;
	}
	public long getPredrillid() {
		return predrillid;
	}
	public void setPredrillid(long predrillid) {
		this.predrillid = predrillid;
	}
	public long getDoorframethicknessid() {
		return doorframethicknessid;
	}
	public void setDoorframethicknessid(long doorframethicknessid) {
		this.doorframethicknessid = doorframethicknessid;
	}
	@Override
	public String toString() {
		return "Dummyitems [productid=" + productid + ", doortypeid=" + doortypeid + ", doorframeid=" + doorframeid
				+ ", doorwidthid=" + doorwidthid + ", doorheightid=" + doorheightid + ", doorpanelid=" + doorpanelid
				+ ", doorhandingid=" + doorhandingid + ", doorassemblyid=" + doorassemblyid + ", doorunitfinishid="
				+ doorunitfinishid + ", doorglasstypeid=" + doorglasstypeid + ", doorglassdesignid=" + doorglassdesignid
				+ ", doorglasscoatingid=" + doorglasscoatingid + ", doorglassthicknessid=" + doorglassthicknessid
				+ ", doorhandleid=" + doorhandleid + ", doorhandlecolorid=" + doorhandlecolorid + ", doorlockid="
				+ doorlockid + ", predrillid=" + predrillid + ", doorframethicknessid=" + doorframethicknessid + "]";
	}	
}
