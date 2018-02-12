package com.example.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tanmay on 12/2/18.
 */

public class HitlistAdapter extends RecyclerView.Adapter<HitlistViewHolder> {
    //global variable for data
    private HitlistModel[] hitModel;

    public HitlistAdapter(HitlistModel[] hitlistModels){
        //init global variable from local var passed in arg of constr
        hitModel=hitlistModels;
        Log.e("constructor", "inside constructor with data size " + hitlistModels.length);
    }

    @Override
    public HitlistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //convert xml to java file
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_hitlist, parent, false);
        HitlistViewHolder hitlistViewHolder=new HitlistViewHolder(view);
        Log.e("oncreateviewholder", "on createv view holder, no position");
        return hitlistViewHolder;
    }

    @Override
    public void onBindViewHolder(HitlistViewHolder holder, int position) {
        //bind data whenever android requires to update a specific position
        holder.nametv.setText(hitModel[position].getName());
        holder.typetv.setText(hitModel[position].getTypeOfDeath());
        Log.e("onbindviewholder","on bind view holder called for position " + position);
    }

    @Override
    public int getItemCount() {
        //return data size
        Log.e("item size", "item count is " + hitModel.length);
        return hitModel.length;
    }


}
