package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
        ArrayList<GoldModel> goldModels = new ArrayList<>();
        int goldImage = (R.drawable.image_4_removebg_preview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        setUpGoldModels();

        Gold_RecyclerViewAdapter adapter = new Gold_RecyclerViewAdapter(this, getPlans());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
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
}