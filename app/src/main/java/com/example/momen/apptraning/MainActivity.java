package com.example.momen.apptraning;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager rootView = findViewById(R.id.view_pager);

        FragmentsAdapter fragmentsAdapter = new FragmentsAdapter(getSupportFragmentManager());

        rootView.setAdapter(fragmentsAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(rootView);

    }
}
