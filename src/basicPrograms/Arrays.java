package basicPrograms;

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
        int[] nums = {1,2,3,4,5,6,7};
        int sum = 9;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("(" + num + "," + complement + ")");
            }
            set.add(num);
        }

























    }
}
