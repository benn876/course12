package org.fasttrackit.homework.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mihai",44,"brown"));
        persons.add(new Person("Maria",31,"blonde"));
        persons.add(new Person("Ioana",24,"blonde"));

        System.out.println(personService.getPersonNames(persons));

        Map<String,List<String>>  mapHairColorToName = personService.mapHairColorToName(persons);
        System.out.println(mapHairColorToName);
    }
}
