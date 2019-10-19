package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Userclass;

@Repository
public interface UserDao extends JpaRepository<Userclass, Long> {
	Userclass findByUsername(String name);
	
	@Query("select max(id) from Userclass")
	Long findmaxuserid();
	
	@Query("select person from Userclass u where username=?1")
	String findPersonName(String username);
}
