package Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.design.coco_ecommerce_ui_kit.AddNewAddressActivity;
import com.ws.design.coco_ecommerce_ui_kit.CategoryActivity;
import com.ws.design.coco_ecommerce_ui_kit.CocoAddNewAddress1Activity;
import com.ws.design.coco_ecommerce_ui_kit.CocoCart1Activity;
import com.ws.design.coco_ecommerce_ui_kit.CocoCartActivity;
import com.ws.design.coco_ecommerce_ui_kit.CocoEmptyWhishListActivity;
import com.ws.design.coco_ecommerce_ui_kit.CocoFilter1_Activity;
import com.ws.design.coco_ecommerce_ui_kit.CocoHomepage;
import com.ws.design.coco_ecommerce_ui_kit.CocoLogin1Activity;
import com.ws.design.coco_ecommerce_ui_kit.CocoLoginActivity;
import com.ws.design.coco_ecommerce_ui_kit.CocoSearch1;
import com.ws.design.coco_ecommerce_ui_kit.Coco_Search2;
import com.ws.design.coco_ecommerce_ui_kit.Coco_Search3;
import com.ws.design.coco_ecommerce_ui_kit.Coco_Search_Activity;
import com.ws.design.coco_ecommerce_ui_kit.ExploreActivity;
import com.ws.design.coco_ecommerce_ui_kit.FilterActivity;
import com.ws.design.coco_ecommerce_ui_kit.KitchenActivity;
import com.ws.design.coco_ecommerce_ui_kit.MobileVerificationActivity;
import com.ws.design.coco_ecommerce_ui_kit.MyAccountActivity;
import com.ws.design.coco_ecommerce_ui_kit.MyOrderActivity;
import com.ws.design.coco_ecommerce_ui_kit.Navigation1;
import com.ws.design.coco_ecommerce_ui_kit.NavigationActivity2;
import com.ws.design.coco_ecommerce_ui_kit.Navigation_Activity;
import com.ws.design.coco_ecommerce_ui_kit.ProductDetailActivity;
import com.ws.design.coco_ecommerce_ui_kit.ProductGridActivity;
import com.ws.design.coco_ecommerce_ui_kit.ProductListActivity;
import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;
import com.ws.design.coco_ecommerce_ui_kit.ReviewActivity;
import com.ws.design.coco_ecommerce_ui_kit.Signup1Activity;
import com.ws.design.coco_ecommerce_ui_kit.Signup2Activity;

import java.util.List;

import ModellClass.CocoListModelClass;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapteCocoList extends RecyclerView.Adapter<RecycleAdapteCocoList.MyViewHolder> {
    Context context;


    private List<CocoListModelClass> moviesList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;
        ImageView image;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);

            linear = (LinearLayout) view.findViewById(R.id.linear);

        }

    }


    public RecycleAdapteCocoList(Context context, List<CocoListModelClass> moviesList) {
        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_coco_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder,final int position) {
        CocoListModelClass movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, CocoHomepage.class);
                    context.startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(context, Navigation_Activity.class);
                    context.startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(context, ExploreActivity.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, CategoryActivity.class);
                    context.startActivity(i);
                } else if (position == 4) {
                    Intent i = new Intent(context, KitchenActivity.class);
                    context.startActivity(i);
                }else if (position == 5) {
                    Intent i = new Intent(context, ProductDetailActivity.class);
                    context.startActivity(i);
                }else if (position == 6) {
                    Intent i = new Intent(context, ProductGridActivity.class);
                    context.startActivity(i);
                }else if (position == 7) {
                    Intent i = new Intent(context, ProductListActivity.class);
                    context.startActivity(i);
                }else if (position == 8) {
                    Intent i = new Intent(context, FilterActivity.class);
                    context.startActivity(i);
                }else if (position == 9) {
                    Intent i = new Intent(context, Coco_Search_Activity.class);
                    context.startActivity(i);
                }else if (position == 10) {
                    Intent i = new Intent(context, CocoSearch1.class);
                    context.startActivity(i);
                }else if (position == 11) {
                    Intent i = new Intent(context, Coco_Search2.class);
                    context.startActivity(i);
                }else if (position == 12) {
                    Intent i = new Intent(context, Coco_Search3.class);
                    context.startActivity(i);
                }else if (position == 13) {
                    Intent i = new Intent(context, MyOrderActivity.class);
                    context.startActivity(i);
                }else if (position == 14) {
                    Intent i = new Intent(context, MyAccountActivity.class);
                    context.startActivity(i);
                }else if (position == 15) {
                    Intent i = new Intent(context, Navigation1.class);
                    context.startActivity(i);
                }else if (position == 16) {
                    Intent i = new Intent(context, NavigationActivity2.class);
                    context.startActivity(i);
                }else if (position == 17) {
                    Intent i = new Intent(context, AddNewAddressActivity.class);
                    context.startActivity(i);
                }else if (position == 18) {
                    Intent i = new Intent(context, CocoAddNewAddress1Activity.class);
                    context.startActivity(i);
                }else if (position == 19) {
                    Intent i = new Intent(context, CocoCartActivity.class);
                    context.startActivity(i);
                }else if (position == 20) {
                    Intent i = new Intent(context, CocoCart1Activity.class);
                    context.startActivity(i);
                } else if (position == 21) {
                    Intent i = new Intent(context, CocoEmptyWhishListActivity.class);
                    context.startActivity(i);
                }else if (position == 22) {
                    Intent i = new Intent(context, CocoLogin1Activity.class);
                    context.startActivity(i);
                }else if (position == 23) {
                    Intent i = new Intent(context, CocoLoginActivity.class);
                    context.startActivity(i);
                }else if (position == 24) {
                    Intent i = new Intent(context, MobileVerificationActivity.class);
                    context.startActivity(i);
                }else if (position == 25) {
                    Intent i = new Intent(context, Signup1Activity.class);
                    context.startActivity(i);
                }else if (position == 26) {
                    Intent i = new Intent(context, Signup2Activity.class);
                    context.startActivity(i);
                }else if (position == 27) {
                    Intent i = new Intent(context, ReviewActivity.class);
                    context.startActivity(i);
                }else if (position == 27) {
                    Intent i = new Intent(context, ReviewActivity.class);
                    context.startActivity(i);
                }else if (position == 28) {
                    Intent i = new Intent(context, CocoFilter1_Activity.class);
                    context.startActivity(i);
                }

            }

        });





    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


