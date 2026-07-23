package com.crud.controller;

import com.crud.exception.TestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
               @GetMapping("/api1")
               public String method(){
                   try {
                       int a = 10/0;

                   }
                 catch (Exception e) {

                     return  e.getMessage();
                 }
                   return "d";
               }


    @GetMapping("/api2")
    public String method2(){


        try {
            String a = null;
            int b = a.length();

            System.out.println(b);
        }
        catch (Exception e) {
           return e.getMessage();
        }

        return null;
    }

    @GetMapping("/api3")
    public String method3() throws TestException{
                   throw new TestException("this is a test exception");
     //   return "This is a third method!!";

    }
}
