package org.example.leetcode.array_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "hello"
Output: "holle" e<1>/o<4>
Example 2:

Input: s = "leetcode"
Output: "leotcede"
eeoe


 */
public class Reverse_Vowels_of_a_String {

    public static void main(String[] args){

        String s = "hello";
        System.out.println(reverseVowels(s));

    }

    public static String reverseVowels(String s){

        Stack<Character> moumStack = new Stack<>();
        // a e i o u
        HashSet<Character> moum = new HashSet<>();
        moum.add('a');
        moum.add('e');
        moum.add('i');
        moum.add('o');
        moum.add('u');

        for(int i=0; i< s.length(); i++){
            if(moum.contains(s.charAt(i)))
                moumStack.push(s.charAt(i));
        }

        StringBuilder newReverseVowels =  new StringBuilder();
        for(int i=0; i< s.length(); i++){
            if(!moum.contains(s.charAt(i)))
                newReverseVowels.append(s.charAt(i));
            else
                newReverseVowels.append(moumStack.pop());
        }

        return newReverseVowels.toString();
    }

}
