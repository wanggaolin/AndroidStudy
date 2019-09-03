package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QQLoginPage1 extends AppCompatActivity {

    private Button butSubmit;
    private TextView butRegister;
    private EditText qq_number,qq_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qqlogin_page1);
        initview();
        butSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qq_tel = qq_number.getText().toString();
                String qq_password = qq_pwd.getText().toString();
                Log.i("QQLoginPage1","登录输入的账号和密码");
                Log.i("QQLoginPage1",qq_tel);
                Log.i("QQLoginPage1",qq_password);
                if(qq_tel.equals("110") && qq_password.equals("110")){
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.qq_login_success,Toast.LENGTH_SHORT);
                    toast.show();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),R.string.qq_login_fail,Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        butRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QQLoginPage1.this,QQRegister.class);
                startActivity(intent);
            }
        });
    }

    void initview(){
        butSubmit = (Button) findViewById(R.id.submit);
        qq_number = (EditText) findViewById(R.id.qq_number);
        qq_pwd = (EditText) findViewById(R.id.qq_pwd);
        butRegister = (TextView) findViewById(R.id.qq_login_register);
    }
}
