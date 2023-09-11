package com.phanidharsai.designpatterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    public String ShopName;

    public List<Book> bookList = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadData(){
        for(int i=1;i<11;i++){
            Book b = new Book();
            b.setId(i);
            b.setName("Book"+i);
            getBookList().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "ShopName='" + ShopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
//    shallow cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//    deep cloning
    public BookShop clone(){
        BookShop newBs = new BookShop();
        for(Book b:this.getBookList()){
            newBs.getBookList().add(b);
        }
        return newBs;
    }
}
