package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImageUrls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intimagebitmap();







    }
    private  void intimagebitmap(){
        mImageUrls.add("https://images.unsplash.com/photo-1552751857-21e31f44fe73?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1044&q=80");
        mNames.add("canvas");
        mImageUrls.add("https://images.unsplash.com/photo-1552733407-5d5c46c3bb3b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=414&q=80");
        mNames.add("lkl");
       mImageUrls.add("https://images.unsplash.com/photo-1552896796-3f0a5a8f67e8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
       mNames.add("Kornplantz");
       mImageUrls.add("https://images.unsplash.com/photo-1552664769-aeb2e3f6a67f?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80");
       mNames.add("Furnitures");
       mImageUrls.add("https://images.unsplash.com/photo-1552585301-962c74e1d041?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80");
       mNames.add("Happiness");
       mImageUrls.add("https://images.unsplash.com/photo-1552659805-2f95bb168c19?ixlib=rb-1.2.1&auto=format&fit=crop&w=1046&q=80");
       mNames.add("Turkey");
       mImageUrls.add("https://images.unsplash.com/photo-1552687276-563fbd77264e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80");
       mNames.add("Door to Happiness");
       mImageUrls.add("https://images.unsplash.com/photo-1552664862-db5607e91378?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80");
       mNames.add("Social life");
       initrecyclerview();


    }



    public  void initrecyclerview(){
        RecyclerView rec=findViewById(R.id.recyclerview);
        RecyclerviewAdapter adapter=new RecyclerviewAdapter(this,mNames,mImageUrls);
        rec.setAdapter(adapter);
        rec.setLayoutManager(new LinearLayoutManager(this));
    }
}
