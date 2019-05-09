package com.example.a533.pratiqueexam2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewItem extends RecyclerView.Adapter <RecyclerViewItem.MyViewHolder> {
    List<jobOfferModel> jobs;
    Context context;
    MainActivity.deleteItemInterface onDelete;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;
        public TextView txtDescription;
        public TextView txtSalary;
        public Button btnRemove;

        public MyViewHolder(View v) {
            super(v);
            txtTitle = (TextView) v.findViewById(R.id.txtTitle);
            txtDescription = (TextView) v.findViewById(R.id.txtDescription);
            txtSalary = (TextView) v.findViewById(R.id.txtSalaire);
            btnRemove = (Button) v.findViewById(R.id.btnDelete);
        }

    }
    public RecyclerViewItem(List<jobOfferModel> jobs, MainActivity.deleteItemInterface onDelete) {
        this.jobs = jobs;
        this.onDelete = onDelete;
    }
    @NonNull
    @Override
    public RecyclerViewItem.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_view_item, parent, false);
        context = parent.getContext();
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewItem.MyViewHolder holder, int position) {
        holder.txtTitle.setText(jobs.get(position).getTitrePoste());
        holder.txtDescription.setText(jobs.get(position).getDescription());
        holder.txtSalary.setText(String.valueOf(jobs.get(position).getSalaire()) + "$");
        holder.btnRemove.setText("Retirer");
        holder.btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDelete.deleteItem(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }
}
