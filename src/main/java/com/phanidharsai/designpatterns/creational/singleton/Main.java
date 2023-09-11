package com.phanidharsai.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bs = new BookShop();
        bs.setShopName("myShop");
        bs.loadData();
        System.out.println(bs);

//        BookShop bs2 = (BookShop)bs.clone(); // shallow cloning

        BookShop bs2 = bs.clone();
        bs.getBookList().remove(1);

        System.out.println(bs);
        System.out.println(bs2);

    }
}
