package Adapter;

import android.content.Context;
import android.graphics.Color;
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

import ModellClass.HomeBannerModelClass;
import ModellClass.NavigationModelClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteHomeBanner extends RecyclerView.Adapter<RecycleAdapteHomeBanner.MyViewHolder> {
    Context context;


    private List<HomeBannerModelClass> moviesList;




    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView image;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);

            linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteHomeBanner(Context context, List<HomeBannerModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_banner_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        HomeBannerModelClass movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());




    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


