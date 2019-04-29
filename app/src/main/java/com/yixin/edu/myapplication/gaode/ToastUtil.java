package com.yixin.edu.myapplication.gaode;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2019/4/23/023.
 */

public class ToastUtil {
    public static void show(Context context, String info) {
        Toast.makeText(context, info, Toast.LENGTH_LONG).show();
    }

    public static void show(Context context, int info) {
        Toast.makeText(context, info, Toast.LENGTH_LONG).show();
    }

}
