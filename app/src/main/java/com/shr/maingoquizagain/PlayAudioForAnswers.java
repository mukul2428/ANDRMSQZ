package com.shr.maingoquizagain;

import android.content.Context;
import android.media.MediaPlayer;

public class PlayAudioForAnswers {

    private Context mContext;
    private MediaPlayer mediaPlayer;


    public PlayAudioForAnswers(Context mContext) {
        this.mContext = mContext;
    }


    public void setAudioforAnswer(int flag) {
        switch(flag){

        case 1:
                int correctAudio = R.raw.correct;
                playMusic(correctAudio);
                break;
            case 2:
                int wrongAudio = R.raw.correct;
                playMusic(wrongAudio);
                break;

            case 3:
                int timerAudio = R.raw.correct;
                playMusic(timerAudio);
                break;
        }
    }


    private void playMusic(int audiofile) {

        mediaPlayer = MediaPlayer.create(mContext, audiofile);
        mediaPlayer.setOnPreparedListener(mp -> mediaPlayer.start());
        mediaPlayer.setOnCompletionListener(MediaPlayer::release);
    }
}

