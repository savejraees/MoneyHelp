package com.saifi.tradeservice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.saifi.tradeservice.fragment.DailyProfitFragment;
import com.saifi.tradeservice.fragment.HomeFragment;
import com.saifi.tradeservice.fragment.MonthlyProfitFragment;
import com.saifi.tradeservice.fragment.ProfileFragment;
import com.saifi.tradeservice.helper.BottomNavigationBehavior;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // attaching bottom sheet behaviour - hide / show on scroll
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());

        // load the store fragment by default
        getSupportActionBar().setTitle("Home");
        loadFragment(new HomeFragment());

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home:
                    getSupportActionBar().setTitle("Home");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.daiProfit:
                    getSupportActionBar().setTitle("Daily Profit");
                    fragment = new DailyProfitFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.monthlyProfit:
                    getSupportActionBar().setTitle("Monthly Profit");
                    fragment = new MonthlyProfitFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.profile:
                    getSupportActionBar().setTitle("Profile");
                    fragment = new ProfileFragment();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };


    //Replace Dummy Fragment and Pass the Fragment title via Fragment
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}