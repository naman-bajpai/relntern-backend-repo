package com.relntern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relntern.model.Intern;

@Repository
public interface InternRepository extends JpaRepository<Intern,Integer>{

}
