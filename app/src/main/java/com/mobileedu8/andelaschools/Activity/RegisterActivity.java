package com.mobileedu8.andelaschools.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.mobileedu8.andelaschools.Adapters.RegisterAdapter;
import com.mobileedu8.andelaschools.R;

public class RegisterActivity extends AppCompatActivity {

    private RegisterAdapter adapter;
    private TabLayout tabLayout;
    private androidx.appcompat.widget.Toolbar toolbar;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initID();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initID() {
        adapter = new RegisterAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);
        toolbar = findViewById(R.id.toolbar);
    }
}