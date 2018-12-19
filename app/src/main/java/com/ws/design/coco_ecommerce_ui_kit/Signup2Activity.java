package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import Adapter.ProfilePagerAdapter_walkthrough_01;
import me.relex.circleindicator.CircleIndicator;

public class Signup2Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private ProfilePagerAdapter_walkthrough_01 profilePagerAdapterWalkthrough01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        profilePagerAdapterWalkthrough01 = new ProfilePagerAdapter_walkthrough_01(getSupportFragmentManager());

        viewPager.setAdapter(profilePagerAdapterWalkthrough01);

        indicator.setViewPager(viewPager);

        profilePagerAdapterWalkthrough01.registerDataSetObserver(indicator.getDataSetObserver());


    }
}
