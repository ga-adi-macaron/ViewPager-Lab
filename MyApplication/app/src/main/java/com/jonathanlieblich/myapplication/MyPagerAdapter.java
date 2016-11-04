package com.jonathanlieblich.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jonlieblich on 11/1/16.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new PictureFragment();
            case 1:
                return new PersonalInfoFragment();
            case 2:
                return new ContactInfoFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Me";
            case 1:
                return "About";
            case 2:
                return "Contact";
            default:
                return null;
        }
    }
}
