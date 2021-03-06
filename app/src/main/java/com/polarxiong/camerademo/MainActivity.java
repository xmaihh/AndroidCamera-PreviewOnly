package com.polarxiong.camerademo;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by zhantong on 16/4/28.
 */
public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CameraPreview mPreview = new CameraPreview(this);
//        mPreview.setLayoutParams(new FrameLayout.LayoutParams(600, 600));

        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(mPreview);
    }
}
