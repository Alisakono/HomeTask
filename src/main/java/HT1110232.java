import java.util.Scanner;

public class HT1110232 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");
        int jar;
        jar = scan.nextInt();
        System.out.println(jar);
        if ((jar % 4 == 0) && (jar % 100 != 0) || (jar % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
     /*  2) Реализуйте программу, которая попросит пользователя
       ввести год и напечатать этот год. Метод isLeap
       проверяет високосный год или нет.*/


