package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

public class CocoAddNewAddress1Activity extends AppCompatActivity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_add_new_address1);
        txt1=(TextView)findViewById(R.id.txt1);
        txt1.setText("Create Instant Account");
    }
}
