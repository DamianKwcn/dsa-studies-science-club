package org.example;

public class SortedArraysMerging {
    public static void main(String[] args) {

        int[] arrA = {1,3,5,7};
        int[] arrB = {0,1,1,4,7,7,7};
        mergeArrays(arrA,arrB);
    }

    public static void mergeArrays(int[] arrA, int[] arrB) {
        int[] mergedArr = new int[arrA.length + arrB.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (j < arrA.length && k < arrB.length) {

            if (arrA[j] <= arrB[k]) {
                mergedArr[i] = arrA[j];
                System.out.println(mergedArr[i] + " A");
                i++;
                j++;
            } else {
                mergedArr[i] = arrB[k];
                System.out.println(mergedArr[i] + " B");
                i++;
                k++;
            }
        }

        while (j < arrA.length) {
            mergedArr[i] = arrA[j];
            System.out.println(mergedArr[i] + " A");
            i++;
            j++;
        }

        while (k < arrB.length) {
            mergedArr[i] = arrB[k];
            System.out.println(mergedArr[i] + " B");
            i++;
            k++;
        }
    }

}