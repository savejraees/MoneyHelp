package com.saifi.tradeservice.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
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
         holder.txtBUYSEll.setText(list.get(position));
         if(list.get(position).equals("BUY")){
             holder.txtSignal.setBackgroundColor(Color.parseColor("#0CC513"));
             holder.txtCmp.setBackgroundColor(Color.parseColor("#0CC513"));
             holder.line.setBackgroundColor(Color.parseColor("#0CC513"));
             holder.txtStopLoss.setBackgroundColor(Color.parseColor("#BC1F14"));
             holder.txtTarget.setBackgroundColor(Color.parseColor("#BC1F14"));
         }else {
             holder.txtSignal.setBackgroundColor(Color.parseColor("#BC1F14"));
             holder.txtCmp.setBackgroundColor(Color.parseColor("#BC1F14"));
             holder.line.setBackgroundColor(Color.parseColor("#BC1F14"));
             holder.txtStopLoss.setBackgroundColor(Color.parseColor("#0CC513"));
             holder.txtTarget.setBackgroundColor(Color.parseColor("#0CC513"));
         }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class HomeHolder extends RecyclerView.ViewHolder{

        TextView txtBUYSEll,txtSignal,txtCmp,txtStopLoss,txtTarget,txtInstruct,txtResult;
        View line;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            txtBUYSEll = itemView.findViewById(R.id.txtBUYSEll);
            txtSignal = itemView.findViewById(R.id.txtSignal);
            txtCmp = itemView.findViewById(R.id.txtCmp);
            txtStopLoss = itemView.findViewById(R.id.txtStopLoss);
            txtTarget = itemView.findViewById(R.id.txtTarget);
            txtInstruct = itemView.findViewById(R.id.txtInstruct);
            txtResult = itemView.findViewById(R.id.txtResult);
            line = itemView.findViewById(R.id.line);
        }
    }
}
