package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorglasstype;

@Repository 
public interface DoorGlassTypeRepository extends JpaRepository<Doorglasstype, Long> {

}
