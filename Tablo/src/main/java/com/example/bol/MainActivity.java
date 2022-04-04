package com.example.bol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterPepsi=0;
    int counterCocaColla=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counterPepsi")
                && savedInstanceState.containsKey("counterCocaColla")) {
            counterPepsi = savedInstanceState.getInt("counterPepsi");
            counterCocaColla = savedInstanceState.getInt("counterCocaColla");
        }
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_pepsi);
        TextView textView1 = findViewById(R.id.txt_colla);
        textView.setText(String.valueOf(counterPepsi));
        textView1.setText(String.valueOf(counterCocaColla));
    }

    public void onClickPepsi(View view) {
        counterPepsi++;
        TextView textView = findViewById(R.id.text_pepsi);
        textView.setText(String.valueOf(counterPepsi));
    }



    public void onClickCocaColla(View view) {
        counterCocaColla++;
        TextView textView = findViewById(R.id.txt_colla);
        textView.setText(String.valueOf(counterCocaColla));
    }

    public void onClickReset(View view){
        TextView textView = findViewById(R.id.text_pepsi);
        TextView textView1 = findViewById(R.id.txt_colla);
        counterPepsi = 0;
        counterCocaColla = 0;
        textView.setText(String.valueOf(counterPepsi));
        textView1.setText(String.valueOf(counterCocaColla));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counterPepsi", counterPepsi);
        outState.putInt("counterCocaColla", counterCocaColla);
    }


}
