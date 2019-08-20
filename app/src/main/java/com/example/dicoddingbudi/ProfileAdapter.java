package com.example.dicoddingbudi;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ProfileModel> list;
    ActionListener actionListener;
    View view;

    public ProfileAdapter(List<ProfileModel> list, ActionListener actionListener) {
        this.list = list;
        this.actionListener = actionListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater =LayoutInflater.from(viewGroup.getContext());

        view =layoutInflater.inflate(R.layout.profile_content, viewGroup,false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        if(list.get(i)!=null){
            ((ProfileViewHolder)viewHolder).name.setText(list.get(i).getNama());
            ((ProfileViewHolder)viewHolder).nama_asli.setText(list.get(i).getNamaAsli());
            ((ProfileViewHolder)viewHolder).ttl.setText(list.get(i).getTtl());
            Glide.with(view).load(list.get(i).getImage()).into(((ProfileViewHolder)viewHolder).image);
        }

        ((ProfileViewHolder)viewHolder).cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionListener.onActionClick(list.get(i));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list!=null? list.size():0;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name;
        TextView nama_asli;
        TextView ttl;
        CardView cardView;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_profile);
            image = itemView.findViewById(R.id.image_profile);
            name = itemView.findViewById(R.id.name);
            nama_asli = itemView.findViewById(R.id.nama_asli);
            ttl = itemView.findViewById(R.id.ttl);

        }
    }

    public interface ActionListener{
        void onActionClick(ProfileModel model);
    }
}
