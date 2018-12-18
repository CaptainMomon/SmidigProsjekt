package com.ws.design.coco_ecommerce_ui_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

public class MyOrderActivity extends AppCompatActivity {

    TextView title;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        title = (TextView)findViewById(R.id.title);
        linearLayout = (LinearLayout)findViewById(R.id.linear);

        title.setText("My Orders");
        linearLayout.setVisibility(View.GONE);
    }
}
