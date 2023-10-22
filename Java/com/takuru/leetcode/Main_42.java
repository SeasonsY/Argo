package com.takuru.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 接雨水，单调栈解法
 *
 * @author takuru@xiaohongshu.com
 * @date 2023/10/22 15:25
 */
public class Main_42 {

    public static void main(String[] args) {
        int[] height = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution_42 solution = new Solution_42();
        int result = solution.trap(height);
        System.out.println(result);
    }
}

class Solution_42 {
    public int trap(int[] height) {
        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < height.length; i++) {

        }
        return 0;
    }
}
