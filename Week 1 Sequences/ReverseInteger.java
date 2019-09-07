//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21

package com.company;
import java.util.Scanner;

public class ReverseInteger {
    public static void main (String[] args){
        Solution_reverseString mySolution_reverseString = new Solution_reverseString();
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(mySolution_reverseString.reverse(number));

    }
}

class Solution_reverseString{
    public int reverse(int nums){
        int result = 0;
        while (nums!=0){
            //nums % 10 to get the last num
            //result * 10 so that result can move next tenth placement , eg 3*10 + 2 = 32
            result = result*10 + nums%10;
            //nums divide 10 so that to remove the last num , e.g 123/10 = 12
            nums /= 10;
        }

        return result;
    }
}
