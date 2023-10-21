package de.telran;

import java.util.Arrays;

public class HT1510232 {
    public HT1510232() {
    }

    public static void main(String[] args) {
    int s = 21;
    int num1 = 3;
    int num2 = 7;
     extracted(num1, num2, s);
     int ost;
     int m;
     int s1 = 14;
        num1 = 2;
        m = Math.max(num1,num2);
        System.out.println(m);
        ost = s1 - m;
        System.out.println(ost);
        int s2 = 7;
        num1 = 1;
        m = Math.min(num1,num2);
        System.out.println(m);
        ost = s2 - m;
        System.out.println(ost);
        int s3 = 6;
        num1 = 2;
        num2 = 3;
        m = Math.max(num1,num2);
        System.out.println(m);
        ost = s3 - m;
        System.out.println(ost);
        int s4 = 3;
        num1 = 3;
        num2 = 1;
        m = Math.min(num1,num2);
        System.out.println(m);
        ost = s4 - m;
        System.out.println(ost);
        int s5 = 2;
        num1 = 2;
        num2 = 1;
        m = Math.min(num1,num2);
        System.out.println(m);
        ost = s5 - m;
        System.out.println(ost);
        int s6 = 1;
        ost = s6 - m;
        System.out.println(ost);
        int[] arrSet = {s, s1, s2, s3, s4, s5, s6};
     System.out.println("Понадобится "+arrSet.length+ " дней.");
        }

 private static void extracted(int num1, int num2, int s) {
  int m = Math.max(num1, num2);
  System.out.println(m);
  int ost = s -m;
  System.out.println(ost);
 }
}

       /* №2.
        У вас на банковском счету N долларов.
        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем
        текущей суммы на счету и меньше текущей суммы.
        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
        чтобы забрать все свои деньги из банка?
        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
        Ввод:  N = 21
        Выход:  7
        Объяснение:  N = 21
        Снято 7, осталось = 14
        Снято 7, осталось = 7
        Снято 1, осталось = 6
        Снято 3, осталось = 3
        Снято 1, осталось = 2
        Снято 1, Осталось = 1
        Снято 1, осталось = 0*/