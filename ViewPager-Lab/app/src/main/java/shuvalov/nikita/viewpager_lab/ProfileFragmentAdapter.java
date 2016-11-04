package shuvalov.nikita.viewpager_lab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by NikitaShuvalov on 11/1/16.
 */

public class ProfileFragmentAdapter extends FragmentPagerAdapter {
    ArrayList<MyFragments> mFragmentArrayList;

    public ProfileFragmentAdapter(FragmentManager fm, ArrayList<MyFragments> fragmentArrayList) {
        super(fm);
        mFragmentArrayList=fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentArrayList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentArrayList.get(position).getTitle();

        }

    }
