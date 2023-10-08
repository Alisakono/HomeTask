package de.telran;

import java.util.Scanner;

public class Ht0510231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите основание системы счисления: ");
        int numSystem = scan.nextInt();
        System.out.println("Введите число: " );
        String numberStr = scan.next();
        System.out.println("В какую систему счисления преобразовать: ");
        int numSystemOut = scan.nextInt();

            long number = Long.parseLong(numberStr, numSystem);

            String numberOutStr = Long.toString(number, numSystemOut);


        System.out.println("Наше число в "+numSystemOut+" система счисления равно "+numberOutStr);
        }
    }

 /*1 уровень сложности: N1
Переведите число 333 из 16-ричной в 10-ричную
Переведите число 819 из 10-ричной в 16-ричную
101101 в двоичной, переведите в 10-ричную
124 в десятичной, переведите в 2-ичную */