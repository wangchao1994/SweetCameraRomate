package com.android.camerasimplelayout.util;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    public static void displayToastCenter(Context context, int strResId) {
        Toast.makeText(context, strResId, Toast.LENGTH_SHORT).show();
    }
}
