import java.util.Arrays;

public class HT2310231 {
    static class Main {
//        потерянное число
        public static int getMissingNumber(int[] arr) {
            int n = arr.length;
            int m = n + 1;
            int total = m * (m + 1) / 2;
            int sum = Arrays.stream(arr).sum();
            return total - sum;
        }
        public static void main(String... args) {
            int[] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};
            System.out.println("The missing number is: " + getMissingNumber(arr));
        }
    }
}

   /*  1 уровень сложности: №1
    Дан массив размера  n-1, содержащий только различные целые числа в
    диапазоне от 1 до n . Найдите недостающий элемент.
            input:
    arr[] = {1,2,3,5}
    out: 4

    arr[] = {6,1,2,8,3,4,7,10,5}
    out: 9*/