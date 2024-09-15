import java.util.Scanner;

public class FactorialCalculator {

    // Итеративный метод для вычисления факториала
    public static long iterativeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Рекурсивный метод для вычисления факториала
    public static long recursiveFactorial(int n) {
        if (n == 0) {
            return 1; // Факториал 0 равен 1
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        // Проверка на неотрицательное число
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не вычисляется.");
        } else {
            long iterFactorial = iterativeFactorial(number);
            long recFactorial = recursiveFactorial(number);

            System.out.println("Итеративный способ: Факториал " + number + " = " + iterFactorial);
            System.out.println("Рекурсивный способ: Факториал " + number + " = " + recFactorial);
        }

        scanner.close();
    }
}

