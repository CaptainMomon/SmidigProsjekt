package com.ws.design.coco_ecommerce_ui_kit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

public class AddNewAddressActivity extends AppCompatActivity {
TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_address);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt1.setText("Add New Address");
        txt2.setVisibility(View.VISIBLE);
    }
}
