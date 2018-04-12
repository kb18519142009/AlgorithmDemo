package com.example.algorithmdemo.aboutstring;

import android.util.Log;

/**
 * Description：
 * Created by kang on 2018/4/12.
 */

public class StringTest {
    private static final String TAG = "StringTest";

    public static void removeMethod(String s) {
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        int i = 0;
        boolean flag = false;
        for (i = 0; i < len; i++) {
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
        Log.e(TAG, sb.toString());
    }
}
