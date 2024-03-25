package com.example.essentialguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category4Activity extends AppCompatActivity {

    Button health ;
    Button general;
    Button electronics;
    Button books;
    Button restaurant;
    Button home;
    Button hostel;
    Button beauty;
    Button oldday;
    Button fashion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        health = (Button) findViewById(R.id.Clinics);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4health();
            }
        });

        general = (Button) findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4general();
            }
        });

        electronics = (Button) findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4electronics();
            }
        });

        books = (Button) findViewById(R.id.Books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4books();
            }
        });

        restaurant = (Button) findViewById(R.id.Restaurants);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4rest();
            }
        });

        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4home();
            }
        });

        hostel = (Button) findViewById(R.id.Hostels);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4hostels();
            }
        });

        beauty = (Button) findViewById(R.id.Beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4beauty();
            }
        });

        oldday = (Button) findViewById(R.id.OldDay);
        oldday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4oldday();
            }
        });

        fashion = (Button) findViewById(R.id.Fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea4fashion();
            }
        });
    }

    public void openarea4health()
    {
        Intent intent = new Intent(this , Area4HealthActivity.class);
        startActivity(intent);
    }

    public void openarea4general()
    {
        Intent intent = new Intent(this , Area4GeneralActivity.class);
        startActivity(intent);
    }

    public void openarea4electronics()
    {
        Intent intent = new Intent(this , Area4ElectronicsActivity.class);
        startActivity(intent);
    }

    public void openarea4books()
    {
        Intent intent = new Intent(this , Area4BooksActivity.class);
        startActivity(intent);
    }

    public void openarea4rest()
    {
        Intent intent = new Intent(this , Area4RestActivity.class);
        startActivity(intent);
    }

    public void openarea4home()
    {
        Intent intent = new Intent(this , Area4HomeActivity.class);
        startActivity(intent);
    }

    public void openarea4hostels()
    {
        Intent intent = new Intent(this , Area4HostelActivity.class);
        startActivity(intent);
    }

    public void openarea4beauty()
    {
        Intent intent = new Intent(this , Area4BeautyActivity.class);
        startActivity(intent);
    }

    public void openarea4oldday()
    {
        Intent intent = new Intent(this , Area4OldDayActivity.class);
        startActivity(intent);
    }

    public void openarea4fashion()
    {
        Intent intent = new Intent(this , Area4EducaActivity.class);
        startActivity(intent);
    }
}