package com.example.algorithmdemo.aboutLinkedList;

/**
 * Created by kangbaibai on 2019/3/26.
 */

public class ReverseListNode {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static ListNode reverse2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        head.next = null;
        ListNode result = reverse2(nextNode);
        nextNode.next = head;
        return result;
    }
}
