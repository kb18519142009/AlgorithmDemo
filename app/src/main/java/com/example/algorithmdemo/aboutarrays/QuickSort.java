package com.example.algorithmdemo.aboutarrays;

/**
 * Created by kangbaibai on 2019/4/24.
 * 快排
 */

public class QuickSort {
    private static int[] array = new int[]{5, 2, 3, 14, 8};

    public static void main(String[] args) {
        quickSort(0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void quickSort(int left, int right) {
        int i, j, t, temp;
        if (left > right)
            return;
        temp = array[left];//基准数
        i = left;
        j = right;
        while (i < j) {
            while (array[j] >= temp && i < j) {
                j--;
            }
            while (array[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //最终基准数归位
        array[left] = array[i];
        array[i] = temp;

        quickSort(left, i - 1);
        quickSort(i + 1, right);
    }
}
