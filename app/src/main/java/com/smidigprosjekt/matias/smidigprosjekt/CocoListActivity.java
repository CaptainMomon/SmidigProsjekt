package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapteCocoList;
import ModellClass.CocoListModelClass;

public class CocoListActivity extends AppCompatActivity {



    private ArrayList<CocoListModelClass> cocoListModelClasses;

    private RecyclerView recyclerView;
    private RecycleAdapteCocoList mAdapter;


    private String title[] = {"HomePage","Navigation","Explore","Category","Kitchen","Product Detail","Product Detail Grid",
    "Product List","Filter","Coco Search","Coco Search1","Coco Search2","Coco Search3","MyOrder","My Account",
            "Navigation1","Navigation2","Add New Address","Crate Instant Account","Cart","Cart1","WishList","Login","Login1",
    "Mobile Verification","Coco SignUp1","Coco SignUp2","Review","Coco Filter1"};


    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder() {
            super(new TextView(getApplicationContext()));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_list);


        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);



        recyclerView.invalidate();
        recyclerView.setAdapter(new RecyclerView.Adapter<ViewHolder>() {


            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder();
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                ((TextView) holder.itemView).setText("item: " + position);
                holder.itemView.setPadding(10,10,10,10);
            }


            @Override
            public int getItemCount() {
                return 50;
            }
        });


        cocoListModelClasses = new ArrayList<>();



        for (int i = 0; i < title.length; i++) {
            CocoListModelClass beanClassForRecyclerView_contacts = new CocoListModelClass(title[i]);

            cocoListModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapteCocoList(CocoListActivity.this,cocoListModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CocoListActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
