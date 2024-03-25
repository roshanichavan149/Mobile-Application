package com.example.essentialguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category3Activity extends AppCompatActivity {

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
                openarea3health();
            }
        });

        general = (Button) findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3general();
            }
        });

        electronics = (Button) findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3electronics();
            }
        });

        books = (Button) findViewById(R.id.Books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3books();
            }
        });

        restaurant = (Button) findViewById(R.id.Restaurants);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3rest();
            }
        });

        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3home();
            }
        });

        hostel = (Button) findViewById(R.id.Hostels);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3hostels();
            }
        });

        beauty = (Button) findViewById(R.id.Beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3beauty();
            }
        });

        oldday = (Button) findViewById(R.id.OldDay);
        oldday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3oldday();
            }
        });

        fashion = (Button) findViewById(R.id.Fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea3fashion();
            }
        });
    }

    public void openarea3health()
    {
        Intent intent = new Intent(this , Area3HealthActivity.class);
        startActivity(intent);
    }

    public void openarea3general()
    {
        Intent intent = new Intent(this , Area3GeneralActivity.class);
        startActivity(intent);
    }

    public void openarea3electronics()
    {
        Intent intent = new Intent(this , Area3ElectronicsActivity.class);
        startActivity(intent);
    }

    public void openarea3books()
    {
        Intent intent = new Intent(this , Area3BooksActivity.class);
        startActivity(intent);
    }

    public void openarea3rest()
    {
        Intent intent = new Intent(this , Area3RestActivity.class);
        startActivity(intent);
    }

    public void openarea3home()
    {
        Intent intent = new Intent(this , Area3HomeActivity.class);
        startActivity(intent);
    }

    public void openarea3hostels()
    {
        Intent intent = new Intent(this , Area3HostelActivity.class);
        startActivity(intent);
    }

    public void openarea3beauty()
    {
        Intent intent = new Intent(this , Area3BeautyActivity.class);
        startActivity(intent);
    }

    public void openarea3oldday()
    {
        Intent intent = new Intent(this , Area3OldDayActivity.class);
        startActivity(intent);
    }

    public void openarea3fashion()
    {
        Intent intent = new Intent(this , Area3EducaActivity.class);
        startActivity(intent);
    }
}