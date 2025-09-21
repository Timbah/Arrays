package thembelani.java.tutorials.HashTable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        System.out.println("These tests confirm itemInCommon() detects");
//        System.out.println("whether two arrays share any common element.");
//        System.out.println();
//
//        // Test 1: Common element exists
//        System.out.println("Test 1: Common Element Exists");
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 3};
//        System.out.println("Expected: true");
//        System.out.println("Actual: " + itemInCommon(array1, array2));
//        System.out.println();
//
//        // Test 2: No common element
//        System.out.println("Test 2: No Common Element");
//        int[] array3 = {1, 2, 3};
//        int[] array4 = {4, 5, 6};
//        System.out.println("Expected: false");
//        System.out.println("Actual: " + itemInCommon(array3, array4));
//        System.out.println();
//
//        // Test 3: All elements match
//        System.out.println("Test 3: All Elements Match");
//        int[] array5 = {7, 8, 9};
//        int[] array6 = {7, 8, 9};
//        System.out.println("Expected: true");
//        System.out.println("Actual: " + itemInCommon(array5, array6));
//        System.out.println();
//
//        // Test 4: Arrays with duplicates
//        System.out.println("Test 4: Arrays with Duplicates");
//        int[] array7 = {1, 1, 2, 3};
//        int[] array8 = {3, 3, 4, 5};
//        System.out.println("Expected: true");
//        System.out.println("Actual: " + itemInCommon(array7, array8));
//        System.out.println();
//
//        // Test 5: Edge case with empty array
//        System.out.println("Test 5: Edge Case with Empty Array");
//        int[] array9 = {};
//        int[] array10 = {1, 2, 3};
//        System.out.println("Expected: false");
//        System.out.println("Actual: " + itemInCommon(array9, array10));
//        System.out.println();
        System.out.println("These tests confirm findDuplicates() correctly");
        System.out.println("identifies all elements that occur more than once.");
        System.out.println();

        // Test 1: Single duplicate
        System.out.println("Test 1: Single Duplicate");
        int[] nums1 = {1, 2, 3, 2};
        System.out.println("Expected: [2]");
        System.out.println("Actual: " + findDuplicates(nums1));
        System.out.println();

        // Test 2: No duplicates
        System.out.println("Test 2: No Duplicates");
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums2));
        System.out.println();

        // Test 3: Multiple duplicates
        System.out.println("Test 3: Multiple Duplicates");
        int[] nums3 = {1, 2, 2, 3, 3, 4};
        System.out.println("Expected: [2, 3] (order may vary)");
        System.out.println("Actual: " + findDuplicates(nums3));
        System.out.println();

        // Test 4: All elements are duplicates
        System.out.println("Test 4: All Elements Duplicates");
        int[] nums4 = {5, 5, 5, 5};
        System.out.println("Expected: [5]");
        System.out.println("Actual: " + findDuplicates(nums4));
        System.out.println();

        // Test 5: Empty array
        System.out.println("Test 5: Empty Array");
        int[] nums5 = {};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums5));
        System.out.println();

    }

    public static Character firstNonRepeatingChar(String word) {
        if (word.isEmpty()) {
            return null;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            int counter = frequencyMap.containsKey(c) ? frequencyMap.getOrDefault(c, 0) + 1 : 1;
            frequencyMap.put(c, counter);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;


    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> myHashTable = new HashMap<>();
        List<Integer> duplicatesList = new LinkedList<>();
        int counter = 0;

        for (int i : nums) {
            if (myHashTable.containsKey(i)) {
                counter = myHashTable.getOrDefault(i, 0) + 1;

                myHashTable.put(i, counter);

                if (counter > 1 && !duplicatesList.contains(i)) {
                    duplicatesList.add(i);
                }

            } else {
                myHashTable.put(i, 1);
            }
        }

        return duplicatesList;

    }

    public static boolean itemInCommon(int[] array1, int[] array2) {

        HashMap<Integer, Boolean> myHash = new HashMap<>();

        for (int i = 0; i < array1.length; i++) {
            myHash.put(array1[i], true);
        }
        for (int j = 0; j < array2.length; j++) {
            if (myHash.containsKey(array2[j]))
                return true;
        }
        return false;
    }
}
