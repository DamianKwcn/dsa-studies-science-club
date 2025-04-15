<<<<<<< HEAD
package org.example;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        long liczba = scanner.nextLong();

        int ile_cyfr = 0;
        int suma_cyfr = 0;
        int iloczyn_cyfr = 1;
        int cyfry_zero = 0;

        while (liczba > 0) {
            long cyfra = liczba - (liczba/10)*10;

            if (cyfra > 0) {
                suma_cyfr += cyfra;
                iloczyn_cyfr *= cyfra;
            } else {
                cyfry_zero++;
            }
            ile_cyfr += 1;
            System.out.println("Liczba cyfr = " + ile_cyfr);
            System.out.println("Cyfra = " + cyfra);
            liczba = liczba/10;
        }

        System.out.println("\nLiczba cyfr = " + ile_cyfr);
        System.out.println("Suma cyfr = " + suma_cyfr);
        System.out.println("Iloczyn cyfr = " + iloczyn_cyfr);
        System.out.println("Cyfry zero = " + cyfry_zero);
    }
}