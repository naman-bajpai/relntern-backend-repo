package com.relntern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relntern.model.Mentor;


@Repository
public interface MentorRepository extends JpaRepository<Mentor,Integer> {

}
