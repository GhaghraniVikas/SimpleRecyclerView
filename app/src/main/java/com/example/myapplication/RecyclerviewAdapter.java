package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>{
    //make arraylist of required components here arraylist of images and its names

     private ArrayList<String> mimageNames=new ArrayList<>();
     private  ArrayList<String> mimages=new ArrayList<>();

     //define context

     private Context context;

     //Constructor of this class
    public RecyclerviewAdapter(Context context,ArrayList<String> mimageNames, ArrayList<String> mimages) {
        this.mimageNames = mimageNames;
        this.mimages = mimages;
        this.context = context;
    }
//implement all the methods of interface RecyclerView.Adapter
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //here your listitem_wor xml will be inflated using layoutinflater

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_row,viewGroup,false);
        //mAKE OBJECT OF VIEWHOLDER CLASS

        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //Binding the data or we can say feed the data into the list_row xml
             //getthing all the images
        Glide.with(context)
                .asBitmap()
                .load(mimages.get(i))
                .into(viewHolder.image);
        //inserting images names.
        viewHolder.imagename.setText(mimageNames.get(i));


    }

    @Override
    public int getItemCount() {
        return mimages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView imagename;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.img);
            imagename=itemView.findViewById(R.id.imgname);


        }
    }
}
