package com.itheima.hello;

import java.util.Random;
import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in your age:");
        int age = sc.nextInt();
        System.out.println(age);

        Random r = new Random();
        int data = r.nextInt(10) + 1;
        System.out.println(data);

        HelloWorld a = new HelloWorld();
        String[] aaaa = {"efw","fwe"};
        a.main(aaaa);
    }
}
