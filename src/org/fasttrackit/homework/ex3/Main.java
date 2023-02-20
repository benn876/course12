package org.fasttrackit.homework.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Facebook", 4000, "Andrei", 32, "blonde"));
        employees.add(new Employee("Google", 4500, "Ligia", 31, "brown"));
        employees.add(new Employee("Google", 8000, "Ion", 55, "bald"));
        employees.add(new Employee("Microsoft", 5000, "Paul", 27, "bald"));

        Map<String, List<Person>> result = employeeService.mapPersonsToCompany(employees);
        System.out.println(result);
        Person person = result.get("Google").get(0);
        if(person instanceof Employee){
            System.out.println(((Employee) person).getCompany());
        }
    }
}
