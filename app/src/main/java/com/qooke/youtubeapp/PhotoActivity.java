package com.qooke.youtubeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qooke.youtubeapp.model.Video;

public class PhotoActivity extends AppCompatActivity {

    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        // 데이터 받아오기
        Video video = (Video) getIntent().getSerializableExtra("video");

        imgPhoto = findViewById(R.id.imgPhoto);

        // 네트워크에서 이미지url 가져와서 보여주기
        Glide.with(PhotoActivity.this).load(video.highUrl).into(imgPhoto);

    }
}