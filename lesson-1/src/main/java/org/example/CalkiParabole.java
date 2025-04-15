package org.example;

import java.util.Scanner;

public class CalkiParabole {

    public static void main(String[] args) {
        oblicz();
    }

    public static void oblicz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek przedziału - a: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj koniec przedziału - b: ");
        double b = Math.PI/2;

        System.out.print("Podaj liczbę przedziałów: ");
        double przedzialy = Double.parseDouble(scanner.next());

        if (przedzialy % 2 != 0) {
            przedzialy++;
            przedzialy = Math.ceil(przedzialy);
        }

        while (true) {
            double h = (b - a) / przedzialy;
            System.out.println("Wartość kroku h = " + h);

            double wynik = funkcja(a, b, przedzialy);
            System.out.println("Przybliżona wartość całki: " + wynik);

            System.out.print("Czy chcesz sprawdzić wynik dla innego n? Podaj n (lub wpisz 0, aby zakończyć): ");
            if (scanner.hasNextDouble()) {
                double nowaN = scanner.nextDouble();
                if (nowaN <= 0) {
                    System.out.println("Zakończono.");
                    break;
                } else {
                    przedzialy = nowaN;
                }
            } else {
                System.out.println("Nieprawidłowe dane. Zakończono.");
                break;
            }
        }
    }

    public static double funkcja(double a, double b, double n) {
        double h = (b - a) / n;
        double suma = f2(a) + f2(b);

        for (int i = 0; i < n/2; i++) {
            double F1 = a + 2*i*h;
            double F2 = F1 + h;
            double F3 = F1 + 2*h;
            suma += (f(F1) + 4*f(F2) + f(F3));
        }
        return (h / 3) * suma;
    }


    public static double f(double x) {
        return 2 * x - Math.sqrt(x) + 3 * Math.cbrt(x * x) + 1;
    }

    public static double f1(double x) {
        return 1/(x*x);
    }

    public static double f2(double x) {
        return Math.cos(x) / (1 + Math.sin(x));
    }
}
