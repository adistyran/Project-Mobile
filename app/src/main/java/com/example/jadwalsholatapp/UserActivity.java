package com.example.jadwalsholatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jadwalsholatapp.model.User;

public class UserActivity extends AppCompatActivity {
    private TextView tvUser;

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user = (User) getIntent().getSerializableExtra("User");
        tvUser = findViewById(R.id.tvUser);
        TextView tvUser = findViewById(R.id.tvUser);

        if(user != null){
            tvUser.setText("Welcome");
        }

    }
}
