package crystaltiger.com.handbag.View.TrangChu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import crystaltiger.com.handbag.R;

/**
 * Created by nhuth on 3/18/2017.
 */

public class FragmentChuongTrinhKhuyenMai extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_chuongtrinhkhuyenmai,container,false);
        return view;
    }
}
