package com.example.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyTasks> myTasks;
    public TaskAdapter(Context c,ArrayList<MyTasks> p){
        context = c;
        myTasks = p;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.content_scrolling,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titTask.setText(myTasks.get(position).getTitTask());
        holder.descTask.setText(myTasks.get(position).getDescTask());
    }

    @Override
    public int getItemCount() {
        return myTasks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titTask,descTask;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            titTask = (TextView) itemView.findViewById(R.id.titTask);
            descTask = (TextView) itemView.findViewById(R.id.descTask);
        }
    }
}
