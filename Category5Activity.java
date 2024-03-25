package com.example.essentialguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category5Activity extends AppCompatActivity {

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
                openarea5health();
            }
        });

        general = (Button) findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5general();
            }
        });

        electronics = (Button) findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5electronics();
            }
        });

        books = (Button) findViewById(R.id.Books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5books();
            }
        });

        restaurant = (Button) findViewById(R.id.Restaurants);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5rest();
            }
        });

        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5home();
            }
        });

        hostel = (Button) findViewById(R.id.Hostels);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5hostels();
            }
        });

        beauty = (Button) findViewById(R.id.Beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5beauty();
            }
        });

        oldday = (Button) findViewById(R.id.OldDay);
        oldday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5oldday();
            }
        });

        fashion = (Button) findViewById(R.id.Fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea5fashion();
            }
        });

    }
    public void openarea5health()
    {
        Intent intent = new Intent(this , Area5HealthActivity.class);
        startActivity(intent);
    }

    public void openarea5general()
    {
        Intent intent = new Intent(this , Area5GeneralActivity.class);
        startActivity(intent);
    }

    public void openarea5electronics()
    {
        Intent intent = new Intent(this , Area5ElectronicsActivity.class);
        startActivity(intent);
    }

    public void openarea5books()
    {
        Intent intent = new Intent(this , Area5BooksActivity.class);
        startActivity(intent);
    }

    public void openarea5rest()
    {
        Intent intent = new Intent(this , Area5RestActivity.class);
        startActivity(intent);
    }

    public void openarea5home()
    {
        Intent intent = new Intent(this , Area5HomeActivity.class);
        startActivity(intent);
    }

    public void openarea5hostels()
    {
        Intent intent = new Intent(this , Area5HostelActivity.class);
        startActivity(intent);
    }

    public void openarea5beauty()
    {
        Intent intent = new Intent(this , Area5BeautyActivity.class);
        startActivity(intent);
    }

    public void openarea5oldday()
    {
        Intent intent = new Intent(this , Area5OldDayActivity.class);
        startActivity(intent);
    }

    public void openarea5fashion()
    {
        Intent intent = new Intent(this , Area5EducaActivity.class);
        startActivity(intent);
    }
}