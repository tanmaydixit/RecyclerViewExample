package com.example.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tanmay on 12/2/18.
 */

public class HitlistViewHolder extends RecyclerView.ViewHolder{

    TextView nametv; //global var
    TextView typetv;

    public HitlistViewHolder(View itemview){
        super(itemview);

        nametv=itemview.findViewById(R.id.name);
        typetv=itemview.findViewById(R.id.typeOfDeath);
    }
}
