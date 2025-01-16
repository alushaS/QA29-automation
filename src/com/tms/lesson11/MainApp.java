package com.tms.lesson11;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);

        Service listService = new Service();


        Map<Integer, Long> collection =  integerList.stream()
                .collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));


        System.out.println(collection);

        var numbersWODuplicates = listService.printNumbersWODuplicates(integerList);

        System.out.println(numbersWODuplicates);

        Set<User> users = new HashSet<>();
        users.add(new User(18,"Александр"));
        users.add(new User(22,"Александр"));
        users.add(new User(21,"Ольга"));
        users.add(new User(17,"Мария"));
        users.add(new User(25,"Иван"));
        users.add(new User(27,"Мария"));

        var names = listService.printUserNamesWODuplicates(users);
        System.out.println(names);

        var usersByAge = listService.printUsersByAgeAscending(users);
        System.out.println(usersByAge);

    }

}
