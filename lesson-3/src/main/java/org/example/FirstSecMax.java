package org.example;

import java.util.Scanner;

public class FirstSecMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n >= 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Potrzeba co najmniej dwóch elementów.");
            return;
        }

        System.out.print("Podaj liczbę 1: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj liczbę 2: ");
        double liczba2 = scanner.nextDouble();

        double max1, max2;
        int p_max1, p_max2;

        if (liczba1 > liczba2) {
            max1 = liczba1;
            p_max1 = 1;
            max2 = liczba2;
            p_max2 = 2;
        } else {
            max1 = liczba2;
            p_max1 = 2;
            max2 = liczba1;
            p_max2 = 1;
        }

        for (int licznik = 3; licznik <= n; licznik++) {
            System.out.print("Podaj liczbę " + licznik + ": ");
            double liczba = scanner.nextDouble();

            if (liczba > max1) {
                max2 = max1;
                p_max2 = p_max1;

                max1 = liczba;
                p_max1 = licznik;
            } else if (liczba > max2) {
                max2 = liczba;
                p_max2 = licznik;
            }
        }

        System.out.println("\nNajwiększa liczba: " + max1 + ", pozycja: " + p_max1);
        System.out.println("Druga największa liczba: " + max2 + ", pozycja: " + p_max2);
    }
}
