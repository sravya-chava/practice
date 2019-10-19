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
	@Table(name="Doorhandlecolor")
	public class Doorhandlecolor {
		@Id
		private long doorhandlecolorid;
		private String doorhandlecolorname;
		Doorhandlecolor(){}
		public Doorhandlecolor(long doorhandlecolorid, String doorhandlecolorname) {
			super();
			this.doorhandlecolorid = doorhandlecolorid;
			this.doorhandlecolorname = doorhandlecolorname;
		}
		public long getDoorhandlecolorid() {
			return doorhandlecolorid;
		}
		public void setDoorhandlecolorid(long doorhandlecolorid) {
			this.doorhandlecolorid = doorhandlecolorid;
		}
		public String getDoorhandlecolorname() {
			return doorhandlecolorname;
		}
		public void setDoorhandlecolorname(String doorhandlecolorname) {
			this.doorhandlecolorname = doorhandlecolorname;
		}
		@Override
		public String toString() {
			return "Doorhandlecolor [doorhandlecolorid=" + doorhandlecolorid + ", doorhandlecolorname="
					+ doorhandlecolorname + "]";
		}
		
}
