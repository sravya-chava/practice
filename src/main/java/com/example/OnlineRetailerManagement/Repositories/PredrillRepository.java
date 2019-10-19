package com.example.OnlineRetailerManagement.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Predrill;
@Repository
public interface PredrillRepository extends JpaRepository<Predrill, Long> {

}
