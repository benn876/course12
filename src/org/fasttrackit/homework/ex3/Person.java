package org.fasttrackit.homework.ex3;

public class Person {
    private final String name;
    private final Integer age;
    private final String hairColor;

    public Person(String name, Integer age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Person name:%s and age:%s".formatted(name, age);
    }
}
