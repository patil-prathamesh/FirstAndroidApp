package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi,Click listener worked", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = (kg * 2.205);
                textView.setTextSize(20);
                textView.setText(String.format("The corresponding value in Pound is %.3f",pound));
            }
        });
    }
}