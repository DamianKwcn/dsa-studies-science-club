<<<<<<< HEAD
package org.example;

import java.util.Scanner;

public class CiagArytmetyczny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów (n >= 3): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Potrzeba co najmniej trzech elementów.");
            return;
        }

        System.out.print("Podaj pierwszy element: ");
        double element1 = scanner.nextDouble();

        System.out.print("Podaj drugi element: ");
        double element2 = scanner.nextDouble();

        double roznica_ciagu = element2 - element1;
        double roznica_lok = roznica_ciagu;
        double suma = element1 + element2;
        double element = element2;
        int licznik;

        for (licznik = 3; licznik <= n; licznik++) {
            System.out.print("Podaj " + licznik + " element: ");
            element = scanner.nextDouble();

            suma += element;
            roznica_lok = element - element2;
            element2 = element;

            if (roznica_lok != roznica_ciagu) {
                break;
            }
        }

        System.out.println();

        if (roznica_lok == roznica_ciagu && licznik > n) {
            System.out.println("Ciąg jest arytmetyczny");
            System.out.println("Element pierwszy = " + element1);
            System.out.println("Element ostatni = " + element);
            System.out.println("Różnica ciągu = " + roznica_ciagu);
            System.out.println("Suma = " + suma);
        } else {
            System.out.println("Różnica lokalna = " + roznica_lok + " i różnica globalna = " + roznica_ciagu + " różnią się");
            System.out.println("Ciąg nie jest ciągiem arytmetycznym, licznik = " + licznik);
        }
    }
}