package com.example.helpinghand;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity2);


        WebView web=(WebView)findViewById(R.id.web);
        web.loadUrl("file:///android_asset/pests.html");

    }
}


