package org.example.leetcode.array_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args){

        //System.out.println("maxLength :"+ lengthOfLongestSubstring("abcabcbb"));
        //System.out.println("maxLength :"+ lengthOfLongestSubstring("pwwkew"));
        System.out.println("maxLength :"+ lengthOfLongestSubstring(" "));

    }
    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> characterHashSet = new LinkedHashSet<>();
            char charI = s.charAt(i);
            characterHashSet.add(charI);

            for (int j = i + 1; j < s.length(); j++) {
                char charJ = s.charAt(j);

                if ( !characterHashSet.contains( charJ )) {
                    characterHashSet.add(charJ);

                }
                else { // charSet에 문자가 포함되어있을때

                    if (maxLength < characterHashSet.size())
                        maxLength = characterHashSet.size();

                    break;
                }

            }
        }

        return maxLength;
    }
}
