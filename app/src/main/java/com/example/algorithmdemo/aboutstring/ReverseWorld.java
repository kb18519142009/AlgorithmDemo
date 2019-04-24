package com.example.algorithmdemo.aboutstring;

/**
 * Description：翻转句子，但保证句子中单词内部字符顺序
 * Created by kangbaibai on 2018/8/20.
 * 1. 实现一个函数/方法，翻转字符串中的一段。 2. 判断并获取句子中的单词，注意空格
 */

public class ReverseWorld {
    private static final String TAG = "ReverseWorld";

    /**
     * 反转字符串
     *
     * @param chars 原字符串
     * @param start 大于等于0
     * @param end   小于 length
     * @return
     */
    public static char[] reverseString(char[] chars, int start, int end) {

        // str 判断null， 索引有效值判断
        if (chars == null || start < 0 || end >= chars.length || start >= end) {
            return chars;
        }

        while (start < end) {
            // 首尾字符互换，直到替换完成。
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return chars;
    }

    //反转语句，单词顺序反转
    public static String reverseWorlds(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        int length = sentence.length();
        // 第一步翻转所有字符
        char[] chars = reverseString(sentence.toCharArray(), 0, length - 1);
        System.out.println(new String(chars));

        // 第二步翻转每个单词（重点：怎么找到单词）
        int start = 0, end = 0;
        while (start < length) {
            if (chars[start] == ' ') {
                // 遇到空格就向右边继续查找
                start++;
                end++;
            } else if (end == length || chars[end] == ' ') {
                // 遇到空格或者已经到了字符串末尾，此时翻转找到的单词内部字符，这里需要注意end-1
                chars = reverseString(chars, start, end - 1);
                System.out.println(new String(chars));
                // 重新制定检查索引start
                start = end++;
            } else {
                // end加1，为了检查单词是否结束
                end++;
            }
        }
        return new String(chars);
    }
}
