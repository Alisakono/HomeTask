package de.telran;

import java.util.Scanner;

import static java.lang.System.in;

public class HT1110233 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Введите первое целое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scan.nextInt();
        System.out.println("Введите третье целое число: ");
        int c = scan.nextInt();

        int max = Math.max(Math.max(a, b), c);

        System.out.println("Максимальное из 3 чисел: " + max);
    }
}
       /* 3) Реализуйте программу, которая попросит пользователя ввести три целых
        числа (используйте сканер). Напишите метод getMax, который принимает
        эти 3 параметра и возвращает наибольший из них.
        Напечатает максимум из трех чисел.*/


