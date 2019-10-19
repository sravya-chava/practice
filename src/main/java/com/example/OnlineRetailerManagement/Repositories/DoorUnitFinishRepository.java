package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorunitfinish;
@Repository
public interface DoorUnitFinishRepository extends JpaRepository<Doorunitfinish, Long> {
	@Query("select distinct w from Doorunitfinish w inner join Product s on w.doorunitfinishid = s.doorunitfinishid where s.doortypeid=?1 and s.doorframeid=?2 and s.doorwidthid=?3 and s.doorheightid=?4 and s.doorpanelid=?5 and s.doorhandingid=?6 and s.doorassemblyid=?7")
	List<Doorunitfinish> findBydoorunitfinish(Long doortypeid,Long doorframeid, Long doorwidthid, Long doorheightid, Long doorpanelid, Long doorhandingid, Long doorassemblyid);
}
