package com.baidu.test.mylibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;

/**
 * Created by 黄郑宇 on 2017/10/17.
 */

public class MyAlertDialog {
    public static void dialog(Context context, String title, String message, Drawable drawable){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setIcon(drawable)
                .setPositiveButton("确定",null)
                .setNegativeButton("取消",null)
                .show();
    }
}
