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
//    @Column(name = "emp_no")
    private String empNo;
//    @Column(name = "salary")
    private String salary;
//    @Column(name = "from_date")
    private String fromDate;
//    @Column(name = "to_date")
    private String toDate;

}
