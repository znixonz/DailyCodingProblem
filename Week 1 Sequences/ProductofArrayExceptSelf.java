//Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//        Example:
//
//        Input:  [1,2,3,4]
//        Output: [24,12,8,6]
//        Note: Please solve it without division and in O(n).
//
package com.company;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        Solution_arrayProduct mySolution_arrayProduct = new Solution_arrayProduct();
        int[] x = mySolution_arrayProduct.productExceptSelf(new int[]{1,2,3,4});
        String out = Arrays.toString(x);
        System.out.print(out);

    }
}

class Solution_arrayProduct{
    public int[] productExceptSelf(int[] nums){
        int length = nums.length;
        int[] answer = new int[length];
        //array L is the product left of iteration i
        int[] L = new int[length];
        //array R is the product right of the iteration i
        int[] R = new int[length];

        //first element would be 1 because there's no element to the left of the 1st element
        L[0] = 1;

        for(int i =1;i<length;i++){
            //L[i] contains the product of all the element to the left of iteration "i"
            //therefore we only need to computer L[i-1] multiply with the nums[i-1]
            //Ex. L[4] = L[3]*nums[3]
            L[i] = L[i-1]*nums[i-1];
        }
        //last element would be 1 bcuz there's no element to right of the last element
        R[length-1] = 1;
        //i>=0 so that it can reach to the 1st element
        for (int i = length-2;i>=0;i--){
            //R[i] contains the product of all the element to the right of iteration "i"
            //therefore we only need to computer R[i+1] multiply with nums[i+1]
            //Since we are computing from right to left
            R[i] = R[i+1]*nums[i+1];
        }
        for(int i = 0;i<length;i++){
            //multiple the product of L&R except for the self iteration "i"
            answer[i] = L[i]*R[i];
        }
        return answer;
    }
}
