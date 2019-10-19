package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorhandlecolor;

@Repository
public interface DoorHandleColorRepository extends JpaRepository<Doorhandlecolor, Long> {

}
