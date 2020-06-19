package com.example.algorithmdemo.aboutLinkedList;

/**
 * Created by kangbaibai on 2019/3/26.
 * 反转单链表
 */

public class ReverseListNode {

    //循环
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

    //递归
    public static ListNode reverse2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        head.next = null;
        ListNode result = reverse2(nextNode);
        nextNode.next = head;
        return result;
    }
}
