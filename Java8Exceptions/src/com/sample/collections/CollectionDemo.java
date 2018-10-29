package com.sample.collections;

import sun.misc.SoftCache;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionDemo implements  Runnable {

    @Override
    public void run() {
//        hashTable();
//        hashMap();
        removeDuplicateInCollection();
    }


    public void hashTable(){
        Hashtable<String, String> hashtable = new Hashtable<>();
        IntStream.rangeClosed(1,10)
                .forEach(n -> {
                    hashtable.put("key_"+n, "value_"+n);
                });

        hashtable.entrySet().forEach(x -> {
            System.out.println(x);
        });


    }

    public void linkedHashMap(){
        //improvise hashmap
        Map<Integer, String> pairs = new LinkedHashMap<>();
    }

    public void hashMap(){
        //hashmap deepclone

        HashMap<Integer, Employee> employeeMap = new HashMap<>();


        employeeMap.put(1, new Employee(1L,"RIMURU",LocalDate.now()));
        employeeMap.put(2, new Employee(2L,"VENDOR",LocalDate.now()));


        HashMap<Integer, Employee> clonedEmployee = (HashMap<Integer, Employee>)employeeMap.clone();


        Map<Integer, Employee> clonedUsingStream = employeeMap.entrySet()
                                                            .stream()
                                                            .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));


        employeeMap.get(1).setName("RIMURU TEMPEST");
        System.out.println(employeeMap);
        System.out.println(clonedEmployee);
        System.out.println(clonedUsingStream);


    }

    public void removeDuplicateInCollection(){
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        List<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
        alphabets.retainAll(Collections.singleton("A"));
        numbersList.retainAll( Arrays.asList(1,2));


        alphabets.removeIf(letter -> letter.startsWith("A"));

        System.out.println(alphabets);
        System.out.println(numbersList);
    }

}

class Employee {
    Long id;
    String name;
    LocalDate date;



    public Employee(Long id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

}
