package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<InvestmentModel>investmentArrayList;
    private String[] investmentHeading;
    private String[] investmentDescription;
    private int [] imageResourceID;
    private RecyclerView recyclerView;
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();
        recyclerView = view.findViewById(R.id.recycler_view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        Investment_Guide_RecyclerViewAdapter myAdapter  = new Investment_Guide_RecyclerViewAdapter(getContext(), investmentArrayList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

    private void dataInitialize() {

   investmentArrayList = new ArrayList<>();
    investmentHeading = new String[]{
            getString(R.string.investT_1),
            getString(R.string.investT_2),
            getString(R.string.investT_3),
            getString(R.string.investT_4),
            getString(R.string.investT_5),

    };
    investmentDescription = new String[]{
            getString(R.string.investD_1),
            getString(R.string.investD_2),
            getString(R.string.investD_3),
            getString(R.string.investD_4),
            getString(R.string.investD_5),

    };
    imageResourceID = new int[]{
            R.drawable.ellipse_740,
            R.drawable.ellipse_740_1_,
            R.drawable.ellipse_740,
            R.drawable.ellipse_740_1_,
            R.drawable.ellipse_740,

    };
    for (int i = 0; i < investmentHeading.length; i++){
        InvestmentModel investmentModel = new InvestmentModel(investmentHeading[i],investmentDescription[i], imageResourceID[i]);
        investmentArrayList.add(investmentModel);
    }
    }
}