package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapterCocoCart0;
import Adapter.RecycleAdapterCocoCart1;
import Adapter.RecycleAdapterCocoCart2;
import ModellClass.CocoCartModel1;
import ModellClass.CocoCartModel2;
import ModellClass.CocoCartModel3;

public class CocoCartActivity extends AppCompatActivity {

    private ArrayList<CocoCartModel1> navigationModelClasses;
    private RecyclerView recyclerView;
    private RecycleAdapterCocoCart0 mAdapter;

    private ArrayList<CocoCartModel2> navigationModelClasses1;
    private RecyclerView recyclerView1;
    private RecycleAdapterCocoCart1 bAdapter;


    private ArrayList<CocoCartModel3> navigationModelClasses2;
    private RecyclerView recyclerView2;
    private RecycleAdapterCocoCart2 cAdapter;

    String rupees[]={"$329","$450"};
    String phoneName[]={"Iphone X | 128 GB, Black | 6 GB ram |\n" +
            "12000 mAh battry","Mi Mix 2 (Black, 128 GB) 6GB Ram \n" +
            "with 5000 mAh…"};
    Integer phoneImage[]={R.drawable.mobile1, R.drawable.mobile2};


    String deliverType[]={"Express Delivery","Normal Delivery"};
    String noOfDays[]={"1 day Delivery","Upto 5 Business Days"};
    String amount[]={"+$9.00",""};


    String paymentType[]={"Credit / Debit Card","Cash On Delivery","PAYTM","Google Wallet"};
    Integer logoImage[]={R.drawable.credit, R.drawable.cash, R.drawable.paytm, R.drawable.googlewallet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_cart);

        recyclerView = (RecyclerView)findViewById(R.id.recycler1);
        navigationModelClasses = new ArrayList<>();
        for (int i = 0; i < rupees.length; i++) {
            CocoCartModel1 beanClassForRecyclerView_contacts = new CocoCartModel1(phoneName[i],rupees[i],phoneImage[i]);

            navigationModelClasses.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new RecycleAdapterCocoCart0(CocoCartActivity.this,navigationModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CocoCartActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);





        recyclerView1 = (RecyclerView)findViewById(R.id.recycler2);

        navigationModelClasses1 = new ArrayList<>();



        for (int i = 0; i < deliverType.length; i++) {
            CocoCartModel2 beanClassForRecyclerView_contacts = new CocoCartModel2(deliverType[i],noOfDays[i],amount[i]);

            navigationModelClasses1.add(beanClassForRecyclerView_contacts);
        }


        bAdapter = new RecycleAdapterCocoCart1(CocoCartActivity.this,navigationModelClasses1);

        RecyclerView.LayoutManager bLayoutManager = new LinearLayoutManager(CocoCartActivity.this);
        recyclerView1.setLayoutManager(bLayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(bAdapter);


        recyclerView2 = (RecyclerView)findViewById(R.id.recycler3);
        navigationModelClasses2 = new ArrayList<>();
        for (int i = 0; i < paymentType.length; i++) {
            CocoCartModel3 beanClassForRecyclerView_contacts = new CocoCartModel3(paymentType[i],logoImage[i]);

            navigationModelClasses2.add(beanClassForRecyclerView_contacts);
        }
        cAdapter = new RecycleAdapterCocoCart2(CocoCartActivity.this,navigationModelClasses2);

        RecyclerView.LayoutManager cLayoutManager = new LinearLayoutManager(CocoCartActivity.this);
        recyclerView2.setLayoutManager(cLayoutManager);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(cAdapter);



    }
}
