package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class help extends AppCompatActivity {
ImageButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View v) {
            Intent i= new
                    Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        }
    });
    }
}
