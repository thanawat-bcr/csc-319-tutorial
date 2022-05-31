package com.example.csc319929.repository;

import com.example.csc319929.dto.EmployeeResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository 
public interface EmployeeInterface extends CrudRepository<Employees, String> {

    @Query("SELECT new com.example.csc319929.dto.EmployeeResponse(e.empNo, e.birthDate, e.firstName, e.gender, e.hireDate, e.lastName, s.salary, s.fromDate, s.toDate) FROM Employees e, Salaries s WHERE e.empNo = s.empNo AND e.empNo = ?1 ")
    public List<EmployeeResponse> salaryEmployee(String empNo);
}
