package ua.edu.chmnu.advanced_java.io;

import java.util.Scanner;

public class SimpleComputation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Уведіть значення a,b, x через пробіл:");

            double a = 0, b = 0, x = 0;

            int readed = 0;

            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                ++readed;
            }

            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
                ++readed;
            }

            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                ++readed;
            }

            if (readed != 3) {
                System.err.println("Помилки введення");
            }

            double result = Math.cos(a*x - b/x) + Math.log(Math.abs(x-b));

            System.out.println("Result: " + result);
        }
    }
}
