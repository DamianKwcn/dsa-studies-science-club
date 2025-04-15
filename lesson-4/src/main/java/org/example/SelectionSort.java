package org.example;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0};

        selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n - 1) {
            int min = i;
            int j = i + 1;

            while (j < n) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                j++;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            i++;
        }
    }
}
