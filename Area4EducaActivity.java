package com.example.essentialguides;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Area4EducaActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference ref;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_all);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        database = FirebaseDatabase.getInstance();
        ref = database.getReference().child("Shivajinagar").child("Education");
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<User , Holder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<User, Holder>(
                User.class,
                R.layout.data,
                Holder.class,
                ref
        ) {
            @Override
            protected void populateViewHolder(Holder holder, User user, int i) {
                holder.setView(getApplicationContext() , user.getShopName() , user.getShopContact() , user.getShopAddress() , user.getShopImage());

            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}