package com.colinbradley.viewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by colinbradley on 11/1/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PictureFragment();
            case 1:
                return new UserInfoFragment();
            case 2:
                return new ContactInfoFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "PROFILE PIC";
            case 1:
                return "USER INFO";
            case 2:
                return "CONTACT INFO";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
