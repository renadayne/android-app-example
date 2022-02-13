package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextSoA, editTextSoB;
    Button button;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();//ham anh xa
        textView3.setText("hello");
        // xu li thuat toan
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int a = Integer.parseInt(editTextSoA.getText().toString()) ; // lay du lieu tu editText so nguyen
                int b = Integer.parseInt(editTextSoB.getText().toString());
                int total = a + b;
                textView3.setText(""+ total); // hien thi textView3
                // setText yeu cau tham so truyen vao dang string
                Intent abc = new Intent(MainActivity.this, MH2.class); // dong goi va truyen du lieu de gui sang man hinh khac, cu the la mh 2
                Bundle xyz = new Bundle(); // luu du lieu bang key
                xyz.putInt("data_key", a); // neu bien la dang chu thi de la putString
                xyz.putInt("data_key2", b);
                xyz.putInt("data_key3", total);
                abc.putExtra("packet", xyz); // dong goi
                startActivity(abc); // bat buoc
            }
        });


    }
    // ham anh xa
    private void Init() {
        editTextSoA = (EditText) findViewById(R.id.editTextSoA);
        editTextSoB = (EditText) findViewById(R.id.editTextSoB);
        button = (Button) findViewById(R.id.button);
        textView3 = (TextView) findViewById(R.id.textView3);
    }
}