package com.example.csc319929.controller;

import com.example.csc319929.repository.EmployeeInterface;
import com.example.csc319929.repository.Employees;
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


    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public @ResponseBody Employees getAccountByNumber(@RequestParam("id") String id) {
        return employee.findByEmpNo(id);
    }
}
