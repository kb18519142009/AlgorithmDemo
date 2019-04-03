package com.example.algorithmdemo.aboutstring;

import java.util.Arrays;

/**
 * Description：替换字符 剔除收尾无效空格，并将单词间的每一个空格都替换为"%20"
 * Created by kangbaibai on 2018/8/22.
 * <p>
 * 注：（1）字符串" hello world"，这里注意首字符是空格。
 * （2）剔除首尾空格后。
 * （3）对原字符串进行扩容。newLen = len + 2 x blackCount；这里解释下新数组的长度是如何计算的，
 * 由于是将每一个空格都替换为"%20",就相当于原来占一个字符替换后要占三个字符，换言之，每一个空格就会多出两个字符长度，所以就有前面的表达式。
 * （4） 定义两个指针p1、p2，分别指向len-1和newLen-1位置。
 * （5）判断p1指针是否指向空格，如果是则在p2处开始插入字符“%20”，不是则将p1指向的值复制给p2并将两个指针往左移动一位。
 * 这里将p1指向的字符 d 赋值给p2，并将两个指针向左移动一位。
 * （6）将p1指向的字符 l 赋值给p2，并移动指针。
 * （7）多次赋值和移动后，p1指向了第一个空格。
 * （8）在p2处依次插入字符 0 、 2 、 % ，并指针p2向左移动三位，结束后将p1向左移动一位，此时p1、p2重合结束循环。
 */

public class ReplaceString {

    public static String replaceString(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // 去掉字符串首尾的空格
        sentence = trim(sentence);
        int len = sentence.length();
        char[] chars = sentence.toCharArray();
        int count = getSpaceCount(sentence);
        int newLen = 2 * count + len;
        // 扩容，内部使用System.arraycopy 方法实现。
//        public static void arraycopy (Object src,int srcPos, Object dest,int destPos, int length)
//        代码解释:
//　　            Object src :源数组
//               int srcPos :从源数据的起始位置开始
//　　            Object dest :目标数组
//　　            int destPos :目标数组的开始起始位置
//　　            int length  :要copy的数组的长度
        chars = Arrays.copyOf(chars, newLen);

        int index = len - 1;
        int newIndex = newLen - 1;
        while (index >= 0 && newIndex > index) {
            if (chars[index] == ' ') {
                chars[newIndex--] = '0';
                chars[newIndex--] = '2';
                chars[newIndex--] = '%';
            } else {
                chars[newIndex--] = chars[index];
            }
            index--;
        }

        return new String(chars);
    }

    /**
     * 剔除字符串首尾的空格
     *
     * @param origin
     * @return
     */
    public static String trim(String origin) {
        char[] chars = origin.toCharArray();
        int length = chars.length;
        int st = 0;
        while (st < length && chars[st] == ' ') {
            st++;
        }

        while (st < length && chars[length - 1] == ' ') {
            length--;
        }

        // 如果首尾有空格，就截取生成新的字符串
        if (st > 0 || length < chars.length) {
            origin = new String(chars, st, (length - st));
        }
        return origin;
    }

    /**
     * 获取字符串中空格的数量
     *
     * @param sentence
     * @return
     */
    public static int getSpaceCount(String sentence) {
        char[] chars = sentence.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}
