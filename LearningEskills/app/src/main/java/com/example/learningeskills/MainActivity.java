package com.example.learningeskills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View v) {
        Intent intent = new Intent(MainActivity.this, contentActivity.class);
        switch (v.getId()) {
            case R.id.a:
                // do something
                break;
            case R.id.b:
                intent.putExtra("description_text", "B for Ball");
                intent.putExtra("resId", R.drawable.b);
                break;
            case R.id.c:
                intent.putExtra("description_text", "C for Cat");
                intent.putExtra("resId", R.drawable.c);
                break;
            case R.id.d:
                intent.putExtra("description_text", "D for Dog");
                intent.putExtra("resId", R.drawable.d);
                break;
            case R.id.e:
                intent.putExtra("description_text", "E for Egg");
                intent.putExtra("resId", R.drawable.e);
                break;
            case R.id.f:
                intent.putExtra("description_text", "F for Fish");
                intent.putExtra("resId", R.drawable.f);
                break;
            case R.id.g:
                intent.putExtra("description_text", "G for Grapes");
                intent.putExtra("resId", R.drawable.g);
                break;
            case R.id.h:
                intent.putExtra("description_text", "H for Horse");
                intent.putExtra("resId", R.drawable.h);
                break;
            case R.id.i:
                intent.putExtra("description_text", "I for Ice Cream");
                intent.putExtra("resId", R.drawable.i);
                break;
            case R.id.j:
                intent.putExtra("description_text", "J for Joker");
                intent.putExtra("resId", R.drawable.j);
                break;
            case R.id.k:
                intent.putExtra("description_text", "K for key");
                intent.putExtra("resId", R.drawable.k);
                break;
            case R.id.l:
                intent.putExtra("description_text", "L for Lion");
                intent.putExtra("resId", R.drawable.l);
                break;
            case R.id.m:
                intent.putExtra("description_text", "M for Mango");
                intent.putExtra("resId", R.drawable.m);
                break;
            case R.id.n:
                intent.putExtra("description_text", "N for Nose");
                intent.putExtra("resId", R.drawable.n);
                break;
            case R.id.o:
                intent.putExtra("description_text", "O for Orange");
                intent.putExtra("resId", R.drawable.o);
                break;
            case R.id.p:
                intent.putExtra("description_text", "P for Parrot");
                intent.putExtra("resId", R.drawable.p);
                break;
            case R.id.q:
                intent.putExtra("description_text", "Q for Queen");
                intent.putExtra("resId", R.drawable.q);
                break;
            case R.id.r:
                intent.putExtra("description_text", "R for Rabbit");
                intent.putExtra("resId", R.drawable.r);
                break;
            case R.id.s:
                intent.putExtra("description_text", "S for Sun");
                intent.putExtra("resId", R.drawable.s);
                break;
            case R.id.t:
                intent.putExtra("description_text", "T for Tree");
                intent.putExtra("resId", R.drawable.t);
                break;
            case R.id.u:
                intent.putExtra("description_text", "U for Umbrella");
                intent.putExtra("resId", R.drawable.u);
                break;
            case R.id.v:
                intent.putExtra("description_text", "V for Van");
                intent.putExtra("resId", R.drawable.v);
                break;
            case R.id.w:
                intent.putExtra("description_text", "W for Watch");
                intent.putExtra("resId", R.drawable.w);
                break;
            case R.id.x:
                intent.putExtra("description_text", "X for X-Ray");
                intent.putExtra("resId", R.drawable.x);
                break;
            case R.id.y:
                intent.putExtra("description_text", "Y for Yoyo");
                intent.putExtra("resId", R.drawable.y);
                break;
            case R.id.z:
                intent.putExtra("description_text", "Z for Zebra");
                intent.putExtra("resId", R.drawable.z);
                break;


            default:
                //default case
                break;
        }
        startActivity(intent);
    }



}