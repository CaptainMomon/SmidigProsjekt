package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import fragment.NewArrivalFragment;


/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterExplor extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterExplor(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                NewArrivalFragment tab1 = new NewArrivalFragment();
                                return tab1;
                        case 1:
                                NewArrivalFragment tab2 = new NewArrivalFragment();
                                return tab2;
                        case 2:
                                NewArrivalFragment tab3 = new NewArrivalFragment();
                                return tab3;

                        case 3:
                                NewArrivalFragment tab4 = new NewArrivalFragment();
                                return tab4;


                        case 4:
                                NewArrivalFragment tab5 = new NewArrivalFragment();
                                return tab5;


                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

