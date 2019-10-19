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
@Table(name="Doorglasscoating")
	public class Doorglasscoating {
		@Id
		private long doorglasscoatingid;
		private String doorglasscoatingname;
		Doorglasscoating(){}
		public Doorglasscoating(long doorglasscoatingid, String doorglasscoatingname) {
			super();
			this.doorglasscoatingid = doorglasscoatingid;
			this.doorglasscoatingname = doorglasscoatingname;
		}
		public long getDoorglasscoatingid() {
			return doorglasscoatingid;
		}
		public void setDoorglasscoatingid(long doorglasscoatingid) {
			this.doorglasscoatingid = doorglasscoatingid;
		}
		public String getDoorglasscoatingname() {
			return doorglasscoatingname;
		}
		public void setDoorglasscoatingname(String doorglasscoatingname) {
			this.doorglasscoatingname = doorglasscoatingname;
		}
		@Override
		public String toString() {
			return "Doorglasscoating [doorglasscoatingid=" + doorglasscoatingid + ", doorglasscoatingname="
					+ doorglasscoatingname + "]";
		}
}
