package com.relntern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relntern.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role,String>  {

}
