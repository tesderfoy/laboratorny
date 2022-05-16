package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText sum1;
    EditText sum2;
    Button neznay;
    int number1;
    int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        neznay = findViewById(R.id.button);
        sum1 = findViewById(R.id.editText1);
        sum2 = findViewById(R.id.editText2);
    }
    public void onClick(View view){
        try {
            number1 = Integer.parseInt(sum1.getText().toString());
            number2 = Integer.parseInt(sum2.getText().toString());
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("chislo", number1);
            intent.putExtra("chislo2", number2);
            startActivity(intent);
        }
        catch (Exception ex){
            Toast.makeText(this, "букавы нельзя или слишком большое число", Toast.LENGTH_LONG).show();

        }

    }
}