package Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.List;

import ModellClass.NewArrivalKitchenModellClass;
import ModellClass.TopTenModelClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteNewArrivalKitchen extends RecyclerView.Adapter<RecycleAdapteNewArrivalKitchen.MyViewHolder> {
    Context context;


    private List<NewArrivalKitchenModellClass> moviesList;

    Dialog myDialog, slideDialog;
    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn11,btn22,btn33,btn44;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView image,like;
        TextView title,offer;
        LinearLayout linear;




        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            like = (ImageView) view.findViewById(R.id.like);
            title = (TextView)view.findViewById(R.id.title);
            offer = (TextView) view.findViewById(R.id.offer);
            linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteNewArrivalKitchen(Context context, List<NewArrivalKitchenModellClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_newarrival_kitchen_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        NewArrivalKitchenModellClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.like.setImageResource(movie.getLike());
        holder.title.setText(movie.getTitle());



        holder.offer.setText("$620");
        holder.offer.setPaintFlags(holder.offer.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                slideDialog = new Dialog(context, R.style.CustomDialogAnimation);
//                slideDialog.setContentView(R.layout.filter_popup);
//
//
//                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
//                slideDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
//                layoutParams.copyFrom(slideDialog.getWindow().getAttributes());
//
//                int width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.90);
//                int height = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.68);
//
//                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
//                layoutParams.height = height;
//                layoutParams.gravity = Gravity.BOTTOM;
//
//
//
//
//                btn1 = (RadioButton)slideDialog.findViewById(R.id.button1);
//                btn2 = (RadioButton)slideDialog.findViewById(R.id.button2);
//                btn3 = (RadioButton)slideDialog.findViewById(R.id.button3);
//                btn4 = (RadioButton)slideDialog.findViewById(R.id.button4);
//                btn5 = (RadioButton)slideDialog.findViewById(R.id.button5);
//                btn6 = (RadioButton)slideDialog.findViewById(R.id.button6);
//                btn11 = (RadioButton)slideDialog.findViewById(R.id.button11);
//                btn22 = (RadioButton)slideDialog.findViewById(R.id.button22);
//                btn33 = (RadioButton)slideDialog.findViewById(R.id.button33);
//                btn44 = (RadioButton)slideDialog.findViewById(R.id.button44);
//
//
//                Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
//
//                btn1.setText("Apple");
//                btn2.setText("Sony");
//                btn3.setText("Asus");
//                btn4.setText("LG");
//                btn5.setText("Lenovo");
//                btn6.setText("Samsung");
//                btn11.setText("Black");
//                btn22.setText("Yellow");
//                btn33.setText("Green");
//                btn44.setText("Pink");
//
//
//
//
//
//                btn1.setTypeface(font);
//                btn2.setTypeface(font);
//                btn3.setTypeface(font);
//                btn4.setTypeface(font);
//                btn5.setTypeface(font);
//                btn6.setTypeface(font);
//                btn11.setTypeface(font);
//                btn22.setTypeface(font);
//                btn33.setTypeface(font);
//                btn44.setTypeface(font);
//
//
//
//                slideDialog.getWindow().setAttributes(layoutParams);
//                slideDialog.setCancelable(true);
//                slideDialog.setCanceledOnTouchOutside(true);
//                slideDialog.show();
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


