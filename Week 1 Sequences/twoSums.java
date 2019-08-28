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
