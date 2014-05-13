package com.ray.iptvdemo1;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.ray.iptvdemo1.dummy.ChannelContent;

/**
 * A fragment representing a single channel detail screen. This fragment is
 * either contained in a {@link channelListActivity} in two-pane mode (on
 * tablets) or a {@link channelDetailActivity} on handsets.
 */
public class channelDetailFragment extends Fragment implements MediaPlayer.OnErrorListener {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private ChannelContent.ChannelItem mItem;
	
	
	public static final String TAG = "VideoPlayer";
    private VideoView mVideoView;
    private Uri mUri;
    private int mPositionWhenPaused = -1;
    private MediaController mMediaController;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public channelDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = ChannelContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_channel_play,
				container, false);
			getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	        mVideoView = (VideoView)rootView.findViewById(R.id.channel_play);
	        //Video file
	        String s=mItem.url;
//	        String s="http://101.95.78.69/PLTV/88888888/224/3221225519/index.m3u8?servicetype=1";
	        mUri=Uri.parse(s);
	        //Create media controller，组件可以控制视频的播放，暂停，回复，seek等操作，不需要你实现
	        mMediaController = new MediaController(getActivity());
	        mVideoView.setMediaController(mMediaController);
	        mVideoView.setVideoURI(mUri);
	        mVideoView.start();
		// Show the dummy content as text in a TextView.
//		if (mItem != null) {
//			((TextView) rootView.findViewById(R.id.channel_detail))
//					.setText(mItem.url);
//		}

		return rootView;
	}


    public void onPause() {
        // Stop video when the activity is pause.
        mPositionWhenPaused = mVideoView.getCurrentPosition();
        mVideoView.stopPlayback();
        super.onPause();
    }

    public void onResume() {
        // Resume video player
        if(mPositionWhenPaused >= 0) {
            mVideoView.seekTo(mPositionWhenPaused);
            mPositionWhenPaused = -1;
        }
        super.onResume();
    }
    
	@Override
	public boolean onError(MediaPlayer mp, int what, int extra) {
		// TODO Auto-generated method stub
		return false;
	}
}
