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
	@Table(name="Doorframethickness")
	public class Doorframethickness {
		@Id
		private long doorframethicknessid;
		private String doorframethicknessname;
		Doorframethickness(){}
		public Doorframethickness(long doorframethicknessid, String doorframethicknessname) {
			super();
			this.doorframethicknessid = doorframethicknessid;
			this.doorframethicknessname = doorframethicknessname;
		}
		public long getDoorframethicknessid() {
			return doorframethicknessid;
		}
		public void setDoorframethicknessid(long doorframethicknessid) {
			this.doorframethicknessid = doorframethicknessid;
		}
		public String getDoorframethicknessname() {
			return doorframethicknessname;
		}
		public void setDoorframethicknessname(String doorframethicknessname) {
			this.doorframethicknessname = doorframethicknessname;
		}
		@Override
		public String toString() {
			return "Doorframethickness [doorframethicknessid=" + doorframethicknessid + ", doorframethicknessname="
					+ doorframethicknessname + "]";
		}
		
}
