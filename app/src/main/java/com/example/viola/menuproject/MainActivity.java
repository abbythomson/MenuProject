package com.example.viola.menuproject;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    RadioButton fries;
    RadioButton cheese;
    RadioButton nachos;
    RadioButton burger;
    RadioButton sandwich;
    RadioButton macNcheese;
    RadioButton pie;
    RadioButton iceCreame;
    RadioButton cookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        fries = (RadioButton)findViewById(R.id.frenchFri);
        cheese = (RadioButton) findViewById(R.id.cheeseCurd);
        


    }
}
