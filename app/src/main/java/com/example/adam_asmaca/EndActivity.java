package com.example.adam_asmaca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.adam_asmaca.databinding.ActivityEndBinding;


public class EndActivity extends AppCompatActivity {
    String gelen_kelime;
    private ActivityEndBinding tasarim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim2= DataBindingUtil.setContentView(this,R.layout.activity_end);
        String gelen_kelime = getIntent().getStringExtra("kelime");
        tasarim2.textView5.setText(gelen_kelime);

        tasarim2.buttonYeniOyun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tekrar = new Intent(EndActivity.this,MainActivity.class);
                startActivity(tekrar);
            }
        });
    }
}