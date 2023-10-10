package de.telran;

import java.util.Scanner;

public class Ht0210231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Введите слово из 6-ти букв: ");
        String word1 = scan.next();
        System.out.println("Введите второе слово из 6-ти букв: ");
        String word2 = scan.next();

        System.out.println(word1.length());
        System.out.println(word2.length());
        String subStr = word1.substring(0, 3);
        String subStr1 = word2.substring(3, 6);
        System.out.println( subStr + subStr1 );

    }
}
     /*   1 уровень сложности: №1
         Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
         (проверьте количество букв в слове).
         Нужно получить слово, состоящее из первой половины первого слова и второй половины
         второго слова. распечатать на консоль. */