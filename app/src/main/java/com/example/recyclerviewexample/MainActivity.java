package com.example.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int itemSize = 30;
        HitlistModel[] arr = new HitlistModel[itemSize];
        //itemsize is equal to arr.length

        for(int i=0;i<itemSize;i++) {
            //initialise each item in arr with dummy data
            arr[i] = new HitlistModel("name"+i, "death"+i);
        }

        rv=(RecyclerView)findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        //optimisation to speed up rv
        rv.setHasFixedSize(true);

        //create adapter by passing valid data to its constructor
        //should be of type HitListModel[] arr
        HitlistAdapter adapter = new HitlistAdapter(arr);
        rv.setAdapter(adapter);

    }
}
