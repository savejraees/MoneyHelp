package com.saifi.tradeservice.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saifi.tradeservice.R;
import com.saifi.tradeservice.adapter.HomeAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

 View view;
 RecyclerView rvItem;
 ArrayList<String> list = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);
        rvItem = view.findViewById(R.id.rvItem);

        for(int i=0;i<10;i++){
            if(i%2==0){
                list.add("BUY");
            }else {
                list.add("SELL");
            }

        }

        rvItem.setAdapter(new HomeAdapter(getActivity(),list));
     return view;
    }
}