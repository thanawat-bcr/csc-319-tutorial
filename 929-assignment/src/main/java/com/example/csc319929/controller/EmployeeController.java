package com.example.csc319929.controller;

import com.example.csc319929.dto.EmployeeResponse;
import com.example.csc319929.repository.EmployeeInterface;
import com.example.csc319929.repository.Employees;
import com.example.csc319929.repository.Salaries;
import com.example.csc319929.repository.SalaryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeInterface employee;
    @Autowired
    private SalaryInterface salary;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public @ResponseBody List<EmployeeResponse> getAccountByNumber(@RequestParam("id") String id) {
        return employee.salaryEmployee(id);
    }
    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public @ResponseBody Salaries getSalaryByNumber(@RequestParam("id") String id) {
        return salary.findByEmpNo(id);
    }

//    @RequestMapping(value = "/salary", method = RequestMethod.POST)
//    public @ResponseBody boolean addEmployee(@RequestBody Salaries sal) {
//        salary.save(sal);
//        return true;
//    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public @ResponseBody boolean addEmployee(@RequestBody Map<String, String> json) {
        String empNo = json.get("empNo");
        String birthDate = json.get("birthDate");
        String firstName = json.get("firstName");
        String lastName = json.get("lastName");
        String gender = json.get("gender");
        String hireDate = json.get("hireDate");
        String salaryString = json.get("salary");
        String fromDate = json.get("fromDate");
        String toDate = json.get("toDate");
        Employees emp = new Employees(empNo, birthDate, firstName, lastName, gender, hireDate);
        Salaries sal = new Salaries(empNo, salaryString, fromDate, toDate);
        employee.save(emp);
        salary.save(sal);
        return true;
    }
}
