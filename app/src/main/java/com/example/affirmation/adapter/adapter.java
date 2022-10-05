package com.example.affirmation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.affirmation.MainActivity;
import com.example.affirmation.R;
import com.example.affirmation.model.Affirmation;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
    Affirmation[] affirmation;
    Context context;

    public adapter(Affirmation[] affirmation, MainActivity activity){
        this.affirmation = affirmation;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Affirmation affirmationList = affirmation[position];
        holder.teks.setText(affirmationList.getTeks());
        holder.gambar.setImageResource(affirmationList.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, affirmationList.getTeks(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return affirmation.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambar;
        TextView teks;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.item_image);
            teks = itemView.findViewById(R.id.item_title);
        }
    }




}
