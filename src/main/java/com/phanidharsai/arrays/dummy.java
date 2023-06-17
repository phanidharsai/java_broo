package com.phanidharsai.arrays;



public class dummy {
        public static void main(String args[]) {
            Bottom b = new Bottom();
            b.stop();
        }
    }
    class Top {
    public int start() {
        System.out.println("in top start");
        return 0;
    }
}
    class Bottom {
    Top par = new Top();
    public int stop() {
//        par.start();
        System.out.println("in bottom stop");
//        par.stop();
        return 0;
    }
}