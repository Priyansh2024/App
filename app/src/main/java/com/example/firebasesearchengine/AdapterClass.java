package com.example.firebasesearchengine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
    ArrayList<Deal> list;
    Context mcontext;
    public AdapterClass(Context context){
        mcontext = context;
    }


    public AdapterClass(ArrayList<Deal> list){
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.id.setText(list.get(i).getId());
        myViewHolder.desc.setText(list.get(i).getName());
        myViewHolder.runs.setText(list.get(i).getRuns());
        myViewHolder.cent.setText(list.get(i).getCenturies());
        if(mcontext != null){
        Glide.with(mcontext).load(list.get(i).getImageurl()).into(myViewHolder.imageurl);
    }   }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id,desc,runs,cent;
        ImageView imageurl;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.name);
            desc = itemView.findViewById(R.id.description);
            runs = itemView.findViewById(R.id.runs);
            cent = itemView.findViewById(R.id.centuries);
            imageurl = itemView.findViewById(R.id.photo);
        }
    }
}
