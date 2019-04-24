package com.example.algorithmdemo.aboutarrays;

/**
 * Description： 给定一个整数数组，请实现一个函数来调整数组中数字的顺序，使得所有奇数都位于偶数之前。
 * Created by kangbaibai on 2018/8/22.
 * 解题思路
 * 此题比较简单，我最先想到的解法是这样：我们维护两个指针(索引)，一个指针指向数组的第一个数字，称之为头指针，向右移动；
 * 一个指针指向最后一个数字，称之为尾指针，向左移动。
 * <p>
 * 注：（1）初始化两个指针P1、P2，分别指向数组的头部和尾部。（2）由上一步得知，指针P1指向的数字是偶数2，而P2指向的数字是奇数5，
 * 满足条件，我们交换这两个数字。（3） P1继续向右移动直到指向偶数6，P2继续向左移动直到指向奇数7。（4）交换两个指针指向的数字。
 * （5）P1，P2继续移动后重叠，表明所有奇数已位于偶数前面了。
 * 循环结束条件：两个指针重叠时或P2指针移动到了P1指针的前面，此时退出循环。
 * 可以看出此算法，一次循环搞定，所以时间复杂度O(n), 由于在原数组上操作，所以空间复杂度O(1)。
 */

public class ResizeOrder {
    public static void main(String[] args) {
        int[] array = new int[]{6, 7, 4, 3, 21, 8, 0, 1, 5, 55, 11};
        resizeOrder(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] resizeOrder(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int st = 0;
        int end = nums.length - 1;

        while (st < end) {
            // find even number
            if (isOdd(nums[st])) {
                st++;// 奇数，索引右移
            } else if (!isOdd(nums[end])) {
                end--;// 偶数，索引左移
            } else {
                // 奇偶数互换
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }
        return nums;
    }

    /**
     * 接上题，面试官会继续要求改造此函数使其能够保证原先输入数组的奇数内部顺序以及偶数内部顺序，
     * 即如果输入为{2，1，3，6，4，7，8，5}，则输出应为{1，3，7，5，2，6，4，8}，奇数之间的相互顺序和偶数之间的相互顺序不得被改变。
     * <p>
     * 要想保证原数组内元素的顺序，可使用O(n)的temp数组空间按顺序缓存偶数，奇数依次放到原数组前面，最后将temp中偶数取出放在原数组后面。
     *
     * @param nums
     * @return
     */
    public static int[] resizeOrder2(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int st = 0;
        int evenCount = 0;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (!isOdd(nums[i])) {
                evenCount += 1;
                temp[evenCount - 1] = nums[i];
            } else {
                if (st < i) {
                    // 将奇数依次放在原数组前面
                    nums[st] = nums[i];
                }
                st++;
            }
        }

        if (evenCount > 0) {
            for (int i = st; i < nums.length; i++) {
                nums[i] = temp[i - st];
            }
        }
        return nums;
    }

    // 与1做按位运算，不为0就是奇数，反之为偶数
    private static boolean isOdd(int n) {
        return (n & 1) != 0;
    }
}
