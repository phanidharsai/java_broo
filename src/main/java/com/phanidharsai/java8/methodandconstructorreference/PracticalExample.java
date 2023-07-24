package com.phanidharsai.java8.methodandconstructorreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalExample {
    public static void main(String[] args){
          List<Bike> bikeList = new ArrayList<>();
                  bikeList.add(new Bike("RR310",300000.0,0));
                  bikeList.add(new Bike("1250GS",2100000.0,0));
                  bikeList.add(new Bike("1200RS",2300000.0,0));

        //using lambda
        bikeList.forEach(bike->System.out.println(bike));

        // using method reference
        bikeList.forEach(System.out::println);

        //using lambda list of bike names in lowercase
        bikeList.stream().map(bike->bike.getName())
                .map(name->name.toLowerCase())
                .forEach(name->System.out.println(name));

        //using method reference list of bike names in lowercase
        bikeList.stream()
                .map(Bike::getName)
                .map(String::toLowerCase)
                .forEach(System.out::println);

        // using lammda to sort by price
        List<Bike> sortedByPrice=bikeList.stream()
                .sorted((bike1,bike2)->Bike.sortByPrice(bike1,bike2))
                .collect(Collectors.toList());
        System.out.println(sortedByPrice);
        // using method reference to sort by price
        bikeList.stream().sorted(Bike::sortByPrice).forEach(System.out::println);

    }
}
