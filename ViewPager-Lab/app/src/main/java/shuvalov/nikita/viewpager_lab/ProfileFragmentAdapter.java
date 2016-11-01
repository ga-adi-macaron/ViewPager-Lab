package shuvalov.nikita.viewpager_lab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by NikitaShuvalov on 11/1/16.
 */

public class ProfileFragmentAdapter extends FragmentPagerAdapter {
    public ProfileFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
