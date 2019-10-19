package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorframethickness;

@Repository
public interface DoorFrameThicknessRepository  extends JpaRepository<Doorframethickness, Long>{

}
