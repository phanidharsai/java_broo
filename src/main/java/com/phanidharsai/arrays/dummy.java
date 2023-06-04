package com.phanidharsai.arrays;



public class dummy {
        public static void main(String args[]) {
            Bottom b = new Bottom();
            b.stop();
        }
    }
    class Top {
    public int start() {
        return 0;
    }
}
    class Bottom {
    Top par = new Top();
    public int stop() {
        par.start();
//        par.stop();
        return 0;
    }
}