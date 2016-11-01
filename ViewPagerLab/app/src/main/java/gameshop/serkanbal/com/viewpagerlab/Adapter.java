package gameshop.serkanbal.com.viewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Serkan on 01/11/16.
 */

public class Adapter extends FragmentPagerAdapter {


    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PictureFragment();
            case 1:
                return new AboutMeFragment();
            case 2:
                return new ContactInfoFragment();
            case 3:
                return new SocialStatusFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Picture";
            case 1:
                return "About Me";
            case 2:
                return "Contact Info";
            case 3:
                return "Social Status";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
