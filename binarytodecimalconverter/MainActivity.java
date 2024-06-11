package com.example.binarytodecimalconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variables for binary to decimal conversion
        EditText input = findViewById(R.id.editText);
        EditText output = findViewById(R.id.output);
        Button submit = findViewById(R.id.submit);
        Button reset = findViewById(R.id.reset);

        // Variables for decimal to binary conversion
        EditText decimalInput = findViewById(R.id.decimalInput);
        EditText binaryOutput = findViewById(R.id.binaryOutput);
        Button convertDecimalToBinary = findViewById(R.id.convertDecimalToBinary);

        // Binary to Decimal conversion
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String binaryStr = input.getText().toString();
                try {
                    int decimalValue = Integer.parseInt(binaryStr, 2);
                    output.setText(String.valueOf(decimalValue));
                } catch (NumberFormatException e) {
                    output.setText("Invalid binary number");
                }
            }
        });

        // Reset input and output fields
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
                decimalInput.setText("");
                binaryOutput.setText("");
            }
        });

        // Decimal to Binary conversion
        convertDecimalToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalStr = decimalInput.getText().toString();
                try {
                    int decimalValue = Integer.parseInt(decimalStr);
                    String binaryValue = Integer.toBinaryString(decimalValue);
                    binaryOutput.setText(binaryValue);
                } catch (NumberFormatException e) {
                    binaryOutput.setText("Invalid decimal number");
                }
            }
        });
    }
}
