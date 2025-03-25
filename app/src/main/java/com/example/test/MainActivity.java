package com.example.test;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
    }

    public void randomnum(View view) {
        Random randomnum = new Random();
        int ran1 = randomnum.nextInt(6);
        int ran2 = randomnum.nextInt(6);
        switch (ran1) {
            case 1:
                imageView.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView.setImageResource(R.drawable.two);
                ;
                break;
            case 3:
                imageView.setImageResource(R.drawable.three);
                ;
                break;
            case 4:
                imageView.setImageResource(R.drawable.four);
                ;
                break;
            case 5:
                imageView.setImageResource(R.drawable.five);
                ;
                break;
            case 6:
                imageView.setImageResource(R.drawable.six);
                ;
                break;

        }
        switch (ran2) {
            case 1:
                imageView2.setImageResource(R.drawable.one);
                break;
            case 2:
                imageView2.setImageResource(R.drawable.two);
                ;
                break;
            case 3:
                imageView2.setImageResource(R.drawable.three);
                ;
                break;
            case 4:
                imageView2.setImageResource(R.drawable.four);
                ;
                break;
            case 5:
                imageView2.setImageResource(R.drawable.five);
                ;
                break;
            case 6:
                imageView2.setImageResource(R.drawable.six);
                ;
                break;

        }
    }
}