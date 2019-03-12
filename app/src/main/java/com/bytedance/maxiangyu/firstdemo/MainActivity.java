package com.bytedance.maxiangyu.firstdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView)findViewById(R.id.webview);
        webview.loadUrl("file:///android_asset/www/index.html");
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webview.loadUrl("https://www.qq.com");
        webview.addJavascriptInterface(new WebAppInterface(this), "Android");

    }
}
