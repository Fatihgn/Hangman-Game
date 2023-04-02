package com.example.adam_asmaca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.adam_asmaca.databinding.ActivityLoginBinding;
import com.example.adam_asmaca.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding tasarim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim1= DataBindingUtil.setContentView(this,R.layout.activity_login);
        tasarim1.buttonYeniOyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(gecis);
            }
        });
    }
}