package com.hakkicanbuluc.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText;
    EditText numberText1;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        numberText1 = findViewById(R.id.numberText1);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view) {
        int number = Integer.parseInt(numberText.getText().toString());
        int number1 = Integer.parseInt(numberText1.getText().toString());

        int result = number + number1;

        resultText.setText("Result: " + result);
    }

    public void deduct(View view) {}

    public void multiply(View view) {}

    public void divide(View view) {}
}