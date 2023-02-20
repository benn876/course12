package org.fasttrackit.homework.ex3;

public class Employee extends Person {
    private final String company;
    private final Integer salary;

    public Employee(String company, Integer salary, String name, Integer age, String hairColor) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
