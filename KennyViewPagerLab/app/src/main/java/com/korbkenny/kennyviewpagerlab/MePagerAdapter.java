package com.korbkenny.kennyviewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by KorbBookProReturns on 11/1/16.
 */

public class MePagerAdapter extends FragmentPagerAdapter {
    public MePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PictureFragmentOne();
            case 1:
                return new AboutFragmentTwo();
            case 2:
                return new ContactFragmentThree();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
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
