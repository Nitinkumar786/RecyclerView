package com.example.recyclevieew_contect_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<RecycleHolder> arrayList;

    public Adapter(Context context, ArrayList<RecycleHolder>arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view =  LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);
        return(new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).img);
        holder.textView.setText(arrayList.get(position).name);
        holder.textVieww.setText(arrayList.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        TextView textVieww;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            textView=itemView.findViewById(R.id.name);
            textVieww=itemView.findViewById(R.id.number);

        }
    }
}
