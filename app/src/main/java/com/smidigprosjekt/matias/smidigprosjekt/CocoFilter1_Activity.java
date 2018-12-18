package com.ws.design.coco_ecommerce_ui_kit;

import android.app.Dialog;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

public class CocoFilter1_Activity extends AppCompatActivity {

    TextView txt1;

    ImageView filter_img;

    Dialog myDialog, slideDialog;
    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn11,btn22,btn33,btn44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coco_filter1);

        txt1 = (TextView)findViewById(R.id.txt1);
        txt1.setText("Coco Filter1");

        filter_img = (ImageView)findViewById(R.id.filter_img);


        filter_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideDialog = new Dialog(CocoFilter1_Activity.this, R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.filter_popup);


                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                slideDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
                layoutParams.copyFrom(slideDialog.getWindow().getAttributes());

                int width = (int) (CocoFilter1_Activity.this.getResources().getDisplayMetrics().widthPixels * 0.90);
                int height = (int) (CocoFilter1_Activity.this.getResources().getDisplayMetrics().heightPixels * 0.68);

                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
                layoutParams.height = height;
                layoutParams.gravity = Gravity.BOTTOM;




                btn1 = (RadioButton)slideDialog.findViewById(R.id.button1);
                btn2 = (RadioButton)slideDialog.findViewById(R.id.button2);
                btn3 = (RadioButton)slideDialog.findViewById(R.id.button3);
                btn4 = (RadioButton)slideDialog.findViewById(R.id.button4);
                btn5 = (RadioButton)slideDialog.findViewById(R.id.button5);
                btn6 = (RadioButton)slideDialog.findViewById(R.id.button6);
                btn11 = (RadioButton)slideDialog.findViewById(R.id.button11);
                btn22 = (RadioButton)slideDialog.findViewById(R.id.button22);
                btn33 = (RadioButton)slideDialog.findViewById(R.id.button33);
                btn44 = (RadioButton)slideDialog.findViewById(R.id.button44);


                Typeface font = Typeface.createFromAsset(CocoFilter1_Activity.this.getAssets(), "fonts/Roboto-Medium.ttf");

                btn1.setText("Apple");
                btn2.setText("Sony");
                btn3.setText("Asus");
                btn4.setText("LG");
                btn5.setText("Lenovo");
                btn6.setText("Samsung");
                btn11.setText("Black");
                btn22.setText("Yellow");
                btn33.setText("Green");
                btn44.setText("Pink");





                btn1.setTypeface(font);
                btn2.setTypeface(font);
                btn3.setTypeface(font);
                btn4.setTypeface(font);
                btn5.setTypeface(font);
                btn6.setTypeface(font);
                btn11.setTypeface(font);
                btn22.setTypeface(font);
                btn33.setTypeface(font);
                btn44.setTypeface(font);



                slideDialog.getWindow().setAttributes(layoutParams);
                slideDialog.setCancelable(true);
                slideDialog.setCanceledOnTouchOutside(true);
                slideDialog.show();
            }
        });

    }
}
