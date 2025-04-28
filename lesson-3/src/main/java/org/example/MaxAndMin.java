package org.example;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Liczba elementów musi być większa od zera.");
            return;
        }

        System.out.print("Podaj element 1: ");
        double element = scanner.nextDouble();

        double el_max = element;
        double el_min = element;
        int poz_max = 1;
        int poz_min = 1;

        for (int licznik = 2; licznik <= n; licznik++) {
            System.out.print("Podaj element " + licznik + ": ");
            element = scanner.nextInt();

            if (element >= el_max) {
                el_max = element;
                poz_max = licznik;
            }

            if (element <= el_min) {
                el_min = element;
                poz_min = licznik;
            }
        }

        System.out.println("\nElement maksymalny: " + el_max);
        System.out.println("Pozycja elementu maksymalnego: " + poz_max);
        System.out.println("Element minimalny: " + el_min);
        System.out.println("Pozycja elementu minimalnego: " + poz_min);
    }
}
