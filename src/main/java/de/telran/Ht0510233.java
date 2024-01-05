package de.telran;


import java.util.Scanner;

public class Ht0510233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в евро: ");
        int num = scanner.nextInt();
        double sum = num * 1.02;
        double i; i = 1.02;   // Курс евро к доллару
        System.out.println("Сумма в долларах: "+sum);
        return;


    }
}
/*N3
Программа запрашивает у пользователя сумму в Евро для конвертации
Реализовать метод, который конвертирует полученную сумму в сумму в долларах США */