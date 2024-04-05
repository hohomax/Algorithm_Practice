package org.example.leetcode.two_pointer;

import java.util.Arrays;
public class Move_Zeroes {

    public static void main(String[] args){

        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

    }

    public static void moveZeroes(int[] nums) {

        int countZero = 0;
        int totalSzie = nums.length;

        for(int a : nums){
            if(a == 0)
                countZero++;
        }

    }
}
