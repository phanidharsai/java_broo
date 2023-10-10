package com.phanidharsai.dsa.strings;

import java.util.Scanner;

public class IndexOfFirstOccurrence {
    public static void findIndex(String haystack, String needle){
        if(!haystack.contains(needle)){
            System.out.println("not found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String haystack= sc.nextLine();
        String needle= sc.nextLine();
        findIndex(haystack,needle);
    }
}
