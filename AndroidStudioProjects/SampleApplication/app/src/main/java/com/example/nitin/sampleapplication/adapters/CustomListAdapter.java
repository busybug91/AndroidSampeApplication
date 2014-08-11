package com.example.nitin.sampleapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nitin.sampleapplication.R;
import com.example.nitin.sampleapplication.model.User;

import java.util.ArrayList;

/**
 * Created by nitin on 8/10/14.
 */
public class CustomListAdapter extends ArrayAdapter{

   public static class CustomViewHolder
    {
      public  TextView textView2;
      public TextView textView3;

    }
    ArrayList<User> users=new ArrayList<User>();
    Context context;
    public CustomListAdapter(Context context, int res, ArrayList<User> users)
    {
        super(context, res, users);
        this.users= users;
        this.context= context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CustomViewHolder v;

        //Do not inflate a new view when you receive an inflated view.
        if(convertView==null) {

            LayoutInflater inflator= (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.list_item, parent, false);
            //Code from here is a very good optimization technique called holder pattern. For every row we
            //we remember or hold the reference to view components of the row. This thwarts us from the use of
            //findViewById so don't need to look up for the views inside our row/ layout.
            // we set this holder holding the refernce to views to the row or main view by using setTag();

            v= new CustomViewHolder();
            v.textView2=(TextView)convertView.findViewById(R.id.textView2);
            v.textView3=(TextView)convertView.findViewById(R.id.textView3);
            convertView.setTag(v);
        }
   //     TextView textView2=(TextView)convertView.findViewById(R.id.textView2);
   //     TextView textView3=(TextView)convertView.findViewById(R.id.textView3);
        v=(CustomViewHolder)convertView.getTag();
        TextView textView2=(TextView)v.textView2;
        TextView textView3=(TextView)v.textView3;

        User u=  this.users.get(position);
        textView2.setText(u.getName()+" ("+u.getId()+")");
        textView3.setText(u.getDepartment());
        return convertView;
    }
}


