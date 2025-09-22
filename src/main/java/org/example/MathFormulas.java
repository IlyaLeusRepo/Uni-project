package org.example;

import java.util.Scanner;

public class MathFormulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        scanner.close();

        double m;
        double n;

        if (a >= b) {
            n = Math.cbrt(a - b);
        } else {
            n = Math.pow(a, 2) + (a - b) / Math.sin(a - b);
        }

        if (n < b) {
            m = (n + a) / -b + Math.sqrt(Math.pow(Math.sin(a), 2) - Math.cos(n));
        } else if (n == b) {
            m = Math.pow(b, 2) - Math.tan(n * a);
        } else {
            m = Math.pow(b, 3) + n * Math.pow(a, 2);
        }

        System.out.printf("Значение формулы для m: %.2f\n", m);
        System.out.printf("Значение формулы для n: %.2f\n", n);
    }
}

