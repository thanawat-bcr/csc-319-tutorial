package com.example.csc319929.controller;

import com.example.csc319929.repository.EmployeeInterface;
import com.example.csc319929.repository.Employees;
import com.example.csc319929.repository.Salaries;
import com.example.csc319929.repository.SalaryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeInterface employee;
    @Autowired
    private SalaryInterface salary;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public @ResponseBody Employees getAccountByNumber(@RequestParam("id") String id) {
        return employee.findByEmpNo(id);
    }
    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public @ResponseBody Salaries getSalaryByNumber(@RequestParam("id") String id) {
        return salary.findByEmpNo(id);
    }
}
