package com.saifi.tradeservice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saifi.tradeservice.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    Context context;
    ArrayList<String> list;

    public HomeAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home,parent,false);
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
         holder.txtSignal.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class HomeHolder extends RecyclerView.ViewHolder{

        TextView txtSignal;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            txtSignal = itemView.findViewById(R.id.txtSignal);
        }
    }
}
