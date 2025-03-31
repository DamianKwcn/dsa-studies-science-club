package org.example;

public class Euklides {
    public static void main(String[] args) {
        euklidesIteracja(32131254L,434654L);
        euklidesRekurencja(323454L,545345435L, 0L);
    }

    public static void euklidesIteracja(long a, long b) {
        long liczbaIteracji = 0;

        while (a != b) {
            liczbaIteracji++;
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("Największy wspólny dzielnik to: " + a);
        System.out.println("Liczba iteracji: " + liczbaIteracji);
    }

    public static long euklidesRekurencja(long m, long n, long iteracje) {
        if (n == 0) {
            System.out.println("Liczba rekurencji to: " + iteracje);
            System.out.println("Najmniejszy wspólny dzielnik to: " + m);
            return m;
        }
        return euklidesRekurencja(n, m%n, iteracje + 1L);
    }
}