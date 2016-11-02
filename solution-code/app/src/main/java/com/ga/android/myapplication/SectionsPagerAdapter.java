package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int mPageCount;

    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        /*Creating an instance of the Bundle we are going to pass to the Fragment
           and putting the first key/value pair as the position of the item
           since the fragment I created needs the position.
         */
        Bundle bundledArgs = new Bundle();
        bundledArgs.putInt(CustomFragment.FRAGMENT_POSITION, position);
        switch (position){
            /* This allows me to make the default perform the code in case 0
                because default will just continue through to case 0 instead
                of returning a Fragment
             */
            default:
            case 0:
                bundledArgs.putInt(CustomFragment.IMAGE_RES_ID, android.R.drawable.sym_def_app_icon);
                return CustomFragment.newInstance(bundledArgs);
            case 1:
                bundledArgs.putString(CustomFragment.TEXT_STRING, "This is where my profile info goes");
                return CustomFragment.newInstance(bundledArgs);
            case 2:
                bundledArgs.putString(CustomFragment.TEXT_STRING, "This is where my contact info goes");
                return CustomFragment.newInstance(bundledArgs);
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return mPageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "PICTURE";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
        }

    }
}
