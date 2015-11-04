package com.example.prashantkumar.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prashantkumar on 03/11/15.
 */
public class HomeFragment extends Fragment
{
    ListView cardView;
    ListView listViewCategory;
    Context startActivity;
    ArrayList<String> listCategory=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragView=inflater.inflate(R.layout.homefragment, container, false);
        cardView=(ListView)fragView.findViewById(R.id.cardView);
        listViewCategory=(ListView)fragView.findViewById(R.id.listView);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    class UserListAdapter extends BaseAdapter
    {
        Context context;
        int layoutId;
        ArrayList<Driver_Pickup_Points> listPickup_Points;
        public UserListAdapter(Context context, int layoutId,
                               ArrayList<Driver_Pickup_Points> listPickup_Points)
        {
            super();
            this.context = context;
            this.layoutId = layoutId;
            this.listPickup_Points = listPickup_Points;
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return listPickup_Points.size();
        }

        @Override
        public Driver_Pickup_Points getItem(int position) {
            // TODO Auto-generated method stub
            return listPickup_Points.get(position);
        }


        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            final Driver_Pickup_Points user=listPickup_Points.get(position);
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView=inflater.inflate(layoutId, null);
            TextView textViewName=(TextView) itemView.findViewById(R.id.textView1);


            return itemView;
        }
    }

}
