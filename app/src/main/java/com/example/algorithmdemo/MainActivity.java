package com.example.algorithmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.algorithmdemo.binaryconversion.DecimalToBinary;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + DecimalToBinary.toBinary(10));
//        ListNode head = new ListNode();
//        ListNode next = head;
//        for (int i = 0; i < 10; i++) {
//            ListNode node = new ListNode(i);
//            next.next = node;
//            next = node;
//        }
//        while (head.next != null) {
//            Log.d(TAG, "onCreate 反转前: " + head.data);
//            head = head.next;
//        }
//        ListNode reverseNode = ReverseListNode.reverse(head);
//        while (reverseNode.next != null) {
//            Log.d(TAG, "onCreate 反转后: " + reverseNode.data);
//            reverseNode = reverseNode.next;
//        }
//        Log.e(TAG, RemoveRepeatString.removeMethod("aaabbbcccdddeeeaabbccddsdjssdj"));
//        Log.e(TAG, ReverseWorld.reverseWorlds("hello world heihei"));
//        Log.e(TAG, ReplaceString.replaceString(" hello world heihei "));
//        int[] array = ResizeOrder.resizeOrder(new int[]{2, 1, 3, 6, 4, 7, 8, 5});
//        for (int i = 0; i < array.length; i++) {
//            Log.e(TAG, String.valueOf(array[i]));
//        }
//
//        int[] array2 = ResizeOrder.resizeOrder2(new int[]{2, 1, 3, 6, 4, 7, 8, 5});
//        for (int i = 0; i < array2.length; i++) {
//            Log.e(TAG, String.valueOf(array2[i]));
//        }
    }
}
