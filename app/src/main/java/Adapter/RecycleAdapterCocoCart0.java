package Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.List;

import ModellClass.CocoCartModel1;

public class RecycleAdapterCocoCart0 extends RecyclerView.Adapter<RecycleAdapterCocoCart0.MyViewHolder> {
    Context context;


    private List<CocoCartModel1> moviesList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView phoneName,rupees;
        ImageView phoneImage;
        LinearLayout viewline;



        public MyViewHolder(View view) {
            super(view);

            phoneName = (TextView) view.findViewById(R.id.phoneName);
            rupees = (TextView) view.findViewById(R.id.amount);
            phoneImage=(ImageView)view.findViewById(R.id.phoneImage);
            viewline=(LinearLayout) view.findViewById(R.id.viewline);


        }

    }


    public RecycleAdapterCocoCart0(Context context, List<CocoCartModel1> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public RecycleAdapterCocoCart0.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_phone_recycler, parent, false);


        return new RecycleAdapterCocoCart0.MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final RecycleAdapterCocoCart0.MyViewHolder holder, final int position) {
        CocoCartModel1 movie = moviesList.get(position);
        holder.phoneName.setText(movie.getPhoneName());
        holder.rupees.setText(movie.getRupees());
        holder.phoneImage.setImageResource(movie.getPhoneImage());



        if(position==1){

            holder.viewline.setVisibility(View.GONE);
        }else {
            holder.viewline.setVisibility(View.VISIBLE);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }


        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}



