package com.example.issac.youtubeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private YouTubePlayerView youTubePlayerView;
    private String key="AIzaSyDPwV66naSF2UNwe8pK7CZQssYMRO9L3oA";
    String uri =  "";;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uri = getIntent().getStringExtra("video_ID");
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.you);
        youTubePlayerView.initialize(key, this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Toast.makeText(this, getString(R.string.toastOK), Toast.LENGTH_SHORT).show();
        youTubePlayer.cueVideo(uri);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Youtube Error Not Available", Toast.LENGTH_SHORT).show();
    }
}
