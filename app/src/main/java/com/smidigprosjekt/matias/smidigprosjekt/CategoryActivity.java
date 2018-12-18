package com.ws.design.coco_ecommerce_ui_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapteHomeBanner;
import ModellClass.HomeBannerModelClass;

public class CategoryActivity extends AppCompatActivity {

    TextView title;


    private ArrayList<HomeBannerModelClass> homeBannerModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapteHomeBanner mAdapter;
    private Integer image[] ={R.drawable.image95,R.drawable.image95,R.drawable.image95,R.drawable.image95};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        title = (TextView)findViewById(R.id.title);
        title.setText("Category");




//        Homepage Banner Recyclerview Code is here

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        homeBannerModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            HomeBannerModelClass beanClassForRecyclerView_contacts = new HomeBannerModelClass(image[i]);

            homeBannerModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapteHomeBanner(CategoryActivity.this, homeBannerModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CategoryActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);



    }
}
