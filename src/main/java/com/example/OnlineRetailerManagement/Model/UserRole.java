package com.example.OnlineRetailerManagement.Model;

	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;


	@Entity
	@Table(name="user_role")
	public class UserRole {
		@Id
	    private long userRoleId;
		
		@ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "user_id")
	    private Userclass user;
	
		@ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "role_id")
	    private Role role;
		
		public UserRole() {}
		
	    public UserRole(Long id,Userclass user, Role role) {
	        this.user = user;
	        this.userRoleId=id;
	        this.role = role;
	    }


	    public long getUserRoleId() {
	        return userRoleId;
	    }

	    public void setUserRoleId(long userRoleId) {
	        this.userRoleId = userRoleId;
	    }
	    public Userclass getUser() {
			return user;
		}
		public void setUser(Userclass user) {
			this.user = user;
		}


		public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }


		@Override
		public String toString() {
			return "UserRole [userRoleId=" + userRoleId + ", user=" + user + ", role=" + role + "]";
		}
	    
	    

}
