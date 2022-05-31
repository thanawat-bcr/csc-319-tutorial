package com.example.csc319929.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salaries {
    @Id
    private String empNo;
    private String salary;
    private String fromDate;
    private String toDate;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "empNo")
//    private Employees employees;
}
