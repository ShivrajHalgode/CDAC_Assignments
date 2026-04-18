package com.Assignment2;

import java.util.Scanner;

public class InsertIntoSortedArray {

    static int[] insert(int[] arr, int n, int key) {
        int[] newArr = new int[n + 1];

        int i = n - 1;
        while (i >= 0 && arr[i] > key) {
            newArr[i + 1] = arr[i];
            i--;
        }

        newArr[i + 1] = key;

        for (int j = 0; j <= i; j++) {
            newArr[j] = arr[j];
        }

        return newArr;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to insert: ");
        int key = sc.nextInt();

        int[] result = insert(arr, n, key);
        printArray(result);
        sc.close();
    }
}