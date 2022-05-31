package com.example.csc319929.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employees {
    @Id
    private String empNo;
    private String birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hireDate;

    public Employees(String empNo, String birthDate, String firstName, String lastName, String gender, String hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    @OneToMany(mappedBy = "empNo")
    List<Salaries> salaries;

}
