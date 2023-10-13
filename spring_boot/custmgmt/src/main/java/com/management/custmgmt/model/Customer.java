package com.management.custmgmt.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

//@Getter
//@Setter
@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "dateJoined")
    private LocalDateTime dateJoined;


    public Customer() {
    }

    public Customer(long id, String firstName, String phoneNumber, LocalDateTime dateJoined) {
        this.id = id;
        this.fullName = fullName;
        this.dateJoined = dateJoined;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String phoneNumber, LocalDateTime dateJoined) {
        this.fullName = fullName;
        this.dateJoined =dateJoined;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;

    }


    // GETTERS
    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getDateJoined() {
        return dateJoined;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateJoined(LocalDateTime dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public String toString() {
        return "Customer [id= " + id + ", firstName= " + fullName + ", phoneNumber= " + phoneNumber + ", date joined= " + dateJoined + "]";
    }
}
