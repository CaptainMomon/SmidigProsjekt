package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.ArrayList;

import Adapter.RecycleAdapteNewArrivalKitchen;
import ModellClass.NewArrivalKitchenModellClass;


public class NewArrivalKitchenFragment extends Fragment {







    private ArrayList<NewArrivalKitchenModellClass> newArrivalKitchenModellClasses;
    private RecyclerView recyclerview;
    private RecycleAdapteNewArrivalKitchen mAdapter2;
    private Integer image1[]={R.drawable.ac,R.drawable.kitchenboxes,R.drawable.ac,R.drawable.kitchenboxes};
    private String title1[] ={"Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color","Vigo Atom Personal Air Condi....","Bosh Head Phone Blue Color",};
    private Integer like[] = {R.drawable.hearticon,R.drawable.hearticongray,R.drawable.hearticon,R.drawable.hearticongray,};






    TextView offer;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_newarrival_kitchen, container, false);






        //      New Arrival Kitchen  Recyclerview Code is here

        recyclerview = (RecyclerView)view.findViewById(R.id.recyclerview);

        newArrivalKitchenModellClasses = new ArrayList<>();



        for (int i = 0; i < image1.length; i++) {
            NewArrivalKitchenModellClass beanClassForRecyclerView_contacts = new NewArrivalKitchenModellClass(image1[i],title1[i],like[i]);

            newArrivalKitchenModellClasses.add(beanClassForRecyclerView_contacts);
        }



        mAdapter2 = new RecycleAdapteNewArrivalKitchen(getActivity(),newArrivalKitchenModellClasses);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(mLayoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());
        recyclerview.setAdapter(mAdapter2);






        return view;
    }
}
