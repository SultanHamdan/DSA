package basicPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

//        https://youtube.com/playlist?list=PLUg9hRlm7gxR7e9OgtrsqgN7XEyNTZRPK&si=ZCc-SjVeG60-l-uX
//        PROGRAMS STARTING FROM THE ABOVE PLAYLIST
//        --------------------------------------------------------------------------------------------------------------
//        PROGRAM 1:- FIND DUPLICATES IN AN ARRAY

//        int[] nums = {1,5,3,4,5};
//        boolean isDuplicate = false;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    isDuplicate = true;
//                    System.out.println("Duplicates Present");
//                }
//            }
//        }
//        if (!isDuplicate) {
//            System.out.println("No Duplicates found");
//        }
//        --------------------------------------------------------------------------------------------------------------
//        PROGRAM 2:- FIND DUPLICATES IN AN ARRAY (METHOD 2)

//        String[] str = {"Bye", "Hii", "Bye"};
//        HashSet<String> set = new HashSet<>();
//        boolean flag = false;
//
//        for (int i = 0; i < str.length; i++) {
//            if (set.add(str[i]) == false) {
//                flag = true;
//                System.out.println("Found Duplicate");
//
//            }
//        }
//        if (!flag) {
//            System.out.println("NO Duplicates Found");
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FIND PAIRS FOR THE GIVEN SUM
//        int[] nums = {1,2,3,4,5,6,7};
//        int sum = 9;
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == sum) {
//                    System.out.println("(" + nums[i]  + "," + nums[j] + ")");
//                }
//            }
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FIND PAIRS FOR THE GIVEN SUM (METHOD 2) OPTIMAL SOLUTION
//        int[] nums = {1,2,3,4,5,6,7};
//        int sum = 9;
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            int complement = sum - num;
//            if (set.contains(complement)) {
//                System.out.println("(" + num + "," + complement + ")");
//            }
//            set.add(num);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FIND COMMON ELEMENTS IN 3 SORTED ARRAYS (NOT OPTIMAL)
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {3,4,5};
//        int[] arr3 = {3,7,8};
//        int common = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                for (int k = 0; k < arr3.length; k++) {
//                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                        System.out.println("The Common element is: " + arr1[i]);
//                    }
//                }
//            }
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FIND COMMON ELEMENTS IN 3 SORTED ARRAYS (OPTIMAL)
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {3, 4, 5};
//        int[] arr3 = {3, 7, 8};
//        ArrayList<Integer> commonElements = new ArrayList<>();
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < arr1.length && j < arr2.length && k < arr3.length) {
//            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                commonElements.add(arr1[i]);
//                i++;
//                j++;
//                k++;
//            } else if (arr1[i] < arr2[j]) {
//                i++;
//            } else if (arr2[j] < arr3[k]) {
//                j++;
//            } else {
//                k++;
//            }
//        }
//
//        System.out.println("Common elements are: " + commonElements);
//        --------------------------------------------------------------------------------------------------------------
//        DELETE AN ELEMENT FROM AN ARRAY AT SPECIFIED POSITION
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;

// Variables to store information about the deleted element
        int deletedElement = -1; // Initialize with a value that indicates not found
        int deletedIndex = -1;   // Initialize with a value that indicates not found

// First, find the target element and its index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                deletedElement = arr[i]; // Store the element
                deletedIndex = i;        // Store its index
                break;                   // Found it, no need to continue searching
            }
        }

// Check if the target element was actually found
        if (deletedIndex != -1) {
            // If found, proceed with creating the new array without it

            // We need a new array that is one element smaller
            int[] newArr = new int[arr.length - 1];
            int newArrIndex = 0; // A pointer for the new array

            // Go through the old array
            for (int i = 0; i < arr.length; i++) {
                // If the current element's index is NOT the one we want to delete...
                if (i != deletedIndex) {
                    // ...copy it to the new array
                    newArr[newArrIndex] = arr[i];
                    newArrIndex++; // Move the pointer for the new array
                }
                // If it IS the target index, we simply do nothing and "skip" it
            }

            // Now, the 'newArr' has the result
            arr = newArr;

            // Let's print the result to see if it worked
            System.out.println("The new array is:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for cleaner output

            // Print the information about the deleted element
            System.out.println("The deleted element is: " + deletedElement);
            System.out.println("It was originally present at index: " + deletedIndex);

        } else {
            // If the target element was not found in the array
            System.out.println("The element " + target + " was not found in the array.");
            System.out.print("The array remains: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }































    }
}
