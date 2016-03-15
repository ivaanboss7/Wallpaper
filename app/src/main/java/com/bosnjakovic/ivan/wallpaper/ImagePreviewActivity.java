package com.bosnjakovic.ivan.wallpaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImagePreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);
        getIntentData();
    }

    private void getIntentData() {

        Intent intent = getIntent();
        int imageResource = intent.getExtras().getInt("image");
        ImageView imageView = (ImageView) findViewById(R.id.ivPreview);
        imageView.setImageResource(imageResource);

    }
}
