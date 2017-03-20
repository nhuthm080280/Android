package crystaltiger.com.handbag.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

import crystaltiger.com.handbag.View.TrangChu.Fragment.FragmentChuongTrinhKhuyenMai;
import crystaltiger.com.handbag.View.TrangChu.Fragment.FragmentNoiBat;
import crystaltiger.com.handbag.View.TrangChu.Fragment.FragmentTuiXachNu;
import crystaltiger.com.handbag.View.TrangChu.Fragment.FragmentViDaNam;

/**
 * Created by nhuth on 3/18/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment = new ArrayList<Fragment>();
    List<String> titleFragment = new ArrayList<String>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment.add(new FragmentNoiBat());
        listFragment.add(new FragmentChuongTrinhKhuyenMai());
        listFragment.add(new FragmentTuiXachNu());
        listFragment.add(new FragmentViDaNam());

        titleFragment.add("Nổi Bật");
        titleFragment.add("Chương Trình Khuyến Mãi");
        titleFragment.add("Túi Xách Nữ");
        titleFragment.add("Ví Da Nam");
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragment.get(position);
    }
}
