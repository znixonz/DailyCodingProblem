
//Given an array of strings, group anagrams together.
//
//        Example:
//
//        Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//        Output:
//        [
//        ["ate","eat","tea"],
//        ["nat","tan"],
//        ["bat"]
//        ]

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args){
        Solution_groupAnagram mySolution_groupAnagram = new Solution_groupAnagram();
        List<List<String>> out = mySolution_groupAnagram.sort(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        StringBuilder sb = new StringBuilder();
        for (List<String> sh : out){
            sb.append(sh);
        }
        String a = sb.toString();
        System.out.println(a);
    }
}

class Solution_groupAnagram{
    public List<List<String>> sort(String[] strs){
        HashMap<String,List<String>> res = new HashMap();
        for (int i =0;i<strs.length;i++){
            //convert the individual character
            char[] ca = strs[i].toCharArray();
            //sort the individual character
            Arrays.sort(ca);
            //convert the sorted character into a string
            String word = String.valueOf(ca);

            //if the hashmap doesnt contain the sorted word as a key , add it into a new arrayList
            if (!res.containsKey(word)){
                res.put(word,new ArrayList<>());
            }
            //adding word element corresponding to the key into the list
            res.get(word).add(strs[i]);

        }
        //return the whole list
        return new ArrayList<>(res.values());

    }
}
