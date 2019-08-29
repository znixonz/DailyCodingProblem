//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//
//        Example 1:
//
//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: "(]"
//        Output: false
//        Example 4:
//
//        Input: "([)]"
//        Output: false
//        Example 5:
//
//        Input: "{[]}"
//        Output: true

package com.company;
import java.util.HashMap;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Solution_parenthesis mySolution_parenthesis = new Solution_parenthesis();
        boolean x = mySolution_parenthesis.isValid("[()");
        String y = String.valueOf(x);
        System.out.print(y);
    }

}

class Solution_parenthesis{
    private HashMap<Character,Character> mappings = new HashMap<Character, Character>();
    public Solution_parenthesis(){
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0;i<s.length();i++){
            //getting the character at iteration 'i'
            char c = s.charAt(i);
            //check if the the hashmap contain the closing syntax
            //containsKey check if the key is present in the hashmap
            //containsValue check if the value is present in the hashmap
            if(mappings.containsKey(c)){
                //check the top element of stack , if its empty set a dummy value "#"
                //else, pop out the top element
                char topElement = stack.empty() ? '#' : stack.pop();
                //mappings.get , getting the value of that particular key
                if (topElement != mappings.get(c)){
                    return false;
                }
            }else{
                //if its a opening bracket push into the stack
                stack.push(c);
            }
        }
        //return true when its empty & false when there's a element left meaning its a invalid expression
        return stack.isEmpty();
    }
}
