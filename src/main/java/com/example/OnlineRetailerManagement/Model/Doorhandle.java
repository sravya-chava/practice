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
	@Table(name="Doorhandle")
		public class Doorhandle {
			@Id
			private long doorhandleid;
			private String doorhandlename;
			Doorhandle(){}
			public Doorhandle(long doorhandleid, String doorhandlename) {
				super();
				this.doorhandleid = doorhandleid;
				this.doorhandlename = doorhandlename;
			}
			public long getDoorhandleid() {
				return doorhandleid;
			}
			public void setDoorhandleid(long doorhandleid) {
				this.doorhandleid = doorhandleid;
			}
			public String getDoorhandlename() {
				return doorhandlename;
			}
			public void setDoorhandlename(String doorhandlename) {
				this.doorhandlename = doorhandlename;
			}
			@Override
			public String toString() {
				return "Doorhandle [doorhandleid=" + doorhandleid + ", doorhandlename=" + doorhandlename + "]";
			}
	}
