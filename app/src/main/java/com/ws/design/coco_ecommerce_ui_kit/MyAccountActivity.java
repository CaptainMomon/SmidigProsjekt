package com.ws.design.coco_ecommerce_ui_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

public class MyAccountActivity extends AppCompatActivity {

    TextView title,edit,test,edit_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        title = (TextView)findViewById(R.id.title);
        edit_txt = (TextView)findViewById(R.id.edit_txt);
        edit_txt.setVisibility(View.GONE);
        edit = (TextView)findViewById(R.id.edit);
        edit.setVisibility(View.VISIBLE);
        title.setVisibility(View.VISIBLE);

    }
}
