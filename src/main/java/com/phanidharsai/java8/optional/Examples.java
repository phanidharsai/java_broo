package com.phanidharsai.java8.optional;

import java.util.Optional;

public class Examples {
    public static Optional<String> changeCase(String word){
        if(word!=null && word.startsWith("P")){
            return Optional.of(word.toUpperCase()); // if word not null and starts with P returns uppercase of word
        }
        else{
            return Optional.ofNullable(word);       // returns the same word
        }
    }
    public static void main(String[] args){
        // empty() returns an empty optional object
        Optional<String> empty=Optional.empty();
        System.out.println(empty.isEmpty());      //  true
        System.out.println(empty.isPresent());    //  false

        // .of(T value) returns an optional with specified present non-null value
        Optional<String> opt = Optional.of("Phanidhar");
        System.out.println(opt.isPresent());       //  true
        System.out.println(opt.get());             // Phanidhar
        opt.ifPresentOrElse(name->System.out.println(name.length()),()->System.out.println(0));  // 9, if null prints 0

        // .ofnullable(T value) if non-null, returns an optional describing specified value,  else returns an optional
        Optional<String> nullable = Optional.ofNullable(null);
        Optional<String> value = Optional.ofNullable("Phanidhar");
        System.out.println(nullable.isPresent());   // false
        System.out.println(value.isPresent());      //  true
        System.out.println(nullable.orElseGet(()->"Sai"));   // Sai
        System.out.println(value.orElse("Sai"));       // Phanidhar

        Optional<String> res=changeCase(null);
        System.out.println(res.orElse("no word"));
    }
}
