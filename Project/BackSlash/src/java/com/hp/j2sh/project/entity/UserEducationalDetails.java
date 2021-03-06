package com.hp.j2sh.project.entity;
// Generated 14 Jul, 2015 11:33:44 PM by Hibernate Tools 4.3.1



/**
 * UserEducationalDetails generated by hbm2java
 */
public class UserEducationalDetails  implements java.io.Serializable {


     private Integer userId;
     private String lastInstitution;
     private String degree;
     private String major;
     private Integer yearCompleted;
     private AllUsers allUsers;

    public UserEducationalDetails() {
    }

    public UserEducationalDetails(String lastInstitution, String degree, String major, Integer yearCompleted) {
       this.lastInstitution = lastInstitution;
       this.degree = degree;
       this.major = major;
       this.yearCompleted = yearCompleted;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getLastInstitution() {
        return this.lastInstitution;
    }
    
    public void setLastInstitution(String lastInstitution) {
        this.lastInstitution = lastInstitution;
    }
    public String getDegree() {
        return this.degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getMajor() {
        return this.major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    public Integer getYearCompleted() {
        return this.yearCompleted;
    }
    
    public void setYearCompleted(Integer yearCompleted) {
        this.yearCompleted = yearCompleted;
    }
    public AllUsers getAllUsers() {
        return this.allUsers;
    }
    
    public void setAllUsers(AllUsers allUsers) {
        this.allUsers = allUsers;
    }




}


