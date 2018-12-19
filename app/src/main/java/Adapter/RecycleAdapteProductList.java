package Adapter;

import android.content.Context;
import android.graphics.Paint;
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

import ModellClass.ProductGridModellClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteProductList extends RecyclerView.Adapter<RecycleAdapteProductList.MyViewHolder> {
    Context context;


    private List<ProductGridModellClass> moviesList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title,offer;
        ImageView image;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            offer = (TextView) view.findViewById(R.id.offer);
            linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteProductList(Context context, List<ProductGridModellClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_popular_list2, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        ProductGridModellClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());

//        holder.offer.setText("\u20B9 63,999");
//        holder.offer.setPaintFlags(holder.offer.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


