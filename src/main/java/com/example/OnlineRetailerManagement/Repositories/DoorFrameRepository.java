package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorframe;

@Repository
public interface DoorFrameRepository extends JpaRepository<Doorframe, Long>{
	@Query(" select distinct d from Doorframe d inner join Product s on d.doorframeid = s.doorframeid where s.doortypeid=?1")
	List<Doorframe> findBydoorframename(Long doorframeid);

	
	@Query("select doorframename from Doorframe s where s.doorframeid=?1")
	String findBydoorframe(long doorframeid);
}
