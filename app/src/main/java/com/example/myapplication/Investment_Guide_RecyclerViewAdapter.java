package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Investment_Guide_RecyclerViewAdapter extends RecyclerView.Adapter<Investment_Guide_RecyclerViewAdapter.MyViewHolder> {
    private Context context;
//    private String[] texts;
//    private String[] texts2;


    ArrayList<InvestmentModel> investmentArrayList;



    public Investment_Guide_RecyclerViewAdapter(Context context, ArrayList<InvestmentModel>investmentArrayList) {
        this.context = context;
//        this.texts = texts;
//        this.texts2 = texts2;
        this.investmentArrayList = investmentArrayList;


    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.investment_guide, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        InvestmentModel investmentmodel = investmentArrayList.get(position);
        holder.txtInvestment_description.setText(InvestmentModel.investmentDescription);
        holder.txInvestmentTitle.setText(InvestmentModel.investmentTitle);
        holder.imageView.setImageResource(InvestmentModel.image);
    }

    @Override
    public int getItemCount() {
        return investmentArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txInvestmentTitle, txtInvestment_description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            txInvestmentTitle = itemView.findViewById(R.id.textView14);
            txtInvestment_description = itemView.findViewById(R.id.textView15);
        }
    }
}
