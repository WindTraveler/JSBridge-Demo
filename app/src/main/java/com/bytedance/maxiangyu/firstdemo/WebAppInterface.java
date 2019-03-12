package com.bytedance.maxiangyu.firstdemo;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context ctx;

    WebAppInterface(Context c) {
        ctx = c;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(ctx, toast, Toast.LENGTH_SHORT).show();
    }
}

