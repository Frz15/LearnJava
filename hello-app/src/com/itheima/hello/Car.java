package com.itheima.hello;

public class Car {

    String name;
    double price;

    Car(){
        System.out.println("non variable constructor");
    }

    public void start(){
        System.out.println( name + " starts!");
    }

    public void run(){
        System.out.println( name + " runs!");
    }
}
