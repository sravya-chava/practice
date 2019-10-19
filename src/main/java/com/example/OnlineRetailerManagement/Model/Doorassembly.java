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
@Table(name="Doorassembly")
	public class Doorassembly {
		@Id
		private long doorassemblyid;
		private String doorassemblyname;
		Doorassembly(){}
		public Doorassembly(long doorassemblyid, String doorassemblyname) {
			super();
			this.doorassemblyid = doorassemblyid;
			this.doorassemblyname = doorassemblyname;
		}
		public long getDoorassemblyid() {
			return doorassemblyid;
		}
		public void setDoorassemblyid(long doorassemblyid) {
			this.doorassemblyid = doorassemblyid;
		}
		public String getDoorassemblyname() {
			return doorassemblyname;
		}
		public void setDoorassemblyname(String doorassemblyname) {
			this.doorassemblyname = doorassemblyname;
		}
		@Override
		public String toString() {
			return "Doorassembly [doorassemblyid=" + doorassemblyid + ", doorassemblyname=" + doorassemblyname + "]";
		}
		

}
