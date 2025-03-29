package com.example.happyticket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditCategory extends AppCompatActivity {
    private EditCategoryCalculateLogic inputNumbers;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_edit);

        int[] numberIds = new int[] {
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine,
                R.id.zero
        };

        int[] actionsIds = new int[] {
          R.id.dot,
          R.id.clear,
          R.id.button_done
        };

        text = findViewById(R.id.editText);
        text.setEnabled(false);

        inputNumbers = new EditCategoryCalculateLogic();

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumbers.onNumPressed(view.getId());
                text.setText(inputNumbers.getText());
            }
        };
        View.OnClickListener actionButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputNumbers.onActionPressed(view.getId());
                text.setText(inputNumbers.getText());
            }
        };

        for (int i = 0; i < numberIds.length; i++) {
            findViewById(numberIds[i]).setOnClickListener(numberButtonClickListener);
        }
        for (int i = 0; i < actionsIds.length; i++) {
            findViewById(actionsIds[i]).setOnClickListener(actionButtonClickListener);
        }
    }
}