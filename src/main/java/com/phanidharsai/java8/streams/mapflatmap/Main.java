package com.phanidharsai.java8.streams.mapflatmap;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class Main {
    public static void main(String[] args) {
        List<Rider> riders = new ArrayList<>();
        riders.add(new Rider("rdj", "HR2000", "HARLEY", 1310000.0, 400.0, List.of("usa", "india", "britian", "canada")));
        riders.add(new Rider("phanidharsai", "RR310", "TVS", 310000.0, 200.0, List.of("india", "canada", "usa", "brazil")));
        riders.add(new Rider("tomcruise", "m10", "BENELLI", 1910000.0, 600.0, List.of("usa", "britian", "mexico", "australia")));
        riders.add(new Rider("vidyut", "G310", "BMW", 910000.0, 300.0, List.of("india", "china", "bangladesh", "russia", "usa")));
        riders.add(new Rider("scarlet", "t120", "DUCATI", 1110000.0, 250.0, List.of("usa", "brazil", "britian", "australia")));


        /*  stream for increasing km by 100 */
        List<Double> totalKmDriven = riders.stream()
                .map(r -> r.getkmDriven() + 100)
                .collect(Collectors.toList());
//        System.out.println(totalKmDriven);

        /*  Stream for name of first rider who rode > 400km */
        String firstRider = riders.stream()
                .filter(rider -> rider.getkmDriven() > 400)
                        .map(Rider::getRiderName)
                                .findFirst().orElse("not yet");
//        System.out.println(firstRider);

        /*  Stream for first rider details who rode > 400km */
        Rider firstRider1 = riders.stream()
                .filter(rider -> rider.getkmDriven() > 400)
                .findFirst().orElse(null);
        System.out.println(firstRider1);

        /*  Stream for flat map */
        String allCountrysVisited = riders.stream()
                .map(rider -> rider.getCountrysVisited())
                .flatMap(list -> list.stream())
                .collect(Collectors.joining(","));
        System.out.print("flamap   ");
        System.out.println(allCountrysVisited);

        /* using only flat map*/
        List<String> allCountrysVisited2 = riders.stream()
                .flatMap(e->e.getCountrysVisited().stream())
                .collect(Collectors.toList()); // if we need unique countries can collect to set
        System.out.println(allCountrysVisited2);

        /* stream api to sort riders based on km driven in descending order*/
        List<String> sortedonkm= riders.stream()
//                .sorted(Comparator.comparingDouble(Rider::getkmDriven).reversed())
                .sorted((r1,r2)->(int)(r2.getkmDriven()-r1.getkmDriven()))
                .limit(2)
                .map(r->r.getRiderName())
                .collect(Collectors.toList());
//        System.out.println(sortedonkm);

        String riderNames= riders.stream()
                .map(r->r.getRiderName()
                        .toUpperCase())
                            .collect(Collectors.joining(", "));
        System.out.println(riderNames);

        Map<Double,List<Rider>> map=riders.stream()
                .collect(Collectors.groupingBy(r->r.getkmDriven(),TreeMap::new,Collectors.toList()));
//  above stream returns map with key as kmdriven and value as list of riders mapping to that kmdriven

        Map<Double,List<Rider>> map2=riders.stream()
                .collect(Collectors.groupingBy(Rider::getkmDriven));

        Map<Double,List<String>> map3=riders.stream()
                        .collect(Collectors.groupingBy(Rider::getkmDriven,TreeMap::new,Collectors.mapping(Rider::getRiderName,toList())));

// output for map3 {200.0=[phanidharsai], 250.0=[scarlet], 300.0=[vidyut], 400.0=[rdj], 600.0=[tomcruise]}
        // in above stream api grouping by takes three arguments, where "TreeMap::new" shows results in sorted order,
        //  if it is not used results are not sorted when they are collected to set

        System.out.println(map2);

    }
}