package com.hp.j2sh.project.entity;
// Generated 14 Jul, 2015 11:33:44 PM by Hibernate Tools 4.3.1



/**
 * UserOtherDetails generated by hbm2java
 */
public class UserOtherDetails  implements java.io.Serializable {


     private Integer userId;
     private String hometown;
     private String houseNo;
     private String street;
     private String city;
     private String state;
     private AllUsers allUsers;

    public UserOtherDetails() {
    }

    public UserOtherDetails(String hometown, String houseNo, String street, String city, String state) {
       this.hometown = hometown;
       this.houseNo = houseNo;
       this.street = street;
       this.city = city;
       this.state = state;
    }
   
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getHometown() {
        return this.hometown;
    }
    
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
    public String getHouseNo() {
        return this.houseNo;
    }
    
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public AllUsers getAllUsers() {
        return this.allUsers;
    }
    
    public void setAllUsers(AllUsers allUsers) {
        this.allUsers = allUsers;
    }




}

