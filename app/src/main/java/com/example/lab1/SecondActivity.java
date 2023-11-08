package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getIntent().getExtras();

        String surname = "";
        if (arguments != null)
            surname = arguments.get(KEY).toString();

        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.text_view);
        textView.setText(getString(R.string.text_surname, surname));
    }

    static final String KEY = "KEY";
}