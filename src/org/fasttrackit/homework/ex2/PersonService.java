package org.fasttrackit.homework.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

    public List<String> getPersonNames(List<Person> persons) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.name());
        }
        return result;
    }

    public Map<String, List<String>> mapHairColorToName(List<Person> persons) {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            if(result.containsKey(person.hairColor())){
                result.get(person.hairColor()).add(person.name());
            } else {
                List<String> names = new ArrayList<>();
                names.add(person.name());
                result.put(person.hairColor(), names);
            }
        }
        return result;
    }
}
