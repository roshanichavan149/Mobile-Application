package com.example.essentialguides;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Holder extends RecyclerView.ViewHolder {

    View view;


    public Holder(@NonNull View itemView) {
        super(itemView);

        view = itemView;

    }

    public void setView(Context context , String shopName , String shopContact , String shopAddress , String shopImage )
    {
        TextView name = view.findViewById(R.id.name);
        TextView contact = view.findViewById(R.id.contact);
        TextView address = view.findViewById(R.id.address);
        ImageView image = view.findViewById(R.id.image);

        name.setText(shopName);
        address.setText(shopAddress);
        contact.setText(shopContact);
        Picasso.get().load(shopImage).into(image);

    }
}
