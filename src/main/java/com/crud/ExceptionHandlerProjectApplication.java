package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ExceptionHandlerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionHandlerProjectApplication.class, args);
        System.out.println("this is main entry point core project create by sameer!");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,7, 8, 9,10,7, 8, 9,10,11,78);
        Set<Integer> set = new HashSet<>();

        //list.forEach(System.out::println);

        list.stream()
                .filter(n -> !set.add(n))
                .sorted()
                .distinct()
                .forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,7, 8, 9,10,7, 8, 9,10,11,78);

        list1.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

    }
}
