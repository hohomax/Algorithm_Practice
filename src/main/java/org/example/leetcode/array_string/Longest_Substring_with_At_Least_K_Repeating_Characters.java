package org.example.leetcode.array_string;

import java.lang.reflect.Array;
import java.util.*;

public class Longest_Substring_with_At_Least_K_Repeating_Characters {

    public static void main(String[] args){

        String words = "ababacb";
        int k = 3;
        System.out.println(longestSubstring(words, k));


    }


    public static int longestSubstring(String s, int k) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character[] orderCharList = new Character[s.length()];

        for(int i=0; i<s.length(); i++){
            orderCharList[i] = s.charAt(i);
        }
        Arrays.sort(orderCharList);

        for(char key : orderCharList){
            hashMap.put(key , hashMap.getOrDefault( key,0)+1);
        }

        int totalSumLength = 0;
        for(int value : hashMap.values()){

            if(value >= k)
                totalSumLength += value;
        }

        return totalSumLength;
    }
}
