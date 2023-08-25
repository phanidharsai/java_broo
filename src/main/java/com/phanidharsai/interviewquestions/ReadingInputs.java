package com.phanidharsai.interviewquestions;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int intValue= sc.nextInt();
//        double doubleValue= sc.nextDouble();
//        String str = sc.nextLine();
//        System.out.println(intValue);
//        System.out.println(doubleValue);
//        System.out.println(str);

//        the above code doesnt take input after reading double value because sc.nextDouble()
//        doesnt take new line as input which happens when you press enter after entering double value
//        for the above code to work use sc.nextLine() after reading double or int value
//        Scanner sc = new Scanner(System.in);
//        int intValue= sc.nextInt();
//        double doubleValue= sc.nextDouble();
//        sc.nextLine();
//        String str = sc.nextLine();
//        System.out.println(intValue);
//        System.out.println(doubleValue);
//        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int intValue= sc.nextInt();
                    System.out.println(intValue);
        }
        else if(sc.hasNextDouble()){
            double doubleValue= sc.nextDouble();
                    System.out.println(doubleValue);
        }
        else{
            String str = sc.nextLine();
                    System.out.println(str);
        }

    }
}
