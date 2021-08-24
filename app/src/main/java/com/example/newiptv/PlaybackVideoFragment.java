package com.example.newiptv;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.leanback.app.VideoSupportFragment;
import androidx.leanback.app.VideoSupportFragmentGlueHost;
import androidx.leanback.media.MediaPlayerAdapter;
import androidx.leanback.media.PlaybackBaseControlGlue;
import androidx.leanback.media.PlaybackTransportControlGlue;
import androidx.leanback.widget.PlaybackControlsRow;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

/**
 * Handles video playback with media controls.
 */
public class PlaybackVideoFragment extends VideoSupportFragment {

    PlayerView playerView ;
    ProgressBar progressBar;
    ImageView btFullScreen;


    private PlaybackTransportControlGlue<MediaPlayerAdapter> mTransportControlGlue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Movie movie =
                (Movie) getActivity().getIntent().getSerializableExtra(DetailsActivity.MOVIE);

//setContentView(R.layout.activity_player);
//        VideoSupportFragmentGlueHost glueHost =
//                new VideoSupportFragmentGlueHost(PlaybackVideoFragment.this);
//
//        MediaPlayerAdapter playerAdapter = new MediaPlayerAdapter(getActivity());
//
//        playerAdapter.setRepeatAction(PlaybackControlsRow.RepeatAction.INDEX_NONE);
//
//        mTransportControlGlue = new PlaybackTransportControlGlue<>(getActivity(), playerAdapter);
//        mTransportControlGlue.setHost(glueHost);
//        mTransportControlGlue.setTitle(movie.getTitle());
//        mTransportControlGlue.setSubtitle(movie.getDescription());
//        mTransportControlGlue.playWhenPrepared();
//        playerAdapter.setDataSource(Uri.parse(movie.getVideoUrl()));

//        playerView=
        Uri url = Uri.parse(movie.getVideoUrl());

    }

    @Override
    public void onPause() {
        super.onPause();
        if (mTransportControlGlue != null) {
            mTransportControlGlue.pause();
        }
    }

}