package com.example.csc319929.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EmployeeInterface extends CrudRepository<Employees, String> {

    public Employees findByEmpNo(String empNo);
}