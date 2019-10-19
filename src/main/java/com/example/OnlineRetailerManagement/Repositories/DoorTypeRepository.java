package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doortype;

@Repository
public interface DoorTypeRepository extends JpaRepository<Doortype, Long>{
	
	Doortype findBydoortypename(String doortypename);
	
	@Query("select doortypename from Doortype s where s.doortypeid=?1")
	String findBydoortype(long doortypeid);
}
