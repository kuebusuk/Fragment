package cuy.kab.fragment.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cuy.kab.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {


    @BindView(R.id.video)
    VideoView video;
    Unbinder unbinder;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        unbinder = ButterKnife.bind(this, view);
        Uri lokasifile = Uri.parse("android.resource://"+getContext().getPackageName()
        +"/"+R.raw.qwe);
        video.setVideoURI(lokasifile);
        video.setMediaController(new MediaController(getContext()));
        video.start();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
