// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Example 1:

// Input: [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Example 2:

// Input: [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.

class Solution {
    public int[] plusOne(int[] digits) {
        
        //iterating start from the last element to the 1st element
        for (int i=digits.length -1 ; i>=0;i--){
            /*
            if the element is not 9 , increment by 1,
            if the element is 9, set it to 0
            */
            
            if (digits[i] != 9){
                digits[i]++;
                break;
            }
            else if (digits[i] == 9){
                digits[i] = 0;
            }
        }
        /*
        if the 1st element is 0, meaning its overflow
        initialize a new array with increased array length by 1 
        and return the new array
        */
        if(digits[0] == 0){
            int[] res = new int[digits.length +1];
            res[0] = 1;
            
            return res;
        }
        
        return digits;
        }
    }
