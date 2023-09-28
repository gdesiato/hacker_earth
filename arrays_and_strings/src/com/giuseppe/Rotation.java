package com.giuseppe;

import java.util.Scanner;

class Rotation {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();   // Number of test cases

        for (int test = 0; test < t; test++) {
            int n = s.nextInt();  // Size of the array
            int k = s.nextInt();  // Rotation count

            // Initialize and read the array values
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = s.nextInt();
            }

            // Call your rotation function and get the result
            int[] result = rota(arr1, k);

            // Print the rotated array
            for (int value : result) {
                System.out.print(value + " ");
            }
            System.out.println();   // Print a newline for each test case
        }
    }

    public static int[] rota(int[] arr1, int k) {
        int aSize = arr1.length;
        int[] arr2 = new int[aSize];

        for (int i = 0; i < aSize; i++) {
            // Use modulus to wrap around the array if k exceed its size
            // we are assigning the value at index i of arr1, to the shifted index (i + k) of arr2
            arr2[(i + k) % aSize] = arr1[i];
        }

        return arr2;
    }
}
