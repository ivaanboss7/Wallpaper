package com.bosnjakovic.ivan.wallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initWebView();

    }

    private void initWebView() {
        webView = (WebView)findViewById(R.id.wvWeb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.youtube.com");
    }
}
