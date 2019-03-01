package com.arora.divyanshu.customlistview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<UserModel>
{

    int layoutId;
    ArrayList<UserModel> dataModel;

    public CustomAdapter(@NonNull Context context, int resource,  ArrayList<UserModel>objects) {
        super(context, resource, objects);

        layoutId =resource;
        dataModel=objects;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        UserModel userModel = getItem(position);
        ViewHolder viewHolder;


        if (convertView == null)
        {

            viewHolder = new ViewHolder();
            LayoutInflater inflater= LayoutInflater.from(getContext());
            convertView = inflater.inflate(layoutId,parent,false);
            viewHolder.name=(TextView)convertView.findViewById(R.id.abcd);
            viewHolder.email=(TextView)convertView.findViewById(R.id.abcde);
            viewHolder.img=(ImageView)convertView.findViewById(R.id.img);



        } else
        {

            viewHolder =(ViewHolder) convertView.getTag();

        }

        viewHolder.name.setText(userModel.getName());
        viewHolder.email.setText(userModel.getEmail());
        viewHolder.img.setImageResource(userModel.getImg());

        return convertView;
    }



    private static class ViewHolder
    {
        TextView name,email;
        ImageView img;
    }



}
