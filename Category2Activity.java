package com.example.essentialguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category2Activity extends AppCompatActivity {

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
                openarea2health();
            }
        });

        general = (Button) findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2general();
            }
        });

        electronics = (Button) findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2electronics();
            }
        });

        books = (Button) findViewById(R.id.Books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2books();
            }
        });

        restaurant = (Button) findViewById(R.id.Restaurants);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2rest();
            }
        });

        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2home();
            }
        });

        hostel = (Button) findViewById(R.id.Hostels);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2hostels();
            }
        });

        beauty = (Button) findViewById(R.id.Beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2beauty();
            }
        });

        oldday = (Button) findViewById(R.id.OldDay);
        oldday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2oldday();
            }
        });

        fashion = (Button) findViewById(R.id.Fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea2fashion();
            }
        });
    }

    public void openarea2health()
    {
        Intent intent = new Intent(this , Area2HealthActivity.class);
        startActivity(intent);
    }

    public void openarea2general()
    {
        Intent intent = new Intent(this , Area2GeneralActivity.class);
        startActivity(intent);
    }

    public void openarea2electronics()
    {
        Intent intent = new Intent(this , Area2ElectronicsActivity.class);
        startActivity(intent);
    }

    public void openarea2books()
    {
        Intent intent = new Intent(this , Area2BooksActivity.class);
        startActivity(intent);
    }

    public void openarea2rest()
    {
        Intent intent = new Intent(this , Area2RestActivity.class);
        startActivity(intent);
    }

    public void openarea2home()
    {
        Intent intent = new Intent(this , Area2HomeActivity.class);
        startActivity(intent);
    }

    public void openarea2hostels()
    {
        Intent intent = new Intent(this , Area2HostelActivity.class);
        startActivity(intent);
    }

    public void openarea2beauty()
    {
        Intent intent = new Intent(this , Area2BeautyActivity.class);
        startActivity(intent);
    }

    public void openarea2oldday()
    {
        Intent intent = new Intent(this , Area2OldDayActivity.class);
        startActivity(intent);
    }

    public void openarea2fashion()
    {
        Intent intent = new Intent(this , Area2EducaActivity.class);
        startActivity(intent);
    }
}