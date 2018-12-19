package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapterCocoCart;
import ModellClass.CocoCartModel1;

public class CocoCart1Activity extends AppCompatActivity {

    private ArrayList<CocoCartModel1> navigationModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapterCocoCart mAdapter;

    String rupees[]={"$329","$450","$90"};
    String phoneName[]={"Iphone X | 128 GB, Black | 6 GB ram |\n" +
            "12000 mAh battry","Mi Mix 2 (Black, 128 GB) 6GB Ram \n" +
            "with 5000 mAh…","Food container, set of 3 container,\n" +
            "yellow color"};
    Integer phoneImage[]={R.drawable.mobile1, R.drawable.mobile2, R.drawable.mobile1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_cart1);

        recyclerView = (RecyclerView)findViewById(R.id.recycler1);
        navigationModelClasses = new ArrayList<>();
        for (int i = 0; i < rupees.length; i++) {
            CocoCartModel1 beanClassForRecyclerView_contacts = new CocoCartModel1(phoneName[i],rupees[i],phoneImage[i]);

            navigationModelClasses.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new RecycleAdapterCocoCart(CocoCart1Activity.this,navigationModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CocoCart1Activity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }
}
