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
//    @Column(name = "emp_no")
    private String empNo;
//    @Column(name = "birth_date")
    private String birthDate;
//    @Column(name = "first_name")
    private String firstName;
//    @Column(name = "last_name")
    private String lastName;
//    @Column(name = "gender")
    private String gender;
//    @Column(name = "hire_date")
    private String hireDate;

}
