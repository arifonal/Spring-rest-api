package com.arifonal.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arifonal.model.Employee;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "enes", "bayram"));
        employeeList.add(new Employee("2", "yakup", "receber"));
        employeeList.add(new Employee("3", "bilal", "çamur"));
        employeeList.add(new Employee("4", "harun", "kaymazlar"));
        employeeList.add(new Employee("5", "yasin", "yazıcı"));

        return employeeList;
    }
}
