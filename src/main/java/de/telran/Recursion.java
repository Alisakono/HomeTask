package de.telran;

import java.util.Random;

public class Recursion {
    public static void main(String[] args) throws InterruptedException {
        int start = new Random().nextInt(100);
        System.out.println("Start: " + start);
        count(start);

    }
    static void count(int start) throws InterruptedException {
        System.out.println(start);
        Thread.sleep(1000);
        count(+1);

    }
}
