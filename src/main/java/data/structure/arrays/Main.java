package data.structure.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = getRandomArray(10);
        System.out.println(Arrays.toString(myIntArray));
        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray = {"Able","Thembelani","Junior","Sinethemba","Mark","David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if(Arrays.binarySearch(sArray,"Thembelani") >= 0){
            System.out.println("Found Thembelani in the list");
        }

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
