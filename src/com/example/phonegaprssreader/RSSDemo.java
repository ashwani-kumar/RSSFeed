package com.example.phonegaprssreader;

import android.os.Bundle;
import org.apache.cordova.*;

public class RSSDemo extends DroidGap {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }    
}
