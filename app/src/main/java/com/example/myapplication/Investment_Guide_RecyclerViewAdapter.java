package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//public class Investment_Guide_RecyclerViewAdapter extends RecyclerView.Adapter<Investment_Guide_RecyclerViewAdapter.MyViewHolder> {
//    private Context context;
//    private ArrayList<String> investments;
//    public Investment_Guide_RecyclerViewAdapter(Context context, ArrayList<String> investments) {
//        this.context = context;
//        this.investments = investments;
//    }
//
//
//    @NonNull
//    @Override
//    public Investment_Guide_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        //inflating our layout giving look to each of our rows
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View view = inflater.inflate(R.layout.investment_guide,parent,false);
//        return new Investment_Guide_RecyclerViewAdapter.MyViewHolder(view);
//    }
//
//
//
//    @Override
//    public void onBindViewHolder(@NonNull Investment_Guide_RecyclerViewAdapter.MyViewHolder holder, int position) {
//        //assigning values to the views we created in the recyclerview row layout file
//        //based on the position of the recycler view
//    holder.txtInvestmentsTitle.setText(investments.get(position));
////  holder.txtInvestmentsDescription.setText(investments.get(position));
////     holder.investmentsImageView.setImageResource(Integer.parseInt(investments.get(position)));
//    }
//
//    @Override
//    public int getItemCount() {
//        // recycler view wants to know the number of items you want to display
//        return investments.size();
//    }
//
//    class MyViewHolder extends RecyclerView.ViewHolder{
//        //grabbing the view from our recycler view row layout file
//        //kinda looks like in the onCreate method
//       ImageView investmentsImageView;
//        TextView txtInvestmentsTitle,txtInvestmentsDescription;
//
//        public MyViewHolder(@NonNull View view) {
//            super(view);
////         investmentsImageView = view.findViewById(R.id.imageView3);
//            txtInvestmentsTitle = view.findViewById(R.id.textView14);
////       txtInvestmentsDescription = view.findViewById(R.id.textView15);
//        }
//    }
//}

public class Investment_Guide_RecyclerViewAdapter extends RecyclerView.Adapter<Investment_Guide_RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private String[] texts;
    private String[] texts2;
    private int[] images;

    public Investment_Guide_RecyclerViewAdapter(Context context, String[] texts, String[] texts2, int[] images) {
        this.context = context;
        this.texts = texts;
        this.texts2 = texts2;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.investment_guide, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtInvestment_description.setText(texts2[position]);
        holder.txInvestmentTitle.setText(texts[position]);

        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return texts.length;
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
