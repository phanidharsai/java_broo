package com.phanidharsai.interviewquestions;

public class TowerOfHanoi {
    private static void TOH(char source, char auxillary, char destination, int numOfdisk) {
        if(numOfdisk>0){
            TOH(source,destination,auxillary,numOfdisk-1);
            System.out.println("Moving 1 disk "+ source+" to "+ destination+" using "+auxillary);
            TOH(auxillary,source,destination,numOfdisk-1);

        }
    }
    public static void main(String[] args){
        TOH('A','B','C',2);
    }
}
