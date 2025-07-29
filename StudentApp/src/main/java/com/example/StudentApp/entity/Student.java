package com.example.StudentApp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @Email(message = "Invalid format")
    @Column(name="email")
    private String mailId;
    @Pattern(regexp  ="\\d{10}",message="invalid phone no")
    @Column(name="phone_No")
    private String phoneNo;
    @Min(value=0,message = "value must be above 0")
    @Max(value=100,message = "value must be below 100")
    private int mark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
