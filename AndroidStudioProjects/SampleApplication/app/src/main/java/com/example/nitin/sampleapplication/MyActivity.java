package com.example.nitin.sampleapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nitin.sampleapplication.adapters.CustomListAdapter;
import com.example.nitin.sampleapplication.model.User;

import java.util.ArrayList;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ListView listView= (ListView)this.findViewById(R.id.listview);
        ArrayList<User> users= com.example.nitin.sampleapplication.utility.Functions.getSampleUsers(100);
        Log.i("SampleApplication", users.toString());
        listView.setAdapter(new CustomListAdapter(this,R.layout.list_item, users));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CustomListAdapter.CustomViewHolder v= (CustomListAdapter.CustomViewHolder)view.getTag();
                Toast.makeText(getApplicationContext(),v.textView2.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
