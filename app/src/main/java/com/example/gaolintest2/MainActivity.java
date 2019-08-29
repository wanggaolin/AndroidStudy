package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button Buttoncalculate;
    private Button ButtonQQLogin;
    private Button ButtonQQLogin1;
    private Button ButtonFormInput;
    private Button ButtonBlossom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttoncalculate = (Button) findViewById(R.id.calculate);
        Buttoncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Calculate.class);
                startActivity(intent);
            }
        });

        ButtonQQLogin = (Button) findViewById(R.id.qq_login);
        ButtonQQLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QQLoginPage.class);
                startActivity(intent);
            }
        });

        ButtonQQLogin1 = (Button) findViewById(R.id.qq_login1);
        ButtonQQLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QQLoginPage1.class);
                startActivity(intent);
            }
        });

        ButtonFormInput = (Button) findViewById(R.id.form_input);
        ButtonFormInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FromInput.class);
                startActivity(intent);
            }
        });

        ButtonBlossom = (Button) findViewById(R.id.blossom_image);
        ButtonBlossom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BlossomImage.class);
                startActivity(intent);
            }
        });


    }
}
