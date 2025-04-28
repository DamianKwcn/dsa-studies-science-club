package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Podzbiory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = in.nextInt();
        permute(n);
    }

    public static void permute(int n) {
        int[] counts = new int[n + 1];

        System.out.println("Podzbiory 0 elementowe:");
        System.out.println("[pusty podzbiór]");
        System.out.println("Liczba podzbiorów = 1\n");
        counts[0] = 1;

        for (int k = 1; k <= n; k++) {
            System.out.println("Podzbiory " + k + " elementowe:");
            int licznik = 0;

            int[] A = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                A[i] = i;
            }

            if (k == n) {
                System.out.println(Arrays.toString(
                        Arrays.copyOfRange(A, 1, k + 1)
                ));
                counts[k] = 1;
                System.out.println("Liczba podzbiorów = 1\n");
                continue;
            }

            int p = k;
            while (p >= 1) {
                System.out.println(Arrays.toString(
                        Arrays.copyOfRange(A, 1, k + 1)
                ));
                licznik++;

                if (A[k] == n) {
                    p = p - 1;
                } else {
                    p = k;
                }

                if (p >= 1) {
                    for (int i = k; i >= p; i--) {
                        A[i] = A[p] + (i - p + 1);
                    }
                }
            }

            counts[k] = licznik;
            System.out.println("Liczba podzbiorów = " + licznik + "\n");
        }

        System.out.println("Statystyka:");
        int total = 0;
        for (int k = 0; k <= n; k++) {
            System.out.println("Liczba podzbiorów " + k + " elementowych = " + counts[k]);
            total += counts[k];
        }

        System.out.println("Liczba wszystkich podzbiorów = " + total);
    }
}
