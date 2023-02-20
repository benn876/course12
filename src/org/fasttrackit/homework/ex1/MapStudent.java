package org.fasttrackit.homework.ex1;

import java.util.*;

public class MapStudent {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Mihai", 7);
        studentMap.put("George", 8);
        studentMap.put("Ioana", 10);
        studentMap.put("Ion", 7);
        studentMap.put("Jojo", 10);

        List<String> studentsWithHeightsGrade = new ArrayList<>();
        Integer heightsGrade = 0;
        for(Map.Entry<String,Integer> entry: studentMap.entrySet()){
            if (entry.getValue() > heightsGrade){
                heightsGrade=entry.getValue();
                studentsWithHeightsGrade.clear();
                studentsWithHeightsGrade.add(entry.getKey());
            } else if(heightsGrade.equals(entry.getValue())){
                studentsWithHeightsGrade.add(entry.getKey());
            }
        }

        System.out.println(studentsWithHeightsGrade);

        Map.Entry<String, Integer> max = Collections.max(studentMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        System.out.println(max);

    }
}
