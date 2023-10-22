package com.takuru.leetcode;

import java.util.Stack;

public class Main_25 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode seven = new ListNode(7);
        ListNode six = new ListNode(6, seven);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3,four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        ListNode result = solution.reverseKGroup(one, 3);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode finalHead = null;
        ListNode lastNode = null;
        Stack<ListNode> stack = new Stack<>();
        int initK = k;
        while (head != null) {
            if (k == 1 && lastNode != null) {
                lastNode.next = head;
            }
            stack.push(head);
            head = head.next;
            k--;
            if (k == 0) {
                ListNode cur = stack.pop();
                if (finalHead == null) {
                    finalHead = cur;
                }
                while (stack.size() > 0) {

                    cur.next = stack.pop();
                    cur = cur.next;
                }
                cur.next = head;
                lastNode = cur;
                k = initK;
            }
        }
        return finalHead;
    }
}
