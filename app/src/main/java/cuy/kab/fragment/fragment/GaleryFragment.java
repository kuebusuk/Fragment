package cuy.kab.fragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cuy.kab.fragment.R;
import cuy.kab.fragment.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class GaleryFragment extends Fragment {



    @BindView(R.id.pagerbuah)
    ViewPager pagerbuah;
    Unbinder unbinder;
    // setdata buah
    String namabuah[] = {"alpukat", "apel", "ceri", "durian", "manggis"};
    int gambarbuah[] = {R.drawable.alpukat
            , R.drawable.apel
            , R.drawable.ceri
            , R.drawable.durian
            , R.drawable.manggis};

    public GaleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_galery, container, false);
        unbinder = ButterKnife.bind(this, view);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity(),namabuah,gambarbuah);
        pagerbuah.setAdapter(adapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
