//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].


package com.company;
import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {
         Solution mySolution = new Solution();
        int[] x = mySolution.twoSum(new int[]{2, 7, 11, 15}, 9);
        String out = Arrays.toString(x);
        System.out.print(out);

    }

}
class Solution{
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] {i,j};
                    }
                }
            }
            throw new IllegalArgumentException("no solution");
        }
}
