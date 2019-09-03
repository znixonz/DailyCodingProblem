//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//        Note:
//
//        The solution set must not contain duplicate triplets.
//
//        Example:
//
//        Given array nums = [-1, 0, 1, 2, -1, -4],
//
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main (String [] args){
        Solution_3sum mySolution_3Sum = new Solution_3sum();
        mySolution_3Sum.threeSum(new int[]{-1,0,1,2,-1,-4});

    }
}

class Solution_3sum{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //length-2 bcuz since we must can take 3 nums to calculate, no point taking the 2nd last num
        for (int i = 0;i < nums.length -2 ; i++){
            if (i>0 && nums[i] == nums[i-1]){
                continue; // skip duplicate
            }
            int first = nums[i];
            int second = i + 1;
            //since we sorted the array , therefore the 3rd nums need to be the largest.
            //so that 1st + 2nd + 3rd nums == 0 where 1st & 2nd is probably a negative num
            int third = nums.length - 1;
            while (second<third){
                int sum = nums[second] + nums[third];
                //-first so that when sum and -first added tgt, it become 0
                if (sum == -first) {
                    result.add(Arrays.asList(nums[i],nums[second],nums[third]));
                 System.out.print(nums[i] + ","+ nums[second] + "," + nums[third] + "\n");
                    while (second < third && nums[second] == nums[second + 1]) {
                        second++; // to skip duplicate of set
                    }
                    while (second < third && nums[third] == nums[third - 1]) {
                        third--; // to skip duplicate of set
                    }
                    second++;
                    third--;
                }
                else if (sum < first){
                    second++; // going thru the array from left to right
                }
                else {
                    third--; // going thru the array from right to left
                }
            }

        }
        return result;
    }
}
