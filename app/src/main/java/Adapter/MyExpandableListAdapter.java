package Adapter; /**
 * Created by Wolf Soft on 11/24/2016.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;


import com.example.wolfsoft2.coco_ecommerce_ui_kit.R;

import java.util.HashMap;
import java.util.List;


public class MyExpandableListAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;


    private int lastExpandedPosition = -1;

    private LinearLayout lblListHeader,line;

    ExpandableListView lvExp;


    RadioButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;




    public MyExpandableListAdapter(Context context, List<String> listDataHeader,
                                 HashMap<String, List<String>> listChildData) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);







    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {




        final String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.item_list, null);


            btn1 = (RadioButton)convertView.findViewById(R.id.button1);
            btn2 = (RadioButton)convertView.findViewById(R.id.button2);
            btn3 = (RadioButton)convertView.findViewById(R.id.button3);
            btn4 = (RadioButton)convertView.findViewById(R.id.button4);
            btn5 = (RadioButton)convertView.findViewById(R.id.button5);
            btn6 = (RadioButton)convertView.findViewById(R.id.button6);
            btn7 = (RadioButton)convertView.findViewById(R.id.button7);
            btn8 = (RadioButton)convertView.findViewById(R.id.button8);

            Typeface font = Typeface.createFromAsset(_context.getAssets(), "fonts/Roboto-Medium.ttf");

            btn1.setText("Apple");
            btn2.setText("Sony");
            btn3.setText("Asus");
            btn4.setText("LG");
            btn5.setText("Lenovo");
            btn6.setText("Samsung");
            btn7.setText("Xiaomi");
            btn8.setText("HTC");




            btn1.setTypeface(font);
            btn2.setTypeface(font);
            btn3.setTypeface(font);

            btn4.setTypeface(font);
            btn5.setTypeface(font);
            btn6.setTypeface(font);

            btn7.setTypeface(font);
            btn8.setTypeface(font);
        }

        LinearLayout txtListChild = (LinearLayout) convertView
                .findViewById(R.id.lblListItem);

//        txtListChild.setText(childText);
        return convertView;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }


    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setText(headerTitle);


        final ExpandableListView lvExp = (ExpandableListView) convertView
                .findViewById(R.id.lvExp);






        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


}


