package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.NewArrivalFragment;
import fragment.NewArrivalKitchenFragment;


/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterKitchen extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterKitchen(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                NewArrivalKitchenFragment tab1 = new NewArrivalKitchenFragment();
                                return tab1;
                        case 1:
                                NewArrivalKitchenFragment tab2 = new NewArrivalKitchenFragment();
                                return tab2;
                        case 2:
                                NewArrivalKitchenFragment tab3 = new NewArrivalKitchenFragment();
                                return tab3;

                        case 3:
                                NewArrivalKitchenFragment tab4 = new NewArrivalKitchenFragment();
                                return tab4;


                        case 4:
                                NewArrivalKitchenFragment tab5 = new NewArrivalKitchenFragment();
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

