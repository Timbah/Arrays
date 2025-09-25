package data.structure.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = getRandomArray(10);
        System.out.println(Arrays.toString(myIntArray));

    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newIntArray = new int[len];

        for(int i = 0; i < len; i++){
            newIntArray[i] = random.nextInt(100);
        }

        return newIntArray;
    }
}
