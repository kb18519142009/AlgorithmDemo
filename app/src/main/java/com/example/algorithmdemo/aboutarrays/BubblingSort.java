package com.example.algorithmdemo.aboutarrays;

/**
 * Created by kangbaibai on 2019/4/24.
 * 冒泡排序
 */

public class BubblingSort {
    public static void main(String[] args) {
        int[] array = new int[]{7, 3, 1, 8, 43, 2, 12, 5, 7, 6, 1, 3};
        bubblingSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void bubblingSort(int[] array) {
        int length = array.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
