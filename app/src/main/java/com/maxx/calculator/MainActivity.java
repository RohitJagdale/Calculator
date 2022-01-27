package com.maxx.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.maxx.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

//        mb.inputscreen.setShowSoftInputOnFocus(false);

        mb.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText('1');
                Toast.makeText(getApplicationContext(),"this is clicled",Toast.LENGTH_SHORT).show();
            }
        });
        mb.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "2");
            }
        });
        mb.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "3");
            }
        });
        mb.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "4");
            }
        });
        mb.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "5");
            }
        });
        mb.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "6");
            }
        });
        mb.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "7");
            }
        });
        mb.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "8");
            }
        });
        mb.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "9");
            }
        });
        mb.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "0");
            }
        });
        mb.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "+");
            }
        });
        mb.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "-");
            }
        });
        mb.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "x");
            }
        });
        mb.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(mb.inputscreen.getText() + "÷");
            }
        });
        mb.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mb.inputscreen.setText(mb.inputscreen.getText() + "0");
            }
        });
        mb.clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.inputscreen.setText(null);
            }
        });

    }
}