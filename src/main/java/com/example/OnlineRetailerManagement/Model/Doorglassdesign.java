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
@Table(name="Doorglassdesign")
	public class Doorglassdesign {
		@Id
		private long doorglassdesignid;
		private String doorglassdesignname;
		Doorglassdesign(){}
		public Doorglassdesign(long doorglassdesignid, String doorglassdesignname) {
			super();
			this.doorglassdesignid = doorglassdesignid;
			this.doorglassdesignname = doorglassdesignname;
		}
		public long getDoorglassdesignid() {
			return doorglassdesignid;
		}
		public void setDoorglassdesignid(long doorglassdesignid) {
			this.doorglassdesignid = doorglassdesignid;
		}
		public String getDoorglassdesignname() {
			return doorglassdesignname;
		}
		public void setDoorglassdesignname(String doorglassdesignname) {
			this.doorglassdesignname = doorglassdesignname;
		}
		@Override
		public String toString() {
			return "Doorglassdesign [doorglassdesignid=" + doorglassdesignid + ", doorglassdesignname="
					+ doorglassdesignname + "]";
		}
		
}
