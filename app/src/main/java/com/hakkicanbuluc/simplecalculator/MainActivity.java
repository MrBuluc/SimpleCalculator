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
        String numberStr = numberText.getText().toString();
        String number1Str = numberText1.getText().toString();

        if (numberStr.matches("") || number1Str.matches("")) {
            resultText.setText("Enter Number!");
        } else {
            int number = Integer.parseInt(numberStr);
            int number1 = Integer.parseInt(number1Str);

            int result = number + number1;

            resultText.setText("Result: " + result);
        }

    }

    public void deduct(View view) {
        String numberStr = numberText.getText().toString();
        String number1Str = numberText1.getText().toString();

        if (numberStr.matches("") || number1Str.matches("")) {
            resultText.setText("Enter Number!");
        } else {
            int number = Integer.parseInt(numberStr);
            int number1 = Integer.parseInt(number1Str);

            int result = number - number1;

            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {
        String numberStr = numberText.getText().toString();
        String number1Str = numberText1.getText().toString();

        if (numberStr.matches("") || number1Str.matches("")) {
            resultText.setText("Enter Number!");
        } else {
            int number = Integer.parseInt(numberStr);
            int number1 = Integer.parseInt(number1Str);

            int result = number * number1;

            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        String numberStr = numberText.getText().toString();
        String number1Str = numberText1.getText().toString();

        if (numberStr.matches("") || number1Str.matches("")) {
            resultText.setText("Enter Number!");
        } else {
            int number = Integer.parseInt(numberStr);
            int number1 = Integer.parseInt(number1Str);

            int result = number / number1;

            resultText.setText("Result: " + result);
        }
    }
}