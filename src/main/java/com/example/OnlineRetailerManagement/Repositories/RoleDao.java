package com.example.OnlineRetailerManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineRetailerManagement.Model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
