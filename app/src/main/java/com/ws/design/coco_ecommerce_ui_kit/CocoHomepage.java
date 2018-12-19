package com.ws.design.coco_ecommerce_ui_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapteHomeBanner;
import Adapter.RecycleAdapteHomeCategory;
import Adapter.RecycleAdapteTopTenHome;
import ModellClass.HomeBannerModelClass;
import ModellClass.HomeCategoryModelClass;
import ModellClass.TopTenModelClass;

public class CocoHomepage extends AppCompatActivity {


    private ArrayList<HomeBannerModelClass> homeBannerModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapteHomeBanner mAdapter;
    private Integer image[] ={R.drawable.image95,R.drawable.image95,R.drawable.image95,R.drawable.image95};




    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView category_recyclerView;
    private RecycleAdapteHomeCategory mAdapter1;
    private String title[] ={"All Categories","Men","Women","Electronics","Home and Furniture","Sports"};



    private ArrayList<TopTenModelClass> topTenModelClasses;
    private RecyclerView top_ten_crecyclerview;
    private RecycleAdapteTopTenHome mAdapter2;
    private Integer image1[]={R.drawable.ac,R.drawable.headphones,R.drawable.ac,R.drawable.headphones};
    private String title1[] ={"Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color","Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color",};
    private String type[] = {"Kitenid","HeadPhones","Kitenid","HeadPhones"};




    private ArrayList<TopTenModelClass> topTenModelClasses1;
    private RecyclerView like_recyclerview;
    private RecycleAdapteTopTenHome mAdapter3;
    private Integer image2[]={R.drawable.mobile1,R.drawable.mobile2,R.drawable.mobile1,R.drawable.mobile2};
    private String title2[] ={"Samsung On Mask 2GB Ram","Samsung Galaxy 8 6GB Ram","Samsung On Mask 2GB Ram","Samsung Galaxy 8 6GB Ram"};
    private String type2[] = {"Phones","Phones","Phones","Phones"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_homepage);


//        Homepage Banner Recyclerview Code is here

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        homeBannerModelClasses = new ArrayList<>();



        for (int i = 0; i < image.length; i++) {
            HomeBannerModelClass beanClassForRecyclerView_contacts = new HomeBannerModelClass(image[i]);

            homeBannerModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapteHomeBanner(CocoHomepage.this, homeBannerModelClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CocoHomepage.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);


        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);




        //        Category Recyclerview Code is here

        category_recyclerView = (RecyclerView)findViewById(R.id.category_recyclerview);

        homeCategoryModelClasses = new ArrayList<>();



        for (int i = 0; i < title.length; i++) {
            HomeCategoryModelClass beanClassForRecyclerView_contacts = new HomeCategoryModelClass(title[i]);

            homeCategoryModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter1 = new RecycleAdapteHomeCategory(CocoHomepage.this, homeCategoryModelClasses);
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(CocoHomepage.this, LinearLayoutManager.HORIZONTAL, false);
        category_recyclerView.setLayoutManager(mLayoutManager1);


        category_recyclerView.setLayoutManager(mLayoutManager1);
        category_recyclerView.setItemAnimator(new DefaultItemAnimator());
        category_recyclerView.setAdapter(mAdapter1);



        //        Top Ten  Recyclerview Code is here

        top_ten_crecyclerview = (RecyclerView)findViewById(R.id.top_ten_recyclerview);

        topTenModelClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image1[i],title1[i],type[i]);

            topTenModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter2 = new RecycleAdapteTopTenHome(CocoHomepage.this, topTenModelClasses);
        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(CocoHomepage.this, LinearLayoutManager.HORIZONTAL, false);
        top_ten_crecyclerview.setLayoutManager(mLayoutManager2);


        top_ten_crecyclerview.setLayoutManager(mLayoutManager2);
        top_ten_crecyclerview.setItemAnimator(new DefaultItemAnimator());
        top_ten_crecyclerview.setAdapter(mAdapter2);




        //      Like  Recyclerview Code is here

        like_recyclerview = (RecyclerView)findViewById(R.id.like_recyclerview);

        topTenModelClasses1 = new ArrayList<>();



        for (int i = 0; i < image2.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image2[i],title2[i],type2[i]);

            topTenModelClasses1.add(beanClassForRecyclerView_contacts);
        }


        mAdapter3 = new RecycleAdapteTopTenHome(CocoHomepage.this, topTenModelClasses1);
        RecyclerView.LayoutManager mLayoutManager3 = new LinearLayoutManager(CocoHomepage.this, LinearLayoutManager.HORIZONTAL, false);
        like_recyclerview.setLayoutManager(mLayoutManager3);


        like_recyclerview.setLayoutManager(mLayoutManager3);
        like_recyclerview.setItemAnimator(new DefaultItemAnimator());
        like_recyclerview.setAdapter(mAdapter3);


        //        Recent  Recyclerview Code is here

        top_ten_crecyclerview = (RecyclerView)findViewById(R.id.recent_recyclerview);

        topTenModelClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            TopTenModelClass beanClassForRecyclerView_contacts = new TopTenModelClass(image1[i],title1[i],type[i]);

            topTenModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter2 = new RecycleAdapteTopTenHome(CocoHomepage.this, topTenModelClasses);
        RecyclerView.LayoutManager mLayoutManager4 = new LinearLayoutManager(CocoHomepage.this, LinearLayoutManager.HORIZONTAL, false);
        top_ten_crecyclerview.setLayoutManager(mLayoutManager4);


        top_ten_crecyclerview.setLayoutManager(mLayoutManager4);
        top_ten_crecyclerview.setItemAnimator(new DefaultItemAnimator());
        top_ten_crecyclerview.setAdapter(mAdapter2);


    }
}
