package com.example.end;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        final String LOG_TAG = "Log";
        private Integer counter = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void onClickDiamonds(View view) {
            counter++;
            TextView counterView = findViewById(R.id.txt_counter);
            counterView.setText(counter.toString());
            if (counter >= 100){
                TextView layout = findViewById(R.id.txt_counter);
                ViewGroup.LayoutParams oval = layout.getLayoutParams();
                oval.height = 450;
                oval.width = 450;
                layout.setLayoutParams(oval);

            }
            if (counter >= 1000){
                TextView layout = findViewById(R.id.txt_counter);
                ViewGroup.LayoutParams oval = layout.getLayoutParams();
                oval.height = 500;
                oval.width = 500;
                layout.setLayoutParams(oval);

            }
        }

        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            counter = savedInstanceState.getInt("count");
            Log.d(LOG_TAG, "onRestoreInstanceState");
        }

        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("count", counter);
            Log.d(LOG_TAG, "onSaveInstateState");
        }
        public void resetUI(){
            ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());
            Log.d(LOG_TAG, "resetUI");
        }
        public void onResume(){
            super.onResume();
            Log.d(LOG_TAG, "onResume");
            resetUI();
        }

    }