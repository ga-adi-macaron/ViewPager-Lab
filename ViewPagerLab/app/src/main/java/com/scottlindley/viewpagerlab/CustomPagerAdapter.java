package com.scottlindley.viewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Scott Lindley on 11/1/2016.
 */

public class CustomPagerAdapter extends FragmentPagerAdapter {
    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PhotoFragment();
            case 1: return new InfoFragment();
            case 2: return new ContactFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Photo";
            case 1: return "Info";
            case 2: return "Contact";
            default: return null;
        }
    }
}
