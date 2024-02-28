package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity extends AppCompatActivity {

        int goldImage = (R.drawable.image_4_removebg_preview);
//    private RecyclerView recyclerView1;
//    private RecyclerView recyclerView;
    private Investment_Guide_RecyclerViewAdapter adapter1;
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;
    private Gold_RecyclerViewAdapter adapter;
//    HomeActivityBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_home);
//        setContentView(binding.getRoot());



        bottomNavigationView = findViewById(R.id.bottom_navigation_menu);
        frameLayout = findViewById(R.id.fragment_container);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();
                if (itemId == R.id.menu_item_1){
                loadFragment(new HomeFragment(), false);

                } else if (itemId == R.id.menu_item_2) {
                loadFragment(new SearchFragment(), false);
                } else if (itemId == R.id.menu_item_3) {
                loadFragment(new InvestFragment(), false);
                } else  {
                loadFragment(new AccountFragment(), false);
                }

                return true;
            }


        });
        loadFragment(new HomeFragment(), true);

//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        RecyclerView recyclerView1 = findViewById(R.id.recycler_view2);
//        setUpGoldModels();

//        Gold_RecyclerViewAdapter adapter = new Gold_RecyclerViewAdapter(this, getPlans());

//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
//
//      String [] textsType = {"Gold","Silver", "Platinum", "Gold", "Silver"};
//      String [] textsReturn = {"30% return", "60% return", "90% return", "30% return", "90% return"};
//      int [] images1 = {R.drawable.image_4_removebg_preview, R.drawable.silver_coin_removebg_preview, R.drawable.silver_coin_removebg_preview, R.drawable.image_4_removebg_preview, R.drawable.silver_coin_removebg_preview };
//        adapter = new Gold_RecyclerViewAdapter(this, textsType,textsReturn, images1);
////        Investment_Guide_RecyclerViewAdapter adapter1 = new Investment_Guide_RecyclerViewAdapter(this, getInvestments());
//        recyclerView.setAdapter(adapter);
//
//
//        //the bottom recyclerview
//        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
//
//        String[] texts = {"Basic type of investments", "How much can you start wit..", "Basic type of Investments", "How much can you start wit..", "Basic type of investments"};
//        String[] texts2 = {"This is how you set your foot for 2020 Stock market recession. What’s next...", "What do you like to see? It’s a very different market from 2018. The way...", "This is how you set your foot for 2020 Stock market recession. What’s next...", "What do you like to see? It’s a very different market from 2018. The way...", "This is how you set your foot for 2020 Stock market recession. What’s next..."};
//        int[] images = {R.drawable.ellipse_740, R.drawable.ellipse_740_1_, R.drawable.ellipse_740,R.drawable.ellipse_740_1_, R.drawable.ellipse_740};
//
//        adapter1 = new Investment_Guide_RecyclerViewAdapter(this, texts,texts2, images);
//        recyclerView1.setAdapter(adapter1);

    }


    private void loadFragment(Fragment fragment, boolean isAppInitialized){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction  fragmentTransaction = fragmentManager.beginTransaction();
        if (isAppInitialized){
            fragmentTransaction.add(R.id.fragment_container, fragment);
        }
        else {
            fragmentTransaction.replace(R.id.fragment_container, fragment);
        }

        fragmentTransaction.commit();
    }


//    private void setUpGoldModels(){
//        String[] goldNames = getResources().getStringArray(R.array.plan_name);
//        String[] goldReturn = getResources().getStringArray(R.array.return_name);
//        for (int i = 0; i < goldNames.length; i++){
//            goldModels.add(new GoldModel(goldNames[i],
//                    goldReturn[i], goldImage));
//        }
//    }

    private ArrayList<String> getPlans() {
        ArrayList<String> plans = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            plans.add("Gold " + i);
        }
        return plans;
    }
//    private  ArrayList<String> getInvestments() {
////
//        ArrayList<String> investments = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            investments.add("Basic type of investments " + i);
//        }
//        return investments;
//    }
}


