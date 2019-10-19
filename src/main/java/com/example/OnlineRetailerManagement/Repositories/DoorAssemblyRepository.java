package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorassembly;

@Repository
public interface DoorAssemblyRepository extends JpaRepository<Doorassembly, Long> {
	 @Query("select distinct w from Doorassembly w inner join Product s on w.doorassemblyid = s.doorassemblyid where s.doortypeid=?1 and s.doorframeid=?2 and s.doorwidthid=?3 and s.doorheightid=?4 and s.doorpanelid=?5 and doorhandingid=?6")
		List<Doorassembly> findBydoorassembly(Long doortypeid,Long doorframeid, Long doorwidthid, Long doorheightid, Long doorpanelid, Long doorhandingid);
}
