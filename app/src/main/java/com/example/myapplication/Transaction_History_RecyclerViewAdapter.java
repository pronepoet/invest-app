package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class Transaction_History_RecyclerViewAdapter extends RecyclerView.Adapter<Transaction_History_RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private String[] text1;
    private String[] text2;
    private String[] text3;
    private String[] text4;
    private String[] text5;
    private String[] text6;
    private int[] images;



    public Transaction_History_RecyclerViewAdapter(Context context, String[] text1, String[] text2, String[] text3, String[] text4, String[] text5, String[] text6) {
        this.context = context;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.text6 = text6;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtBuyPrice.setText(text1[position]);
        holder.txtBuyStock.setText(text2[position]);
        holder.txtBuyDate.setText(text3[position]);
        holder.txtSellPrice.setText(text4[position]);
        holder.txtSellStock.setText(text5[position]);
        holder.txtSellDate.setText(text6[position]);

    }

    @Override
    public int getItemCount() {
        return text1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtBuyPrice, txtBuyStock, txtBuyDate, txtSellPrice, txtSellStock,txtSellDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSellDate = itemView.findViewById(R.id.textView24);
            txtBuyPrice = itemView.findViewById(R.id.textView18);
            txtBuyStock = itemView.findViewById(R.id.textView20);
            txtBuyDate = itemView.findViewById(R.id.textView21);
            txtSellStock = itemView.findViewById(R.id.textView20);
            txtSellPrice = itemView.findViewById(R.id.textView25);
        }
    }
}
