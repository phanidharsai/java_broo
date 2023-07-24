package com.phanidharsai.strings;

public class StringImmuExp {
    public static void main(String[] args) {
            String s = new String("phani");
            s.concat("sai");
            System.out.println(s);
            String s2=new String("s");
            String s3=new String("s");
            System.out.println(s2.hashCode());
            System.out.println(s3.hashCode());
            System.out.println(s2==s3);
            byte[] b= {90,91,92};
            String p= new String();
            System.out.println(p.isEmpty());

        }
    }

