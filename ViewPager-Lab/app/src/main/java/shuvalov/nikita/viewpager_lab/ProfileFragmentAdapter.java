package shuvalov.nikita.viewpager_lab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by NikitaShuvalov on 11/1/16.
 */

public class ProfileFragmentAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> mFragmentArrayList;

    public ProfileFragmentAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList) {
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


    /*I wanted Fragment subclasses to hold the title to allow it to be more dynamic.
    But since my fragment objects were all cast to Fragment, I can't call getTitle without editing Fragment Class.
    This is my work-around to that, as dirty as it is.
    */
    @Override
    public CharSequence getPageTitle(int position) {
        Fragment frag = mFragmentArrayList.get(position);
        Class c = frag.getClass();
        if (c.equals(new PictureFragment().getClass())){
            PictureFragment p = (PictureFragment) frag;
            return p.getTitle();
        } else if (c.equals(new PersonalinfoFragment().getClass())){
            PersonalinfoFragment p = (PersonalinfoFragment) frag;
            return p.getTitle();
        }else if (c.equals(new UserContactFragment().getClass())){
            UserContactFragment p = (UserContactFragment) frag;
            return p.getTitle();
        }else{
            return null;
        }

    }
}
