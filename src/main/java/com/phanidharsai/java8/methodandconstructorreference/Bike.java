package com.phanidharsai.java8.methodandconstructorreference;

public class Bike {
    private String name;
    private Double price;
    private Integer age;

    public Bike() {
    }

    public Bike(String name) {
        this.name = name;
    }

    public Bike(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Bike(String name, Double price, Integer age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public static int sortByAge(Bike o1, Bike o2){
         return o1.getAge().compareTo(o2.getAge());
    }
    
    public static int sortByPrice(Bike o1, Bike o2){
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
