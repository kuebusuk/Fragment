package cuy.kab.fragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cuy.kab.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlpukatFragment extends Fragment {


    public AlpukatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alpukat, container, false);
    }

}
