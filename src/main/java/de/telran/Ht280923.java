package de.telran;
public class Ht280923 {
    public static  void main(String[] args) {

        String str = new String("I study Basic Java!");

        System.out.println(str);

        System.out.println(str.length());

         char symbol = 17;
        symbol = str.charAt(17);
        System.out.println(symbol);

        System.out.println(str.contains("Java"));

        String subStr = str.substring(14,18);
        System.out.println(subStr);

        String strTemp = str.replace('a','o');
        System.out.println(strTemp.replace('a','o'));

        System.out.println(str);

        String upStr = str.toUpperCase();
        System.out.println(upStr);

        String lowStr = str.toLowerCase();
        System.out.println(lowStr);

        /*Описание задания.

 1 уровень сложности: № 1
Создайте строку через new - I study Basic Java!
Распечатать пред-последний символ строки. Используем метод String.charAt().
Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
Вырезать строку Java c помощью метода String.substring().
Заменить все символы “а” на “о”.
Преобразуйте строку к верхнему регистру.
Преобразуйте строку к нижнему регистру.
        String str = new String("I study Basic Java!");
        System.out.println(str);*/

    }
}
