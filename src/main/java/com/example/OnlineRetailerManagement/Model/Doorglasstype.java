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
	@Table(name="Doorglasstype")
		public class Doorglasstype {
			@Id
			private long doorglasstypeid;
			private String doorglasstypename;
			Doorglasstype(){}
			public Doorglasstype(long doorglasstypeid, String doorglasstypename) {
				super();
				this.doorglasstypeid = doorglasstypeid;
				this.doorglasstypename = doorglasstypename;
			}
			public long getDoorglasstypeid() {
				return doorglasstypeid;
			}
			public void setDoorglasstypeid(long doorglasstypeid) {
				this.doorglasstypeid = doorglasstypeid;
			}
			public String getDoorglasstypename() {
				return doorglasstypename;
			}
			public void setDoorglasstypename(String doorglasstypename) {
				this.doorglasstypename = doorglasstypename;
			}
			@Override
			public String toString() {
				return "Doorglasstype [doorglasstypeid=" + doorglasstypeid + ", doorglasstypename=" + doorglasstypename
						+ "]";
			}
			
}
