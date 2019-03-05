package com.arora.divyanshu.customlistview;


import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder> {
    Context context;
    private   List<UserModel> userModels;

    public RecyclerViewAdapter(Context context,ArrayList<UserModel> user_models)
    {
        this.context = context;
        this.userModels = user_models;
    }



    @NonNull
    @Override
    public RecyclerViewAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());




            View view = inflater.inflate(R.layout.linear_item,viewGroup,false);
            return new ItemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ItemViewHolder itemViewHolder, int i) {
        UserModel userModel = userModels.get(i);
        itemViewHolder.img.setImageResource(userModel.getImageChat());
        itemViewHolder.days.setText(userModel.getDays());
        itemViewHolder.travel.setText(userModel.getTravel());
        itemViewHolder.views.setText(userModel.getViews());


//        itemViewHolder.gridImg.setImageResource(userModel.getImg());
    }

    @Override
    public int getItemCount() {
        return userModels.size() ;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        TextView days,travel,views;

        int flag;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);


            img=itemView.findViewById(R.id.imgLinear);
            days=itemView.findViewById(R.id.days);
            travel=itemView.findViewById(R.id.Travel);
            views=itemView.findViewById(R.id.views);

//            gridImg=itemView.findViewById(R.id.gridImg);



        }
    }
}
