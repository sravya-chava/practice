package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorhanding;

@Repository
public interface DoorHandingRepository extends JpaRepository<Doorhanding, Long>{
	@Query("select distinct w from Doorhanding w inner join Product s on w.doorhandingid = s.doorhandingid where s.doortypeid=?1 and s.doorframeid=?2 and s.doorwidthid=?3 and s.doorheightid=?4 and s.doorpanelid=?5")
	List<Doorhanding> findBydoorhanding(Long doortypeid,Long doorframeid, Long doorwidthid, Long doorheightid, Long doorpanelid);
}
