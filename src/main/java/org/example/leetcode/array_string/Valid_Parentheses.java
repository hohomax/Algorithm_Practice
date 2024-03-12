package org.example.leetcode.array_string;

import java.util.Stack;

/**
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 */

public class Valid_Parentheses {

    //stack으로 풀기
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if( '(' == c ){
                stack.push(')');
            } else if ( '{' == c) {
                stack.push('}');
            } else if ( '[' == c) {
                stack.push(']');
            }
        }

        return s.equals(stack.toString());
    }


    //replace로 풀기
    public static boolean isValid2(String s) {



        String pattern1 = "\\(\\)";
        String pattern2 = "\\{\\}";
        String pattern3 = "\\[\\]";

        s= s.replaceAll(pattern1,"");
        s= s.replaceAll(pattern2, "");
        s= s.replaceAll(pattern3, "");


        if(s.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args){

        String s = "()[]{}";
        String s2 = "{[]}";

        isValid2(s2);

    }
}

