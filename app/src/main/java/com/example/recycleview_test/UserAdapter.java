package com.example.recycleview_test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private ArrayList<User> list;

    public UserAdapter(ArrayList list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserViewHolder holder, int position) {
        User user= list.get(position);
        holder.tvName.setText(user.getName());
        holder.tvAddress.setText(user.getAddress());
        holder.tvPhone.setText(user.getPhone());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvAddress,tvPhone;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tv_ten);
            tvAddress=itemView.findViewById(R.id.tv_DiaChi);
            tvPhone=itemView.findViewById(R.id.tv_SDT);
        }
    }
}
