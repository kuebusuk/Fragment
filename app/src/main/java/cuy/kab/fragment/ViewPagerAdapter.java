package cuy.kab.fragment;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPagerAdapter extends PagerAdapter {
    FragmentActivity fragmentActivity;
    String namabuah[];
    int gambarbuah[];

    public ViewPagerAdapter(FragmentActivity activity, String[] namabuah, int[] gambarbuah) {
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
        fragmentActivity = activity;
    }


    @Override
    public int getCount() {
        return gambarbuah.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((LinearLayout) o);

    }

    // isi atau mengatur tampilan

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = fragmentActivity.getLayoutInflater();
        View v = inflater.inflate(R.layout.tampilangalery, null);
        ViewHolder holder = new ViewHolder(v);
        holder.txtbuah.setText(namabuah[position]);
        holder.imgbuah.setImageResource(gambarbuah[position]);
        ((ViewPager)container).addView(v);
        return (v);
    }

    static class ViewHolder {
        @BindView(R.id.imgmakanan)
        ImageView imgbuah;
        @BindView(R.id.txtbuah)
        TextView txtbuah;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
