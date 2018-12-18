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

import ModellClass.CocoCartModel2;

public class RecycleAdapterCocoCart1 extends RecyclerView.Adapter<RecycleAdapterCocoCart1.MyViewHolder> {
    Context context;


    private List<CocoCartModel2> moviesList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView DeliverType,noOfDays,amount;
        ImageView radioButton;
        LinearLayout viewline;



        public MyViewHolder(View view) {
            super(view);

            DeliverType = (TextView) view.findViewById(R.id.deliveryType);
            amount = (TextView) view.findViewById(R.id.amount);
            noOfDays=(TextView)view.findViewById(R.id.noOfDays);
            viewline=(LinearLayout) view.findViewById(R.id.viewline);


        }

    }


    public RecycleAdapterCocoCart1(Context context, List<CocoCartModel2> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public RecycleAdapterCocoCart1.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_delivey_type_recycler, parent, false);


        return new RecycleAdapterCocoCart1.MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final RecycleAdapterCocoCart1.MyViewHolder holder, final int position) {
        CocoCartModel2 movie = moviesList.get(position);
        holder.DeliverType.setText(movie.getDeliverType());
        holder.amount.setText(movie.getAmount());
        holder.noOfDays.setText(movie.getNoOfDays());


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




