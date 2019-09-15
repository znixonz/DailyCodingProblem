//Implement strStr().
//
//        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//        Example 1:
//
//        Input: haystack = "hello", needle = "ll"
//        Output: 2
//        Example 2:
//
//        Input: haystack = "aaaaa", needle = "bba"
//        Output: -1

package com.company;

public class strStr {
    public static void main(String[] args){
        Solution_Strstr mySolution_Strstr = new Solution_Strstr();
        System.out.println(mySolution_Strstr.strStr("hello","ll"));
    }
}

class Solution_Strstr {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            System.out.println("1st i " + i);
            for (int j = 0; j < needle.length(); j++) {
                System.out.println("1st J is "+ j);
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    //break so that the current character of the haystack string will move to the next char
                    break;
                }
                //if all char on the needle string is found in the haystack string, it will go run this if statement
                // and return i , which is the position where the 1st char is found
                if(j==needle.length()-1){
                    System.out.println(j);
                    System.out.println("i is " + i);
                    return i;
                }
            }

        }
        return -1;
    }
}
