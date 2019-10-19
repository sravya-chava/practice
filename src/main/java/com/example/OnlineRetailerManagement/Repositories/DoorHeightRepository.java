package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorheight;

@Repository
public interface DoorHeightRepository extends JpaRepository<Doorheight, Long>{
	 @Query("select distinct w from Doorheight w inner join Product s on w.doorheightid = s.doorheightid where s.doortypeid=?1 and s.doorframeid=?2 and s.doorwidthid=?3")
		List<Doorheight> findBydoorheight(Long doortypeid,Long doorframeid, Long doorwidthid);
	 
	 @Query("select doorheight from Doorheight s where s.doorheightid=?1")
		Long findBydoorheight(long doorheightid);
}

