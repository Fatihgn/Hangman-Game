package com.example.adam_asmaca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import com.example.adam_asmaca.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private char[][] array = {{'R','A','D','Y','O'},{'S','E','H','P','A'},{'D','O','L','A','P'},{'T','A','B','L','O'},{'T','E','P','S','İ'}
            ,{'H','I','R','K','A'},{'P','A','L','T','O'},{'T','A','V','U','K'},{'K','O','Y','U','N'}};
    private String kelime;
    private char[] gizli_kelime={'_',' ','_',' ','_',' ','_',' ','_'};
    private int secim;
    private int yanlis=0;

    public void cizimyap(){
        if(yanlis==1)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.iki));
        }
        else if(yanlis==2)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.uc));
        }
        else if(yanlis==3)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.dort));
        }
        else if(yanlis==4)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.bes));
        }
        else if(yanlis==5)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.alti));
        }
        else if(yanlis==6)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.yedi));
        }
        else if(yanlis==7)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.sekiz));
        }
        else if(yanlis==8)
        {
            tasarim.imageView.setImageDrawable(getDrawable(R.drawable.dokuz));
            Intent yandi = new Intent(MainActivity.this,EndActivity.class);
            yandi.putExtra("kelime",kelime);
            startActivity(yandi);

        }


    }

    public boolean kazandi_mi(){
        for(int i=0;i<9;i++){
            if(gizli_kelime[i]=='_'){
                return false;
            }
        }
        return true;
    }
    public void kazanan_ekranı(){
        Intent kazandi = new Intent(MainActivity.this,WinActivity.class);
        kazandi.putExtra("kelime",kelime);
        startActivity(kazandi);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim= DataBindingUtil.setContentView(this,R.layout.activity_main);
        tasarim.textView2.setText(kelime);
        secim=(int)(Math.random()*10-1);
        kelime=String.valueOf(array[secim]);
        tasarim.textView2.setText(String.valueOf(gizli_kelime));

        tasarim.buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='A'){
                    gizli_kelime[0]='A';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='A'){
                    gizli_kelime[2]='A';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='A'){
                    gizli_kelime[4]='A';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='A'){
                    gizli_kelime[6]='A';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='A'){
                    gizli_kelime[8]='A';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonA.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='B'){
                    gizli_kelime[0]='B';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='B'){
                    gizli_kelime[2]='B';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='B'){
                    gizli_kelime[4]='B';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='B'){
                    gizli_kelime[6]='B';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='B'){
                    gizli_kelime[8]='B';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonB.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='C'){
                    gizli_kelime[0]='C';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='C'){
                    gizli_kelime[2]='C';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='C'){
                    gizli_kelime[4]='C';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='C'){
                    gizli_kelime[6]='C';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='C'){
                    gizli_kelime[8]='C';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonC.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Ç'){
                    gizli_kelime[0]='Ç';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Ç'){
                    gizli_kelime[2]='Ç';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Ç'){
                    gizli_kelime[4]='Ç';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Ç'){
                    gizli_kelime[6]='Ç';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Ç'){
                    gizli_kelime[8]='Ç';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonCC.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='D'){
                    gizli_kelime[0]='D';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='D'){
                    gizli_kelime[2]='D';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='D'){
                    gizli_kelime[4]='D';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='D'){
                    gizli_kelime[6]='D';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='D'){
                    gizli_kelime[8]='D';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonD.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='E'){
                    gizli_kelime[0]='E';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='E'){
                    gizli_kelime[2]='E';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='E'){
                    gizli_kelime[4]='E';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='E'){
                    gizli_kelime[6]='E';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='E'){
                    gizli_kelime[8]='E';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonE.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='F'){
                    gizli_kelime[0]='F';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }


                }
                else if(kelime.charAt(1)=='F'){
                    gizli_kelime[2]='F';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='F'){
                    gizli_kelime[4]='F';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='F'){
                    gizli_kelime[6]='F';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='F'){
                    gizli_kelime[8]='F';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonF.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='G'){
                    gizli_kelime[0]='G';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='G'){
                    gizli_kelime[2]='G';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='G'){
                    gizli_kelime[4]='G';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='G'){
                    gizli_kelime[6]='G';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='G'){
                    gizli_kelime[8]='G';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonG.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Ğ'){
                    gizli_kelime[0]='Ğ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Ğ'){
                    gizli_kelime[2]='Ğ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Ğ'){
                    gizli_kelime[4]='Ğ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Ğ'){
                    gizli_kelime[6]='Ğ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Ğ'){
                    gizli_kelime[8]='Ğ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonGG.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='H'){
                    gizli_kelime[0]='H';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='H'){
                    gizli_kelime[2]='H';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='H'){
                    gizli_kelime[4]='H';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='H'){
                    gizli_kelime[6]='H';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='H'){
                    gizli_kelime[8]='H';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonH.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='İ'){
                    gizli_kelime[0]='İ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='İ'){
                    gizli_kelime[2]='İ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='İ'){
                    gizli_kelime[4]='İ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='İ'){
                    gizli_kelime[6]='İ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='İ'){
                    gizli_kelime[8]='İ';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonII.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='I'){
                    gizli_kelime[0]='I';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='I'){
                    gizli_kelime[2]='I';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='I'){
                    gizli_kelime[4]='I';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='I'){
                    gizli_kelime[6]='I';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='I'){
                    gizli_kelime[8]='I';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonI.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='J'){
                    gizli_kelime[0]='J';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='J'){
                    gizli_kelime[2]='J';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='J'){
                    gizli_kelime[4]='J';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='J'){
                    gizli_kelime[6]='J';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='J'){
                    gizli_kelime[8]='J';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonJ.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='K'){
                    gizli_kelime[0]='K';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='K'){
                    gizli_kelime[2]='K';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='K'){
                    gizli_kelime[4]='K';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='K'){
                    gizli_kelime[6]='K';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='K'){
                    gizli_kelime[8]='K';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonK.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='L'){
                    gizli_kelime[0]='L';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='L'){
                    gizli_kelime[2]='L';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='L'){
                    gizli_kelime[4]='L';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='L'){
                    gizli_kelime[6]='L';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='L'){
                    gizli_kelime[8]='L';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonL.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='M'){
                    gizli_kelime[0]='M';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='M'){
                    gizli_kelime[2]='M';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='M'){
                    gizli_kelime[4]='M';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='M'){
                    gizli_kelime[6]='M';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='M'){
                    gizli_kelime[8]='M';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonM.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='N'){
                    gizli_kelime[0]='N';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='N'){
                    gizli_kelime[2]='N';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='N'){
                    gizli_kelime[4]='N';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='N'){
                    gizli_kelime[6]='N';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='N'){
                    gizli_kelime[8]='N';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonN.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='O'){
                    gizli_kelime[0]='O';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='O'){
                    gizli_kelime[2]='O';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='O'){
                    gizli_kelime[4]='O';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='O'){
                    gizli_kelime[6]='O';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='O'){
                    gizli_kelime[8]='O';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonO.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Ö'){
                    gizli_kelime[0]='Ö';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Ö'){
                    gizli_kelime[2]='Ö';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Ö'){
                    gizli_kelime[4]='Ö';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Ö'){
                    gizli_kelime[6]='Ö';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Ö'){
                    gizli_kelime[8]='Ö';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonOO.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='P'){
                    gizli_kelime[0]='P';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='P'){
                    gizli_kelime[2]='P';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='P'){
                    gizli_kelime[4]='P';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='P'){
                    gizli_kelime[6]='P';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='P'){
                    gizli_kelime[8]='P';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonP.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='R'){
                    gizli_kelime[0]='R';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='R'){
                    gizli_kelime[2]='R';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='R'){
                    gizli_kelime[4]='R';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='R'){
                    gizli_kelime[6]='R';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='R'){
                    gizli_kelime[8]='R';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonR.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='S'){
                    gizli_kelime[0]='S';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='S'){
                    gizli_kelime[2]='S';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='S'){
                    gizli_kelime[4]='S';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='S'){
                    gizli_kelime[6]='S';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='S'){
                    gizli_kelime[8]='S';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonS.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Ş'){
                    gizli_kelime[0]='Ş';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Ş'){
                    gizli_kelime[2]='Ş';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Ş'){
                    gizli_kelime[4]='Ş';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Ş'){
                    gizli_kelime[6]='Ş';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Ş'){
                    gizli_kelime[8]='Ş';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonSS.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='T'){
                    gizli_kelime[0]='T';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='T'){
                    gizli_kelime[2]='T';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='T'){
                    gizli_kelime[4]='T';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='T'){
                    gizli_kelime[6]='T';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='T'){
                    gizli_kelime[8]='T';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonT.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='U'){
                    gizli_kelime[0]='U';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='U'){
                    gizli_kelime[2]='U';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='U'){
                    gizli_kelime[4]='U';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='U'){
                    gizli_kelime[6]='U';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='U'){
                    gizli_kelime[8]='U';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonU.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonUU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Ü'){
                    gizli_kelime[0]='Ü';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Ü'){
                    gizli_kelime[2]='Ü';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Ü'){
                    gizli_kelime[4]='Ü';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Ü'){
                    gizli_kelime[6]='Ü';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Ü'){
                    gizli_kelime[8]='Ü';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonUU.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='V'){
                    gizli_kelime[0]='V';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='V'){
                    gizli_kelime[2]='V';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='V'){
                    gizli_kelime[4]='V';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='V'){
                    gizli_kelime[6]='V';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='V'){
                    gizli_kelime[8]='V';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonV.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Y'){
                    gizli_kelime[0]='Y';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Y'){
                    gizli_kelime[2]='Y';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Y'){
                    gizli_kelime[4]='Y';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Y'){
                    gizli_kelime[6]='Y';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Y'){
                    gizli_kelime[8]='Y';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonY.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });
        tasarim.buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kelime.charAt(0)=='Z'){
                    gizli_kelime[0]='Z';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }

                }
                else if(kelime.charAt(1)=='Z'){
                    gizli_kelime[2]='Z';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(2)=='Z'){
                    gizli_kelime[4]='Z';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(3)=='Z'){
                    gizli_kelime[6]='Z';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else if(kelime.charAt(4)=='Z'){
                    gizli_kelime[8]='Z';
                    tasarim.textView2.setText(String.valueOf(gizli_kelime));
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    if(kazandi_mi()==true){
                        kazanan_ekranı();
                    }
                }
                else {
                    tasarim.buttonZ.setVisibility(View.INVISIBLE);
                    yanlis++;
                    cizimyap();
                }
            }
        });



    }
}
