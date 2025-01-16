package com.tms.lesson11;

import java.util.*;

public class Service {

   public Set<Integer> printNumbersWODuplicates(List<Integer> integerList){
       Set<Integer> integerSet = new HashSet<>();
       for (int i = 0; i < integerList.size(); i++){
           integerSet.add(integerList.get(i));
       }
       return integerSet;
   }


    public Set<String> printUserNamesWODuplicates(Set<User> users){
        Set<String> userNamesWODuplicates = new HashSet<>();
        for(User user : users){
            userNamesWODuplicates.add(user.getName());
        }
        return userNamesWODuplicates;
    }

    public Set<User> printUsersByAgeAscending(Set<User> users){
        Set<User> usersByAgeAscending = new TreeSet<>();
        for (User user : users){
            usersByAgeAscending.add(user);
        }
        return usersByAgeAscending;
    }

    }




