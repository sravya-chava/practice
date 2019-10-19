package com.example.OnlineRetailerManagement.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorglassdesign;

@Repository
public interface DoorGlassDesignRepository extends JpaRepository<Doorglassdesign, Long> {
	
}
