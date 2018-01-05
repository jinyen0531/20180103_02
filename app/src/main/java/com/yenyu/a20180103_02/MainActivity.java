package com.yenyu.a20180103_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webView); //WebView APP裡預覽網頁
        wv.setWebChromeClient(new WebChromeClient());
        wv.getSettings().setJavaScriptEnabled(true); //加這行變手機模式
        wv.loadData("i<frame width=\"450\" height=\"300\" src=\"https://www.youtube.com/embed/8d_W_evbFNk\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html;charest=UTF-8",null);
        //wv.loadData("嵌入式程式碼","text/html;charest=UTF-8",null);
        //可以嵌入影片到APP介面
    }
}
