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
@Table(name="Doorglassthickness")
	public class Doorglassthickness {
		@Id
		private long doorglassthicknessid;
		private String doorglassthicknessidname;
		Doorglassthickness(){}
		public Doorglassthickness(long doorglassthicknessid, String doorglassthicknessidname) {
			super();
			this.doorglassthicknessid = doorglassthicknessid;
			this.doorglassthicknessidname = doorglassthicknessidname;
		}
		public long getDoorglassthicknessid() {
			return doorglassthicknessid;
		}
		public void setDoorglassthicknessid(long doorglassthicknessid) {
			this.doorglassthicknessid = doorglassthicknessid;
		}
		public String getDoorglassthicknessidname() {
			return doorglassthicknessidname;
		}
		public void setDoorglassthicknessidname(String doorglassthicknessidname) {
			this.doorglassthicknessidname = doorglassthicknessidname;
		}
		@Override
		public String toString() {
			return "Doorglassthickness [doorglassthicknessid=" + doorglassthicknessid + ", doorglassthicknessidname="
					+ doorglassthicknessidname + "]";
		}
}
