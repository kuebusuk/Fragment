package cuy.kab.fragment;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import cuy.kab.fragment.fragment.AlpukatFragment;
import cuy.kab.fragment.fragment.ApelFragment;
import cuy.kab.fragment.fragment.DurianFragment;

public class TabActivity extends AppCompatActivity {

    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.pager)
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        ButterKnife.bind(this);

        tablayout.addTab(tablayout.newTab().setText("Alpukat").setIcon(R.drawable.apel));
        tablayout.addTab(tablayout.newTab().setText("Apel").setIcon(R.drawable.apel));
        tablayout.addTab(tablayout.newTab().setText("Durian").setIcon(R.drawable.durian));

        PagerAdapter adapter = new CustomPager(getSupportFragmentManager());
    }

    private class CustomPager extends FragmentStatePagerAdapter {
        public CustomPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if (i==0){
                return new AlpukatFragment();
            } else if (i==1){
                return new ApelFragment();
            } else {
                return new DurianFragment();
            }
            // return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
