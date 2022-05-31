package com.example.csc319929.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salaries")
public class Salaries {
    @Id
    private int empNo;
    private int salary;
    private String fromDate;
    private String toDate;

}
