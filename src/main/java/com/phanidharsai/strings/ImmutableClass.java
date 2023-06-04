package com.phanidharsai.strings;

public final class ImmutableClass {
    private int i;

    public ImmutableClass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public ImmutableClass modify(int input){
        if(this.i==input){
          return this;
        }
        else{
            return new ImmutableClass(input);
        }
}

    public static void main(String[] args){
        ImmutableClass i1= new ImmutableClass(10);
        ImmutableClass i2= i1.modify(100);
        ImmutableClass i3= i1.modify(10);
        System.out.println(i1==i2);
        System.out.println(i2==i3);
        System.out.println(i1==i3);

    }
}
