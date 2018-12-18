package com.ws.design.coco_ecommerce_ui_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Adapter.MyExpandableListAdapter;

public class FilterActivity extends AppCompatActivity {

    TextView title;
    ImageView imageView;


    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;


    MyExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    List<Integer> listimage;
    HashMap<String, List<String>> listDataChild;


    private ExpandableListView mBrandsListView;
    ExpandableListView lvExp;

    private android.widget.ExpandableListAdapter mBrandAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        title = (TextView)findViewById(R.id.title);
        imageView = (ImageView)findViewById(R.id.search);

        title.setText("Filter");
        imageView.setVisibility(View.GONE);



        ExpandableListView lv1 = (ExpandableListView)
                findViewById(R.id.lvExp);



        mBrandsListView = (ExpandableListView) findViewById(R.id.lvExp);


        mBrandsListView.setAdapter(mBrandAdapter);

        mBrandsListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if ((previousGroup != -1) && (groupPosition != previousGroup)) {
                    mBrandsListView.collapseGroup(previousGroup);
                }
                previousGroup = groupPosition;
            }
        });



        mBrandsListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                return false;
            }
        });

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new MyExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }


    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Brand");
        listDataHeader.add("Color");
        listDataHeader.add("CPU Type");
        listDataHeader.add("Screen Size");
        listDataHeader.add("Body Weight");
        listDataHeader.add("Operating System");
        listDataHeader.add("RAM");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("322 Votes");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("322 Votes");


        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("322 Votes");

        List<String> top251 = new ArrayList<String>();
        top251.add("322 Votes");

        List<String> top252 = new ArrayList<String>();
        top252.add("322 Votes");

        List<String> top253 = new ArrayList<String>();
        top253.add("322 Votes");

        List<String> top254 = new ArrayList<String>();
        top254.add("322 Votes");


        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
        listDataChild.put(listDataHeader.get(3), top251);
        listDataChild.put(listDataHeader.get(4), top252);
        listDataChild.put(listDataHeader.get(5), top253);
        listDataChild.put(listDataHeader.get(6), top254);


        final CrystalRangeSeekbar rangeSeekbar = (CrystalRangeSeekbar) findViewById(R.id.rangeSeekbar1);


        final TextView tvMin = (TextView) findViewById(R.id.textMin1);
        final TextView tvMax = (TextView) findViewById(R.id.textMin2);

// set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tvMin.setText("$ " + String.valueOf(minValue));
                tvMax.setText("$ " + String.valueOf(maxValue));
            }
        });

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });
    }
}
