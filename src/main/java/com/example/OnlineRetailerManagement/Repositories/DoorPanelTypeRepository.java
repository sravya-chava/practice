package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorpaneltype;

@Repository
public interface DoorPanelTypeRepository extends JpaRepository<Doorpaneltype, Long> {
	 @Query("select distinct w from Doorpaneltype w inner join Product s on w.doorpanelid = s.doorpanelid where s.doortypeid=?1 and s.doorframeid=?2 and s.doorwidthid=?3 and s.doorheightid=?4")
		List<Doorpaneltype> findBydoorpanel(Long doortypeid,Long doorframeid, Long doorwidthid, Long doorheightid);
}
