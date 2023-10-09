public class Ht0510232 {
    public static void main(String[] args) {
        int a = 24 / 2, b = 28 / 2, c = 40;
        double rad1 = Math.PI * (a * a);
        double rad2 = Math.PI * (b * b);
        double dif = rad2 - rad1;
        double mul = dif*c;
        System.out.println(dif);
        System.out.println(mul);

    }
}
/*N2
Напишите программу, которая вычисляет, сколько лишних калорий будет,
 если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.*/