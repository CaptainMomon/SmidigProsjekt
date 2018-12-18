package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Fragment_one;


public class ProfilePagerAdapter_walkthrough_01 extends FragmentStatePagerAdapter {



    public ProfilePagerAdapter_walkthrough_01(FragmentManager fm) {
        super(fm);

    }



    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_one tab1 = new Fragment_one();
                return tab1;

            case 1:
                Fragment_one tab6 = new Fragment_one();
                return tab6;


            case 2:
                Fragment_one tab2 = new Fragment_one();
                return tab2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}