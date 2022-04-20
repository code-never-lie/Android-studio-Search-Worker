package com.example.searchworker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class User_Detail extends AppCompatActivity
{
    private TextView nameTextView,addressTextView,mobileTextView,emailTextView,eduactionTextView,researchTextView,projectTextView,keyTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__detail);
        nameTextView = findViewById(R.id.name);
        addressTextView = findViewById(R.id.address);
        mobileTextView = findViewById(R.id.mobile);
        emailTextView = findViewById(R.id.email);
        eduactionTextView = findViewById(R.id.qualification);
        researchTextView = findViewById(R.id.research);
        projectTextView = findViewById(R.id.project);
        keyTextView = findViewById(R.id.skill);
    }
}