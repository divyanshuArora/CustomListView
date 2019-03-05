package com.arora.divyanshu.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecycleActivity extends AppCompatActivity {


    Button grid,linear;

    RecyclerView Linear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        Linear =findViewById(R.id.recycleList);

        grid=findViewById(R.id.grid);

        linear=findViewById(R.id.linear);





        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grids();
            }
        });




        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         linears();
            }
        });



    }


    public void linears()
    {
        Linear.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        ArrayList<UserModel> linearModel = new ArrayList<>();


          linearModel.add(new UserModel("30","500","xcvbnm",R.drawable.nature_icon));
            linearModel.add(new UserModel("30","500","xcvbnm",R.drawable.paytm));
            linearModel.add(new UserModel("30","500","xcvbnm",R.drawable.nature_blur));


        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,linearModel);
        Linear.setAdapter(recyclerViewAdapter);



    }




    public void grids()
    {

        Linear.setLayoutManager(new GridLayoutManager(this, 3));

        ArrayList<UserModel> userList = new ArrayList<>();

            userList.add(new UserModel(R.drawable.nature_blur));
            userList.add(new UserModel(R.drawable.nature_icon));
            userList.add(new UserModel(R.drawable.paytm));
        userList.add(new UserModel(R.drawable.nature_blur));
        userList.add(new UserModel(R.drawable.nature_icon));
        userList.add(new UserModel(R.drawable.paytm));

        userList.add(new UserModel(R.drawable.nature_blur));
        userList.add(new UserModel(R.drawable.nature_icon));
        userList.add(new UserModel(R.drawable.paytm));

        userList.add(new UserModel(R.drawable.nature_blur));
        userList.add(new UserModel(R.drawable.nature_icon));
        userList.add(new UserModel(R.drawable.paytm));



        GridViewAdapter gridViewAdapter = new GridViewAdapter(this,userList);
        Linear.setAdapter(gridViewAdapter);


    }





}
