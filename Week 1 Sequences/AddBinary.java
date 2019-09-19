// Given two binary strings, return their sum (also a binary string).

// The input strings are both non-empty and contains only characters 1 or 0.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() -1;
        int carry = 0;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            //minus 0 bcuz integer of char 0 is 48 , so to get 1 or 0 , we need to minus char '0'
            if (j >= 0) sum += b.charAt(j--) -'0' ;
            if (i >= 0) sum += a.charAt(i--) -'0' ;
            //append into the string sb
            sb.append(sum % 2);
            //divide by 2 , so that carry forward remain when its 2 
            carry = sum / 2;
        }
        if (carry != 0){
            //append "1"into the string if there's a carry forward 
             sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
