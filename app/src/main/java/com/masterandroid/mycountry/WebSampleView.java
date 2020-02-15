package com.masterandroid.mycountry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.ArrayList;

public class WebSampleView extends AppCompatActivity {

    ArrayList<String> detailsArray;
    private Bundle extra;
    private Context mContext;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_sample_view);

        mContext =WebSampleView.this;
        extra = getIntent().getExtras();
        webView = findViewById(R.id.WebViewSampleId);

//        if(!extra.equals(null)){
//            String data = extra.getString("details");
//            String url = "file:///android_asset/"+data+".html";
//            webView.loadUrl(url);
//
//            WebSettings webSettings = webView.getSettings();
//            webSettings.setBuiltInZoomControls(false);
//            webSettings.setDisplayZoomControls(false);
//            webSettings.setJavaScriptEnabled(true);
//        }
    }
}
