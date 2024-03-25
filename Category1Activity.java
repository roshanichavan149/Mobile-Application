package com.example.essentialguides;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category1Activity extends AppCompatActivity {

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
                openarea1health();
            }
        });

        general = (Button) findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1general();
            }
        });

        electronics = (Button) findViewById(R.id.Electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1electronics();
            }
        });

        books = (Button) findViewById(R.id.Books);
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1books();
            }
        });

        restaurant = (Button) findViewById(R.id.Restaurants);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1rest();
            }
        });

        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1home();
            }
        });

        hostel = (Button) findViewById(R.id.Hostels);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1hostels();
            }
        });

        beauty = (Button) findViewById(R.id.Beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1beauty();
            }
        });

        oldday = (Button) findViewById(R.id.OldDay);
        oldday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1oldday();
            }
        });

        fashion = (Button) findViewById(R.id.Fashion);
        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openarea1fashion();
            }
        });

    }

    public void openarea1health()
    {
        Intent intent = new Intent(this , Area1HealthActivity.class);
        startActivity(intent);
    }

    public void openarea1general()
    {
        Intent intent = new Intent(this , Area1GeneralActivity.class);
        startActivity(intent);
    }

    public void openarea1electronics()
    {
        Intent intent = new Intent(this , Area1ElectronicsActivity.class);
        startActivity(intent);
    }

    public void openarea1books()
    {
        Intent intent = new Intent(this , Area1BooksActivity.class);
        startActivity(intent);
    }

    public void openarea1rest()
    {
        Intent intent = new Intent(this , Area1RestActivity.class);
        startActivity(intent);
    }

    public void openarea1home()
    {
        Intent intent = new Intent(this , Area1HomeActivity.class);
        startActivity(intent);
    }

    public void openarea1hostels()
    {
        Intent intent = new Intent(this , Area1HostelActivity.class);
        startActivity(intent);
    }

    public void openarea1beauty()
    {
        Intent intent = new Intent(this , Area1BeautyActivity.class);
        startActivity(intent);
    }

    public void openarea1oldday()
    {
        Intent intent = new Intent(this , Area1OldDayActivity.class);
        startActivity(intent);
    }

    public void openarea1fashion()
    {
        Intent intent = new Intent(this , Area1EducaActivity.class);
        startActivity(intent);
    }
}