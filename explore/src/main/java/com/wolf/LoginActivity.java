package com.wolf;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        this.setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
}
