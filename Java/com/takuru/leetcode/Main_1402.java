package com.takuru.leetcode;

import java.util.Arrays;

/**
 * @author takuru@xiaohongshu.com
 * @date 2023/10/22 12:03
 */
public class Main_1402 {

    public static void main(String[] args) {
        int[] satisfaction = new int[]{-1,-8,0,5,-9};
        Solution_1402 solution = new Solution_1402();
        int result = solution.maxSatisfaction(satisfaction);
        System.out.println(result);
    }
}

class Solution_1402 {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int preSum = 0;
        int result = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            if (preSum + satisfaction[i] > 0) {
                preSum += satisfaction[i];
                result += preSum;
            }
        }
        return result;
    }
}
