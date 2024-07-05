package com.pioneers.medmartbck.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.medmartbck.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);

}
