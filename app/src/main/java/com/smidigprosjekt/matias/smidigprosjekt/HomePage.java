package com.smidigprosjekt.matias.smidigprosjekt;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class HomePage extends AppCompatActivity {

    private static final String TAG = "HomePage";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        /*BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        final GroupFragment groupFragment = new GroupFragment();
        final ChatFragment chatFragment = new ChatFragment();
        final NotificationFragment notificationFragment = new NotificationFragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if(id == R.id.group) {
                    setFragment(groupFragment);
                    return true;
                } else if (id == R.id.chat){
                    setFragment(chatFragment);
                    return true;
                } else if (id == R.id.notifications){
                    setFragment(notificationFragment);
                    return true;
                }
                return false;
            }
        });*/


    }
    /*private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }*/

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1Fragment(), "FINN VENNER");
        adapter.addFragment(new tab2Fragment(), "FINN GRUPPER");
        viewPager.setAdapter(adapter);
    }
}
