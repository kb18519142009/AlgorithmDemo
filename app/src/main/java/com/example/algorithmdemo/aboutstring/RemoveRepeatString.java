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

    public static String removeMethod(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                flag = false;
            } else {
                flag = true;
            }
            if (i == s.indexOf(c))
                flag = true;
            if (flag) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
