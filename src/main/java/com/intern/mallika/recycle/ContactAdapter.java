package com.intern.mallika.recycle;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mallika on 1/23/2018.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    ArrayList<Contact> adapter_list=new ArrayList<>();
    MainActivity mainActivity;
    Context ctx;

    public ContactAdapter (ArrayList<Contact> adapter_list,Context ctx) {
        this.adapter_list=adapter_list;
        this.ctx=ctx;
        mainActivity=(MainActivity)ctx;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view,mainActivity);
        return contactViewHolder;
    }



    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.name.setText(adapter_list.get(position).getName());
        holder.god.setText(adapter_list.get(position).getGod());
        holder.img.setImageResource(adapter_list.get(position).getImage());
        if(!mainActivity.is_in_action_mode)
        {
            holder.checkBox.setVisibility(View.GONE);
        }
        else
        {
            holder.checkBox.setVisibility(View.VISIBLE);
            holder.checkBox.setChecked(false);
        }

    }

    @Override
    public int getItemCount() {
        return adapter_list.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView img;
        TextView name,god;
        CheckBox checkBox;
        MainActivity mainActivity;
        CardView cardView;
        Button b;

        public ContactViewHolder(View itemView,MainActivity mainActivity) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.img_id);
            name=(TextView)itemView.findViewById(R.id.name);
            god=(TextView)itemView.findViewById(R.id.god);
            checkBox=(CheckBox)itemView.findViewById(R.id.check_list_item);
            this.mainActivity=mainActivity;
            cardView=(CardView)itemView.findViewById(R.id.cardView);
            cardView.setOnLongClickListener(mainActivity);
            checkBox.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mainActivity.prepareSelection(v,getAdapterPosition());
        }
    }
}
