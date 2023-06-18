package com.phanidharsai.interviewquestions;

class ControlFlowComplex{
    int i;
    static int j;
    {
        System.out.println(" Instance Block 1. Value of i = "+i);
    }
    static{
        System.out.println(" Static Block 1. Value of j = "+j);
        method_2();
    }
    {
        i = 5;
    }
    static{
        j = 10;
    }
    ControlFlowComplex(){
        System.out.println(" Welcome to InterviewBit ");
    }
    public static void main(String[] args){
        ControlFlowComplex ib = new ControlFlowComplex();
    }
    public void method_1(){
        System.out.println(" Instance method. ");
    }
    static{
        System.out.println(" Static Block 2. Value of j = "+j);
    }
    {
        System.out.println(" Instance Block 2. Value of i = "+i);
        method_1();
    }
    public static void method_2(){
        System.out.println(" Static method. ");
    }
}

/* steps followed in above code
1)Identification of Static Members from top to bottom.
2)Execution of Static variable assignment and a Static block from top to bottom.
3)Execution of the main method.
4)Identification of Instance Members from top to bottom.
5)Execution of Instance variable assignment and Instance block from top to bottom.
6)Execution of Constructor.
 */
