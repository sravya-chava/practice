package com.example.OnlineRetailerManagement.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Userclass implements UserDetails{
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String username;
	private String password;	
	private String shippingstreet;
	private String shippingapt;
	private String shippingcity;
	private String shippingstate;
	private String shippingzipcode;
	private String mailingstreet;
	private String mailingapt;
	private String mailingcity;
	private String mailingstate;
	private String mailingzipcode;
	private String person;
	
	public Userclass() {}
	
	public Userclass(Long id, String firstName, String lastName, String phone, String email, String username,
			String password, String shippingstreet, String shippingapt, String shippingcity, String shippingstate,
			String shippingzipcode, String mailingstreet, String mailingapt, String mailingcity, String mailingstate,
			String mailingzipcode, String person, Set<UserRole> userroles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.username = username;
		this.password = password;
		this.shippingstreet = shippingstreet;
		this.shippingapt = shippingapt;
		this.shippingcity = shippingcity;
		this.shippingstate = shippingstate;
		this.shippingzipcode = shippingzipcode;
		this.mailingstreet = mailingstreet;
		this.mailingapt = mailingapt;
		this.mailingcity = mailingcity;
		this.mailingstate = mailingstate;
		this.mailingzipcode = mailingzipcode;
		this.userroles = userroles;
		this.person = person;
	}
	public String getShippingstreet() {
		return shippingstreet;
	}
	public void setShippingstreet(String shippingstreet) {
		this.shippingstreet = shippingstreet;
	}
	public String getShippingapt() {
		return shippingapt;
	}
	public void setShippingapt(String shipppingapt) {
		this.shippingapt = shipppingapt;
	}
	public String getShippingcity() {
		return shippingcity;
	}
	public void setShippingcity(String shippingcity) {
		this.shippingcity = shippingcity;
	}
	public String getShippingstate() {
		return shippingstate;
	}
	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}
	public String getShippingzipcode() {
		return shippingzipcode;
	}
	public void setShippingzipcode(String shippingzipcode) {
		this.shippingzipcode = shippingzipcode;
	}
	public String getMailingstreet() {
		return mailingstreet;
	}
	public void setMailingstreet(String mailingstreet) {
		this.mailingstreet = mailingstreet;
	}
	public String getMailingapt() {
		return mailingapt;
	}
	public void setMailingapt(String mailingapt) {
		this.mailingapt = mailingapt;
	}
	public String getMailingcity() {
		return mailingcity;
	}
	public void setMailingcity(String mailingcity) {
		this.mailingcity = mailingcity;
	}
	public String getMailingstate() {
		return mailingstate;
	}
	public void setMailingstate(String mailingstate) {
		this.mailingstate = mailingstate;
	}
	public String getMailingzipcode() {
		return mailingzipcode;
	}
	public void setMailingzipcode(String mailingzipcode) {
		this.mailingzipcode = mailingzipcode;
	}

	
	public Set<UserRole> getUserroles() {
		return userroles;
	}
	public void setUserroles(Set<UserRole> userroles) {
		this.userroles = userroles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<UserRole> userroles = new HashSet<>(); 
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		Set<GrantedAuthority> authorities = new HashSet<>();
        userroles.forEach(ur -> authorities.add(new Authority(ur.getRole().getName())));
        return authorities;
        
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Userclass [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", username=" + username + ", password=" + password + ", shippingstreet="
				+ shippingstreet + ", shippingapt=" + shippingapt + ", shippingcity=" + shippingcity
				+ ", shippingstate=" + shippingstate + ", shippingzipcode=" + shippingzipcode + ", mailingstreet="
				+ mailingstreet + ", mailingapt=" + mailingapt + ", mailingcity=" + mailingcity + ", mailingstate="
				+ mailingstate + ", mailingzipcode=" + mailingzipcode + ", person=" + person + ", userroles="
				+ userroles + "]";
	}	
}
