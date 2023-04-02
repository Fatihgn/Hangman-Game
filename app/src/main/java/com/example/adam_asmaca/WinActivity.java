package com.example.adam_asmaca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.adam_asmaca.databinding.ActivityWinBinding;


public class WinActivity extends AppCompatActivity {
    String gelen_kelime;
    private ActivityWinBinding tasarim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim= DataBindingUtil.setContentView(this,R.layout.activity_win);
        String gelen_kelime = getIntent().getStringExtra("kelime");
        tasarim.textView8.setText(gelen_kelime);

        tasarim.buttonYeniOyun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tekrarla = new Intent(WinActivity.this,MainActivity.class);
                startActivity(tekrarla);
            }
        });
    }
}