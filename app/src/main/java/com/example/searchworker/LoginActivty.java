package com.example.searchworker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivty extends AppCompatActivity
{
    private EditText email,pass;
    private Button loginBtn;
    private FirebaseAuth auth;
    private DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        loginBtn = findViewById(R.id.btn_login);
    }
    public void login(View view)
    {
        String mail = email.getText().toString().trim();
        String password = pass.getText().toString().trim();
        if(mail.isEmpty())
        {
            email.setError("Enter Your  Email");
        }
        else if(mail.isEmpty())
        {
            pass.setError("Enter Your Password");
        }
        else
            {
            startProgressbar();
            checkAuth(mail,password);
        }
    }

    }
}