//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//        Example:
//
//        Input: [-2,1,-3,4,-1,2,1,-5,4],
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//
package com.company;

public class MaxSubArray {
    public static void main(String [] args){
        Solution_maxSubArray mySolution_maxSubArray = new Solution_maxSubArray();
        int x = mySolution_maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.print(x);


    }
}

class Solution_maxSubArray{
    public int maxSubArray(int[] nums){

        //initiating both sum&highest to be 1st element
        int sum = nums[0], highest = nums[0];
        for(int i = 1;i<nums.length;i++){
            //Adding the element one by one since the array can be both positive and negative
            //if sum is negative, set sum = to the current element , else sum "+" current element
            sum = sum < 0 ? nums[i] : sum+nums[i];
            //storing the highest sum throughout the iteration
            highest = Math.max(sum,highest);
        }
        return highest;
    }
}
