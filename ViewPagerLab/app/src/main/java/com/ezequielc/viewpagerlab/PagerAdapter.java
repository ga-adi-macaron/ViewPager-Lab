package com.ezequielc.viewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by student on 11/1/16.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PictureFragment();
            case 1:
                return new AboutMeFragment();
            case 2:
                return new ContactFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Picture";
            case 1:
                return "About Me";
            case 2:
                return "Contact";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
