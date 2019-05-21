package com.example.algorithmdemo.aboutstring;

/**
 * Description：删除字符串中的重复字符
 * Created by kang on 2018/4/12.
 */

public class RemoveRepeatString {
    private static final String TAG = "RemoveRepeatString";

    public static void main(String[] args) {
        String s = "ssaaasssfffssaaqqq";
        System.out.println(removeMethod(s));
    }

    public static String removeMethod(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                flag = false;
            } else {
                flag = true;
            }
            if (i == str.indexOf(c))
                flag = true;
            if (flag) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
