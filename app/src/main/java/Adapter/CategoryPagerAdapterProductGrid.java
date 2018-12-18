package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.NewArrivalKitchenFragment;
import fragment.PopularFragment;


/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterProductGrid extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterProductGrid(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                PopularFragment tab1 = new PopularFragment();
                                return tab1;
                        case 1:
                                PopularFragment tab2 = new PopularFragment();
                                return tab2;
                        case 2:
                                PopularFragment tab3 = new PopularFragment();
                                return tab3;

                        case 3:
                                PopularFragment tab4 = new PopularFragment();
                                return tab4;


                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

