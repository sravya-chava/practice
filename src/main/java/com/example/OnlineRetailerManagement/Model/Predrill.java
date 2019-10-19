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
	@Table(name="Predrill")
	public class Predrill {
		@Id
		private long predrillid;
		private boolean needpredrill;
		Predrill(){}
		public Predrill(long predrillid, boolean needpredrill) {
			super();
			this.predrillid = predrillid;
			this.needpredrill = needpredrill;
		}
		public long getPredrillid() {
			return predrillid;
		}
		public void setPredrillid(long predrillid) {
			this.predrillid = predrillid;
		}
		public boolean isNeedpredrill() {
			return needpredrill;
		}
		public void setNeedpredrill(boolean needpredrill) {
			this.needpredrill = needpredrill;
		}
		@Override
		public String toString() {
			return "Predrill [predrillid=" + predrillid + ", needpredrill=" + needpredrill + "]";
		}

}
