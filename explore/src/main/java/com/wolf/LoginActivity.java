package com.wolf;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        this.setContentView(webView);
        webView.loadUrl("file:///android_asset/mobile/index.html");
    }
}
