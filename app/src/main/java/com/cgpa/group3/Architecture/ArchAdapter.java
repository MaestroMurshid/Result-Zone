package com.cgpa.group3.Architecture;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cgpa.group3.R;
import com.cgpa.group3.ViewActivity;
import com.cgpa.group3.model;

import java.util.ArrayList;

public class ArchAdapter extends RecyclerView.Adapter<ArchAdapter.MyViewHolder> {

    ArrayList<model> mList;
    private Context context;


    public ArchAdapter(Context context, ArrayList<model> mList){

        this.mList = mList;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        model Model = mList.get(position);
        holder.reg_no.setText(Model.getReg_no());
        holder.name.setText(Model.getName());
        holder.dob.setText(Model.getDob());
        final model temp = mList.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ArchViewActivity.class);
                intent.putExtra("reg_no", temp.getReg_no());
                intent.putExtra("name", "" + temp.getName());
                intent.putExtra("dob", "" + temp.getDob());
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView reg_no, name, dob;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            reg_no = itemView.findViewById(R.id.reg_text);
            name = itemView.findViewById(R.id.name_text);
            dob = itemView.findViewById(R.id.dob_text);


        }

    }
}
