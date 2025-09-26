package data.structure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {

        int[] intArray = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++) {

            System.out.print(intArray.length - i + " inputs remaining. Enter the next number: ");
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] inputArray) {

        int temp = inputArray.length - 1;
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Element " + i + " contents " + inputArray[temp - i]);

        }

    }

}
