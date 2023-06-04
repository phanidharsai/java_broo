package com.phanidharsai.interviewquestions;

import java.util.Optional;

public class OptionalExamp {
    public static void main(String[] args){
        Optional<String> empty = Optional.empty();
        empty.isPresent(); //false

        Optional<String> opt = Optional.of("hello");
        opt.isPresent(); //true
        opt.get(); //hello
        opt.ifPresent(name -> System.out.println(name.length())); //5

        Optional<String> nullable = Optional.ofNullable(null);
        nullable.isPresent(); //false
        nullable.orElse("world"); //world
        nullable.orElseGet(() -> "world"); //world

// usage with sptreams API
//        Object users;
//        Object user = users.stream().findFirst().orElse(new User("default", "1234"));
    }
}
