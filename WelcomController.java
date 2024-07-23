package com.example.springbootday1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomController {
   @GetMapping("/name")
   public String name(){
       return "My name is Jana";
   }
  @GetMapping("/age")
 public String age(){
        return "My age is 23";
 }
 @GetMapping("/Check/Status")
    public String CheckStatus(){
       return "Everything is OK";
 }@GetMapping("/health")
    public String health(){
       return "Server is up and running";
    }
  @GetMapping("/names")
    public String names(){
     ArrayList<String> list = new ArrayList<String>();
     list.add("Jana");
     list.add("Lama");
     return list.toString();
     }





}
