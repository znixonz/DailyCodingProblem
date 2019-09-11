//        Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//        Example 1:
//
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.

package com.company;

public class LongestCommonPrefix {
    public static void main(String[] args){
        Solution_longestCommonPrefix mySolution_longestCommonPreifx = new Solution_longestCommonPrefix();
        System.out.println(mySolution_longestCommonPreifx.prefix(new String[]{"flower","floral","flow"}));
    }

}


class Solution_longestCommonPrefix{
    public String prefix(String[] s){
        //set the first element as the referenced words
        for (int i = 0;i<s[0].length();i++){
            //separate individual character of the string to be compared with
            char c = s[0].charAt(i);
            //variable J is indicate the next string element
            for(int j = 1;j<s.length;j++){
                //check if the variable i has reached the last character &&
                //to compare the arrangement of alphabet of the 1st string element, with every next string element
                if(i == s[j].length() || s[j].charAt(i) != c){
                    return s[0].substring(0,i);
                }
            }
        }
        return s[0];
    }
}
