package com.example.calc1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_main2);
        result = findViewById(R.id.textViewResult);

        int sum1 = getIntent().getExtras().getInt("chislo");
        int sum2 = getIntent().getExtras().getInt("chislo2");
        int res = sum1 + sum2;
        if (sum2 >= 0) {
            result.setText(sum1 + " + " + sum2 + " = " + res);
        } else {
            result.setText(sum1 + " + " + "(" + sum2 + ")" +  " = " + res);

        }
    }
}
