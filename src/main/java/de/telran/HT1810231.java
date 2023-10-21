package de.telran;

import java.util.Arrays;
import java.util.Random;

public class HT1810231 {
    public static void main(String[] args) {
        int[] arrInt = new int[8];
        Random rand = new Random();
        int count = 0;
        for (int i = 0; i < 8 ; i++){
            arrInt[i] = rand.nextInt(50);
            System.out.print(arrInt[i]+" ");

        }
        System.out.println();
        for (int i = 0;i<arrInt.length;i++){
            if (arrInt[i]%2 != 0) arrInt[i] = 0;
            System.out.print((arrInt[i])+" ");
            }
        }
    }

 /*1 уровень сложности: №1.
         Создайте массив из 8 случайных целых чисел из интервала [1;50]
         Выведите массив на консоль в строку.
         Замените каждый элемент с нечетным индексом на ноль.
         Снова выведете массив на консоль в отдельной строке.*/