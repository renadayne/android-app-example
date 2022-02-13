package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MH2 extends AppCompatActivity {
    TextView textView4, textView5;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mh2);
        Init();
        // bien abc xyz o man hinh 1 ko lien quan man hinh 2
        Intent abc = getIntent(); // lay du lieu tu man hinh 1 qua
        Bundle xyz = abc.getBundleExtra("packet"); // lay du lieu phan ra
        int a = xyz.getInt("data_key");
        int b = xyz.getInt("data_key2");
        int total = xyz.getInt("data_key3");
        textView4.setText(String.valueOf(a));
        textView5.setText(String.valueOf(b));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // chuyen man
                Intent abc = new Intent( MH2.this, MainActivity.class); // chuyen lai man cu
                // xu li du lieu neu co
                startActivity(abc); // de chay tat ca cac cai tren
            }
        });
    }
    private void Init() {

        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        button2 = (Button) findViewById(R.id.button2);
     }

}