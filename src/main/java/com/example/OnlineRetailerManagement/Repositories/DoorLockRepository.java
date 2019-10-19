package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Doorlock;
@Repository
public interface DoorLockRepository extends JpaRepository<Doorlock, Long>{

}
