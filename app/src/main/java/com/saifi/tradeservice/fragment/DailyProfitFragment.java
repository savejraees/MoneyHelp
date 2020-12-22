package com.saifi.tradeservice.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saifi.tradeservice.R;
import com.saifi.tradeservice.adapter.DailyAdapter;

import java.util.ArrayList;

public class DailyProfitFragment extends Fragment {

    View view;
    RecyclerView rvDailyProfit;
    ArrayList<String> list = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(view==null){
            view = inflater.inflate(R.layout.fragment_daily_profit, container, false);
            rvDailyProfit = view.findViewById(R.id.rvDailyProfit);
            list.add("Silver");
            list.add("Gold");
            list.add("Zinc");
            list.add("Lead");
            list.add("Aluminium");
            list.add("Natural Gas");
            list.add("Copper");
            list.add("Nickel");

            rvDailyProfit.setAdapter(new DailyAdapter(getActivity(),list));
        }


     return view;
    }
}