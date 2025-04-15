package org.example;

import java.util.Scanner;

public class Bisekcja {
    public static void main(String[] args) {

        oblicz();
    }

    public static void oblicz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek przedziału - a: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj koniec przedziału - b: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj epsilon: ");
        double eps = scanner.nextDouble();

        double n = 0;
        double ya = funkcja(a);
        double x,y;

        do {
            n = n + 1;
            x = (a + b)/2;
            y = funkcja(x);

            if (y == 0) {
                System.out.println("X = " + x);
                break;
            }

            if ((ya*y) < 0) {
                b = x;
            } else {
                a = x;
                ya = y;
            }
        } while (Math.abs(b - a) >= eps);

        System.out.println("Wartość X = " + x);
        System.out.println("Epsilon = " + eps);
        System.out.println("Liczba iteracji = " + n);
    }

    public static double funkcja(double x) {
        return 3*x + Math.sin(x) - Math.exp(x);
    }
}