package org.example;

public class Podzbiory {

    public static void main(String[] args) {
        long start = System.nanoTime();

        podzbiory(5);

        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("\nCzas wykonania: " + duration + " ns");
        System.out.println("Czas w milisekundach: " + (duration / 1_000_000.0) + " ms");
    }

    public static void podzbiory(int n) {
        int[] maska = new int[n];
        int r = (int) Math.pow(2, n) - 1;

        for (int i = 0; i <= r; i++) {
            int temp = i;
            for (int j = n - 1; j >= 0; j--) {
                maska[j] = temp % 2;
                temp = temp / 2;
            }

            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if (maska[j] == 1) {
                    char letter = (char) ('a' + j);
                    System.out.print(letter + " ");
                }
            }
            System.out.println("}");
        }
    }
}
