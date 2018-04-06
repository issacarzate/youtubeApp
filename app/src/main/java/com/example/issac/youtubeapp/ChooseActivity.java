package com.example.issac.youtubeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChooseActivity extends AppCompatActivity {

    video IDd = new video();
    private Button UpdateVideo;
    private EditText videoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        UpdateVideo = (Button) findViewById(R.id.send);
        videoid = (EditText) findViewById(R.id.videoID);

        UpdateVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendUserToVideoActivity();
            }
        });

    }
    private void SendUserToVideoActivity() {
        IDd.uri = videoid.getText().toString();
        Intent videoIntent = new Intent(ChooseActivity.this, MainActivity.class);
        videoIntent.putExtra("video_ID", IDd.uri);
        //videoIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(videoIntent);
    }

}
