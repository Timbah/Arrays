package Minimum.Element.Challenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = MinimumElement.readIntegers();
        System.out.println(Arrays.toString(myArray));

        System.out.printf("The minimum element in the array is %d", MinimumElement.findMin(myArray));
    }
}
