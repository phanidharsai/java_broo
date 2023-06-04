package com.phanidharsai.loops;

public class Calender {
        public static void main(String[] args) {
            System.out.println("SUN" +" MON"+ " TUE"+" WED"+" THU"+" FRI"+" SAT" );
            int daycount=1;
            int count=0;
            while (count!=5) {
                System.out.print("    ");
                count++;
            }
            while(daycount<32) {
                if(count%7==0) {
                    System.out.println();
                }
                if(daycount<10) {
                    System.out.print(daycount+"   ");
                }
                else if(daycount>9) {
                    System.out.print(daycount+"  ");
                }
                count++;
                daycount++;
            }
        }

    }

