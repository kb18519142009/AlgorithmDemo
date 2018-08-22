package com.example.algorithmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.algorithmdemo.aboutarrays.ResizeOrder;
import com.example.algorithmdemo.aboutstring.RemoveRepeatString;
import com.example.algorithmdemo.aboutstring.ReplaceString;
import com.example.algorithmdemo.aboutstring.ReverseWorld;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, RemoveRepeatString.removeMethod("aaabbbcccdddeeeaabbccddsdjssdj"));
        Log.e(TAG, ReverseWorld.reverseWorlds("hello world heihei"));
        Log.e(TAG, ReplaceString.replaceString(" hello world heihei "));
        int[] array = ResizeOrder.resizeOrder(new int[]{2, 1, 3, 6, 4, 7, 8, 5});
        for (int i = 0; i < array.length; i++) {
            Log.e(TAG, String.valueOf(array[i]));
        }

        int[] array2 = ResizeOrder.resizeOrder2(new int[]{2, 1, 3, 6, 4, 7, 8, 5});
        for (int i = 0; i < array2.length; i++) {
            Log.e(TAG, String.valueOf(array2[i]));
        }
    }
}
