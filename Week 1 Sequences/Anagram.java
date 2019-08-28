//        Given two strings s and t , write a function to determine if t is an anagram of s.

//        Example 1:
//        Input: s = "anagram", t = "nagaram"
//        Output: true

//        Example 2:
//        Input: s = "rat", t = "car"
//        Output: false

package com.company;

public class Anagram {
    public static void main(String[] args){
        Solution_anagram mySolution_anagram = new Solution_anagram();
        boolean x = mySolution_anagram.isAnagram("anagram","nagaram");
        String out = String.valueOf(x);
        System.out.print(out);

    }
}

class Solution_anagram{
    public boolean isAnagram(String s , String t){
        int[] counter = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for (int i = 0 ;i<s.length();i++){
            counter[s.charAt(i)- 'a']++;
            if (counter[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
