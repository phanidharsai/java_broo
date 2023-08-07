package com.phanidharsai.interviewquestions;

public class TowerOfHanoi {
    private static void TOH(char source, char auxillary, char destination, int numOfdisk) {
        if(numOfdisk==1) {
            System.out.println("moving disk " +source +" to "+ destination);
            return;
        }
        TOH(source,destination,auxillary,numOfdisk-1);
        System.out.println("Moving"+ " disk "+ source+" to "+ destination);
        TOH(auxillary,source,destination,numOfdisk-1);
    }
    public static void main(String[] args){
        TOH('A','B','C',3);
    }
}
