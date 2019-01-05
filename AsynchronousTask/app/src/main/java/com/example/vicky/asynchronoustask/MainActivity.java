package com.example.vicky.asynchronoustask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        final ProgressBar progressBar = findViewById(R.id.pb);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count();
            }
        });


    }

    void count() {
         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (long i = 0; i < 1000000000; i++) {
                    //Count
                }

//                textView.setText("Counting Done");

                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                         TextView textView=findViewById(R.id.textView);
                        textView.setText("Counting Done");

                    }
                });
            }
        });
        thread.start();
    }


}
