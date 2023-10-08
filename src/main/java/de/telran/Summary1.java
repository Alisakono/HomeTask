package de.telran;

public class Summary1 {
    public static void main(String[] args) {
        System.out.println(diagonalRectangle(10,5));
        System.out.println(diagonalRectangle(8,8));
        System.out.println(squareRectangle(8,8));
        System.out.println(perimeterRectangle(8,8));
        System.out.println(perimeterCircle(8));
    }

    static double diagonalRectangle(int width, int height) {

        return Math.sqrt(width*width + height*height);

    }
    static double squareRectangle(int width, int height) {

        return width * height;
    }

    static double perimeterRectangle(int width, int height) {

        return 2*width + 2*height;

    }
    static double perimeterCircle(int radius) {

        return 2 * Math.PI * radius;
    }
}


     /*   static double getPerimeter(double a, double b, double c) {
        System.out.println(getPerimeter(4, 7, 9));
        return a + b + c;
    }
    static double getSquare(double a, double b, double c){
        double p = getPerimeter(a, b, c)/2;
        System.out.println(p);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));*/


  //  Напишите методы, которые под двум заданным сторонам вычисляют  диагональ прямоугольника,
//  его площадь и периметр.
  //      Напишите методы нахождения периметра и площади для для круга и треугольника.