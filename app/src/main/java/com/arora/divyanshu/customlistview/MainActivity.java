package com.arora.divyanshu.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;

//    List<String>name = new ArrayList<String>();
//    List<String>email = new ArrayList<String>();

    Button recycle;

    List<UserModel>user = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle=findViewById(R.id.recycle);
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recy = new Intent(getApplicationContext(),RecycleActivity.class);
                startActivity(recy);
            }
        });


        lv = (ListView) findViewById(R.id.listView);

//        name.add("divyanshu");
//        name.add("aish");
//        name.add("pri");
//
//        email.add("d@gmail.com");
//        email.add("aish@gmail.com");
//        email.add("pri@gmail.com");



//        for (int i=0;i<name.size();i++) {

            List<UserModel>item  = new ArrayList<>();

            item.add(new UserModel("divu","div@gmail.com",R.drawable.ic_launcher_background));
        item.add(new UserModel("aish","aish@gmail.com",R.drawable.ic_launcher_background));
        item.add(new UserModel("pri","pri@gmail.com",R.drawable.ic_launcher_background));






//        }

        CustomAdapter listAdapter = new CustomAdapter(this, R.layout.item, (ArrayList<UserModel>) item);
        lv.setAdapter(listAdapter);



    }
}
