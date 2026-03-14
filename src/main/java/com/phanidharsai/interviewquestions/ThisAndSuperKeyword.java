package com.phanidharsai.interviewquestions;

class ThisAndSuperKeyword {
    public static void main(String args[]) {
        Scaler s = new Scaler(5);
    Employee e1 = new Employee(1, "john");
    System.out.println(e1.id);
    }
}
    class InterviewBit{
        InterviewBit(){
            System.out.println(" Welcome to InterviewBit ");
        }
    }
    class Scaler extends InterviewBit {
        Scaler() {
            System.out.println(" Welcome to Scaler Academy ");
        }

        Scaler(int x) {
            this();
//        super();
            System.out.println(" Welcome to Scaler Academy 2");
        }
    }

class Employee{
    public int id;
    private String name;

    Employee(int id, String name){
        this.name=name;
        this.id=id;
    }
}

/*      The above code will throw the compilation error if super is not commented. It is because the super() is used
        to call the parent class constructor. But there is the condition that super() must be the first
        statement in the block. Now in this case, if we replace this() with super() then also it will
        throw the compilation error. Because this() also has to be the first statement in the block.
        So in conclusion, we can say that we cannot use this() and super() keywords in the same block */

