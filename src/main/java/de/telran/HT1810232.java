package de.telran;

import java.util.Random;

public class HT1810232 {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        Random rand = new Random();
        int count = 0;
        for (int i = 1; i < 5 ; i++){
            arrInt[i] = rand.nextInt(99);
            System.out.print(arrInt[i]+" ");


        }
        for (int i = 0; i<arrInt.length;i++){
            if (i>0){
                if (arrInt[i-1]>= arrInt[i]){
                    System.out.println();
                    System.out.println("Массив не является строго возрастающей последовательностью.");
                }
            }
        }
    }}

        /*    №2.
        Создайте массив из 5 случайных целых чисел из интервала [10;99]
        Выведите его на консоль в строку.
        Определите и выведите на экран сообщение о том, является ли
        массив строго возрастающей последовательностью.*/