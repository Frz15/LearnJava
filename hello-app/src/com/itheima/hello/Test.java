package com.itheima.hello;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "BMW";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
    }
}
