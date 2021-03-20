package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicPlayer extends AppCompatActivity {

    ImageView play,prev,next,imageView;
    TextView songTitle;
    SeekBar mSeekBarTime, mSeekBarVol;
    static MediaPlayer mMediaPlayer;
    private Runnable runnable;
    private AudioManager mAudioManager;
    int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        play = findViewById(R.id.play);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);

        imageView = findViewById(R.id.music_image);
        songTitle = findViewById(R.id.song_title);
        mSeekBarTime = findViewById(R.id.seek_bar);
        mSeekBarVol = findViewById(R.id.bar_volume);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Integer> songs = new ArrayList<>();
        songs.add(0, R.raw.Dont_Play);

        mMediaPlayer = MediaPlayer.create(getApplicationContext(), songs.get(currentIndex));

        int maxV = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curV = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSeekBarVol.setMax(maxV);
        mSeekBarVol.setProgress(curV);

        mSeekBarVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress, 0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSeekBarTime.setMax(mMediaPlayer.getDuration());
                if (mMediaPlayer != null && mMediaPlayer.isPlaying()){
                    play.setImageResource(R.drawable.ic_play);
                }
                else{
                    mMediaPlayer.start();
                    play.setImageResource(R.drawable.ic_pause);
                }

                songDetails();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaPlayer != null){

                    play.setImageResource(R.drawable.music_record);
                }
                if (currentIndex < songs.size() - 1){
                    currentIndex ++;
                }
                else{
                    currentIndex = 0;
                }
                if (mMediaPlayer.isPlaying()){
                    mMediaPlayer.stop();
                }
                mMediaPlayer = MediaPlayer.create(getApplicationContext(), songs.get(currentIndex));
                mMediaPlayer.start();
                songDetails();
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMediaPlayer != null){
                    play.setImageResource(R.drawable.ic_pause);
                }
                if (currentIndex > 0){

                }
            }
        });
    }

    private void songDetails(){
        if(currentIndex == 0){
            songTitle.setText(" TEST ");
            imageView.setImageResource(R.drawable.music_record);
        }
        if(currentIndex == 1){
            songTitle.setText(" TEST 2 ");
            imageView.setImageResource(R.drawable.music_record);
        }
        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mSeekBarTime.setMax(mMediaPlayer.getDuration());
                mMediaPlayer.start();
            }
        });
    }
}