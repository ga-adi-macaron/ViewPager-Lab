package com.elysium.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jay on 11/2/16.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new ProfileFragment();
            case 1: return new AboutJayFragment();
            case 2: return new ContactInfoFragment();
            default: return null;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Picture";
            case 1: return "About Me";
            case 2: return "Contact";
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
