package com.example.myname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        Button btn =  findViewById(R.id.btn);
        TextView answer = findViewById(R.id.answer);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = name.getText().toString();

                answer.setText("Your Name is "+ans);
            }
        });
    }
}