package com.example.myapplication;

import android.os.Bundle;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewExample extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Webview webViewExample = findViewById(R.id.textView4);
        webViewExample.loadUrl("https://www.google.com/");
        webViewExample.setWebViewClient(new WebViewClient());
        webViewExample.getSettings().setJavaScriptEnabled(true);
    }
}
