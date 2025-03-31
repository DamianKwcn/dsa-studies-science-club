package org.example;

import java.util.Scanner;

public class CalkiTrapez {

    public static void main(String[] args) {
        oblicz();
    }

    public static void oblicz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek przedziału - a: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj koniec przedziału - b: ");
        double b = scanner.nextDouble();

        int n = 2;

        System.out.print("Czy chcesz podać liczbę podziałów (t/n)? ");
        String odpowiedz = scanner.next();

        if (odpowiedz.equalsIgnoreCase("t")) {
            System.out.print("Podaj liczbę podziałów (n >= 1): ");
            n = scanner.nextInt();

            if (n < 1) {
                System.out.println("Błąd: liczba podziałów musi być co najmniej 1.");
                return;
            }
        }

        while (true) {
            double h = (b - a) / n;
            System.out.println("Wartość kroku h = " + h);

            double wynik = calka(a, b, n);
            System.out.println("Przybliżona wartość całki: " + wynik);

            System.out.print("Czy chcesz sprawdzić wynik dla innego n? Podaj n (lub wpisz 0, aby zakończyć): ");
            if (scanner.hasNextInt()) {
                int nowaN = scanner.nextInt();
                if (nowaN <= 0) {
                    System.out.println("Zakończono.");
                    break;
                } else {
                    n = nowaN;
                }
            } else {
                System.out.println("Nieprawidłowe dane. Zakończono.");
                break;
            }
        }
    }

    public static double calka(double a, double b, int n) {
        double h = (b - a) / n;
        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            double x1 = a + i * h;
            double x2 = a + (i + 1) * h;
            suma += (f(x1) + f(x2)) / 2 * h;
        }

        return suma;
    }

    public static double f(double x) {
        return Math.sin(x) + Math.cos(x);
    }

}
