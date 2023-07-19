package com.relntern.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "InactiveInternData")
public class InactiveIntern {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String mentor;
    private String mentoremail;
    private String projectname;
	private String linkedlink;
    private String quarter;
    private int projectstatus;
    private Date startDate;
    private Date endDate;
    private String role;
    private String association;
    private String fullname;
    private Date gradyear;
    private String uniname;
    private String coursename;
    private String specialization;
    private String reference;
    
    
    public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getLinkedlink() {
 		return linkedlink;
 	}

 	public void setLinkedlink(String linkedlink) {
 		this.linkedlink = linkedlink;
 	}

 	public String getQuarter() {
 		return quarter;
 	}

 	public void setQuarter(String quarter) {
 		this.quarter = quarter;
 	}

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Date getGradyear() {
        return gradyear;
    }

    public void setGradyear(Date gradyear) {
        this.gradyear = gradyear;
    }

    public String getUniname() {
        return uniname;
    }

    public void setUniname(String uniname) {
        this.uniname = uniname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getMentoremail() {
        return mentoremail;
    }

    public void setMentoremail(String mentoremail) {
        this.mentoremail = mentoremail;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getProjectstatus() {
        return projectstatus;
    }

    public void setProjectstatus(int projectstatus) {
        this.projectstatus = projectstatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
