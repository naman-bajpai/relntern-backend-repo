package com.relntern.model;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import com.relntern.model.Role;
import jakarta.persistence.*;

@Entity
@Table(name="MentorDetails")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mentorid; 
	private String mentorname;
	private String mentoremail;
	private String projectstatus;
	
	private String project;
	private String Role;
	private String Association; 
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLE",
	joinColumns = {
			@JoinColumn(name="USER_ID")
			
	},
	inverseJoinColumns = {
		@JoinColumn(name="ROLE_ID")
	}
	)
	
	private Set<Role> role;
	
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	public int getMentorid() {
		return mentorid;
	}
	public void setMentorid(int mentorid) {
		this.mentorid = mentorid;
	}
	public String getMentorname() {
		return mentorname;
	}
	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}
	public String getMentoremail() {
		return mentoremail;
	}
	public void setMentoremail(String mentoremail) {
		this.mentoremail = mentoremail;
	}
	
	public String getProjectstatus() {
		return projectstatus;
	}
	public void setProjectstatus(String projectstatus) {
		this.projectstatus = projectstatus;
	}
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getAssociation() {
		return Association;
	}
	public void setAssociation(String association) {
		Association = association;
	}
	
		
}
