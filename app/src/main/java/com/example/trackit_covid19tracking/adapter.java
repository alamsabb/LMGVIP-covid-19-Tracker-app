package com.example.trackit_covid19tracking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<myviewholder> implements Filterable {
    ArrayList<state_modal> data;
    ArrayList<state_modal> bakup;

    public adapter(ArrayList<state_modal> data) {
        this.data = data;
        bakup=new ArrayList<>(data);
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.statenam.setText(data.get(position).getName());
        holder.casses.setText(data.get(position).getCas());
        holder.recoverd.setText(data.get(position).getRec());
        holder.death.setText(data.get(position).getDea());
        holder.active.setText(data.get(position).getActive());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence keyword) {
            ArrayList<state_modal> filterdata=new ArrayList<>();

            if(keyword.toString().isEmpty()){
                filterdata.addAll(bakup);
            }else {
                for(state_modal modal:bakup){
                    if(modal.getName().toString().toLowerCase().contains(keyword.toString().toLowerCase())){
                        filterdata.add(modal);
                    }
                }
            }
            FilterResults results=new FilterResults();
            results.values=filterdata;
            return results;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            data.clear();
            data.addAll((ArrayList<state_modal>) results.values);
            notifyDataSetChanged();
        }
    };
}
