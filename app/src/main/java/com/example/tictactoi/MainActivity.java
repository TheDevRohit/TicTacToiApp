package com.example.tictactoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9  ;
    Button restart;
    int flag = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });
    }
    private void init() {
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);

    }


    public void check(View v) {
        Button btnCurrent = (Button) v;
        if (btnCurrent.getText().toString().equals("")) {

            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = bt1.getText().toString();
                b2 = bt2.getText().toString();
                b3 = bt3.getText().toString();
                b4 = bt4.getText().toString();
                b5 = bt5.getText().toString();
                b6 = bt6.getText().toString();
                b7 = bt7.getText().toString();
                b8 = bt8.getText().toString();
                b9 = bt9.getText().toString();


                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is "+b1 +"Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is "+b4 +" Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is " + b7 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }

                if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is " + b1 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner is " + b2 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner is " + b1 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }
                if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner is " + b3 + " Hurray", Toast.LENGTH_SHORT).show();
                    delay();
                }else if(!b1.equals("") && !b2.equals("") && !b3.equals("")
                        &&!b3.equals("") && !b4.equals("") && !b5.equals("")
                         &&!b7.equals("") && !b8.equals("") && !b9.equals("") ){
                    Toast.makeText(this, " ! Oops ! Match is  Draw  " , Toast.LENGTH_SHORT).show();
                    delay();
                }
            }
        }
    }
    public void restart(){
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        count=0;
        flag=0;
    }

    public void delay(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                restart();
            }
        }, 1000);
    }

}