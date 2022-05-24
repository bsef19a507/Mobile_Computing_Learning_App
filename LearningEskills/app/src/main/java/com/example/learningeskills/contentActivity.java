package com.example.learningeskills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class contentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        String des_text;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            des_text = bundle.getString("description_text");
            TextView descrip = findViewById(R.id.descrip);
            descrip.setText(des_text);
            ImageView img = findViewById(R.id.img);
            int resID = bundle.getInt("resId");
            img.setImageResource(resID);
        }


        Button bckBtn = findViewById(R.id.backBtn);
        bckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contentActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}