package com.saifi.tradeservice.adapter;

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

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.HomeHolder> {

    Context context;
    ArrayList<String> list;

    public DailyAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public DailyAdapter.HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_daily_profit,parent,false);
        return new DailyAdapter.HomeHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull DailyAdapter.HomeHolder holder, int position) {
        holder.txtNameDailyProduct.setText(list.get(position));
        if(position%2==0){
            holder.txtPriceDailyProd.setBackgroundColor(Color.parseColor("#0CC513"));
            holder.txtPriceDailyProd.setText("20135486");
        }else {
            holder.txtPriceDailyProd.setBackgroundColor(Color.parseColor("#BC1F14"));
            holder.txtPriceDailyProd.setText("-135486");
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class HomeHolder extends RecyclerView.ViewHolder{

        TextView txtNameDailyProduct,txtPriceDailyProd;
        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            txtNameDailyProduct = itemView.findViewById(R.id.txtNameDailyProduct);
            txtPriceDailyProd = itemView.findViewById(R.id.txtPriceDailyProd);
        }
    }
}

