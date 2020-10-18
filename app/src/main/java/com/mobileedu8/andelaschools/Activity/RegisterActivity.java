package com.mobileedu8.andelaschools.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.mobileedu8.andelaschools.Adapters.RegisterAdapter;
import com.mobileedu8.andelaschools.R;

public class RegisterActivity extends AppCompatActivity {

    private RegisterAdapter adapter;
    private androidx.appcompat.widget.Toolbar toolbar;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setSupportActionBar(toolbar);
        initID();
        viewPager.setAdapter(adapter);
    }

    private void initID() {
        adapter = new RegisterAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewpager);
        toolbar = findViewById(R.id.toolbar);
    }
}