package com.arora.divyanshu.customlistview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.ItemViewHolder> {

    private ArrayList<UserModel> gridModel = new ArrayList<UserModel>();
    Context context;


    public GridViewAdapter(Context context, ArrayList<UserModel> gridModels)
    {

        this.context=context;
        this.gridModel=gridModels;


    }


    @NonNull
    @Override
    public GridViewAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater =  LayoutInflater.from(viewGroup.getContext());

        View view = inflater.inflate(R.layout.grid_item,viewGroup,false);
        return new ItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull GridViewAdapter.ItemViewHolder itemViewHolder, int i) {

        UserModel userModel =gridModel.get(i);

            itemViewHolder.imgGrid.setImageResource(userModel.getImg());



    }


    @Override
    public int getItemCount() {
        return gridModel.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView imgGrid;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);


            imgGrid =itemView.findViewById(R.id.gridImg);


        }
    }
}
