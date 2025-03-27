package com.example.happyticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    TextView textView_rules;
    Button button_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_rules = (TextView) findViewById(R.id.textButtonRules);
        textView_rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.bottom_sheet,null);
                bottomSheetDialog.setContentView(view);
                bottomSheetDialog.show();
            }
        });

        button_start = (Button) findViewById(R.id.buttonStart);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChangeCategory.class);
                startActivity(intent);
            }
        });

    }
}