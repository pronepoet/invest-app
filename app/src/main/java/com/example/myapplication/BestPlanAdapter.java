//package com.example.myapplication;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import androidx.core.content.ContextCompat;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.ArrayList;
//import com.example.myapplication.R;
//public class BestPlanAdapter extends RecyclerView.Adapter<BestPlanAdapter.ViewHolder> {
//    private Context context;
//    private ArrayList<String> plans;
//    public BestPlanAdapter(Context context, ArrayList<String> plans) {
//        this.context = context;
//        this.plans = plans;
//    }
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.best_plan_card, parent, false);
//        return new ViewHolder(view);
//    }
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        String plan = plans.get(position);
//        holder.tvPlan.setText(plan);
//    }
//    @Override
//    public int getItemCount() {
//        return plans.size();
//    }
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView tvPlan;
//        ConstraintLayout cardItem;
//        public ViewHolder(View itemView) {
//            super(itemView);
//            tvPlan = itemView.findViewById(R.id.planName);
//            cardItem = itemView.findViewById(R.id.constraintLayoutCard);
//        }
//    }
//}