package Minimum.Element.Challenge;

import java.util.Scanner;

public class MinimumElement {

    public static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma separated list of integers e.g. 1,3,89,15");

        String input = scanner.nextLine(); // Read the full line
        String[] stringNumbers = input.split(","); // Split into string array

        int[] intArray = new int[stringNumbers.length]; // Create int array

        for (int i = 0; i < stringNumbers.length; i++) {
            intArray[i] = Integer.parseInt(stringNumbers[i].trim()); // Convert and trim
        }

        return intArray;
    }

    public static int findMin(int[] arrayInput) {

        int min = arrayInput[0];

        for(int element : arrayInput){
            min = element < min ? element : min;
        }

        return min;
    }

}
