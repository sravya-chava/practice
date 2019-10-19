package com.example.OnlineRetailerManagement.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorwidth;

@Repository
public interface DoorWidthRepository extends JpaRepository <Doorwidth, Long>{
 @Query("select distinct w from Doorwidth w inner join Product s on w.doorwidth = s.doorwidthid where s.doortypeid=?1 and s.doorframeid=?2")
		List<Doorwidth> findBydoorwidth(Long doortypeid,Long doorframeid);
 @Query("select doorwidth from Doorwidth s where s.doorwidthid=?1")
 	Long finddoorwidth(Long doorwidthid);
}
