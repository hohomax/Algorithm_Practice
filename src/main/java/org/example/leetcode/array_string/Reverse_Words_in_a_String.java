package org.example.leetcode.array_string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 *
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 *
 *
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 *
 *
 */
public class Reverse_Words_in_a_String {

    public static void main(String[] args) {

        String  input = "the sky is blue";
        String  input2 = "a good   example";
        bestExample_reverseWords(input2);

    }

    public static String reverseWords(String s) {

        String[] splitWords = s.split(" ");
        Arrays.stream(splitWords).sorted(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();

        String[] reverseWords = new String[splitWords.length];
        for (int i=0; i< splitWords.length; i++) {
            reverseWords[i] = splitWords[splitWords.length - 1 - i];

            if(!"".equals(reverseWords[i]))
                result.append(reverseWords[i]+" ");
        }
        String stringResult = result.toString().trim();
        return result.toString();
    }



    public static String bestExample_reverseWords(String s) {

        String k = "the beatuful day";

        String[] splitS = k .split(" ");

        Arrays.parallelSort(splitS);

        return "k";

    }
}
