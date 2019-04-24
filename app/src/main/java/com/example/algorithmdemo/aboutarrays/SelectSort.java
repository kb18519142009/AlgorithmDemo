package com.example.algorithmdemo.aboutarrays;

/**
 * Created by kangbaibai on 2019/4/24.
 * <p>
 * 选择排序法的第一层循环从起始元素开始选到倒数第二个元素，主要是在每次进入的第二层循环之前，将外层循环的下标赋值给临时变量，
 * 接下来的第二层循环中，如果发现有比这个最小位置处的元素更小的元素，则将那个更小的元素的下标赋给临时变量，最后，在二层循环退出后，
 * 如果临时变量改变，则说明，有比当前外层循环位置更小的元素，需要将这两个元素交换.
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 8, 43, 5, 3, 0, 9, 1, 2, 4};
        selectSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void selectSort(int[] array) {
        if (array == null || array.length == 0)
            return;
        int length = array.length;
        int minIndex, temp;
        for (int i = 0; i < length; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            //将最小元素放到本次循环的前端
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
