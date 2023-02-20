package org.fasttrackit.homework.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    public Map<String, List<Person>> mapPersonsToCompany(List<Employee> employees) {
        Map<String, List<Person>> result = new HashMap<>();
        for (Employee employee : employees) {
            if (result.containsKey(employee.getCompany())) {
                result.get(employee.getCompany()).add(employee);
            } else {
                List<Person> values = new ArrayList<>();
                values.add(employee);
                result.put(employee.getCompany(), values);
            }
        }
        return result;
    }
}
