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

//public class Gold_RecyclerViewAdapter extends RecyclerView.Adapter<Gold_RecyclerViewAdapter.MyViewHolder> {
//    private Context context;
//    private ArrayList<String> plans;
//    public Gold_RecyclerViewAdapter(Context context, ArrayList<String> plans) {
//        this.context = context;
//        this.plans = plans;
//    }
//
//
//    @NonNull
//    @Override
//    public Gold_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        //inflating our layout giving look to each of our rows
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View view = inflater.inflate(R.layout.best_plan_card,parent,false);
//        return new Gold_RecyclerViewAdapter.MyViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Gold_RecyclerViewAdapter.MyViewHolder holder, int position) {
//        //assigning values to the views we created in the recyclerview row layout file
//        //based on the position of the recycler view
//        holder.txtPlan.setText(plans.get(position));
////        holder.txtReturn.setText(plans.get(position).getReturnName());
////        holder.planimageView.setImageResource(plans.get(position).getImage());
//    }
//
//    @Override
//    public int getItemCount() {
//       // recycler view wants to know the number of items you want to display
//        return plans.size();
//    }
//
//    class MyViewHolder extends RecyclerView.ViewHolder{
//        //grabbing the view from our recycler view row layout file
//        //kinda looks like in the onCreate method
//        ImageView planimageView;
//        TextView txtPlan, txtReturn;
//
//        public MyViewHolder(@NonNull View view) {
//            super(view);
////            planimageView = view.findViewById(R.id.imageView9);
//            txtPlan = view.findViewById(R.id.textView10);
////            txtReturn = view.findViewById(R.id.textView18);
//        }
//    }
//}


public class Gold_RecyclerViewAdapter extends RecyclerView.Adapter<Gold_RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private String[] textsType;
    private String[] textsReturn;
    private int[] images1;

    public Gold_RecyclerViewAdapter(Context context, String[] textsType, String[] textsReturn, int[] images1) {
        this.context = context;
        this.textsReturn = textsReturn;
        this.textsType = textsType;
        this.images1 = images1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_plan_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textsPercentage.setText(textsType[position]);
        holder.textsReturnType.setText(textsReturn[position]);

        holder.imageView.setImageResource(images1[position]);
    }

    @Override
    public int getItemCount() {
        return textsReturn.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textsPercentage, textsReturnType;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView9);
            textsPercentage = itemView.findViewById(R.id.textView10);
            textsReturnType = itemView.findViewById(R.id.textView18);
        }
    }
}
