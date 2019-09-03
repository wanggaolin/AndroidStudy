package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class QQRegister extends AppCompatActivity {

    private EditText Button_qq_username,Button_qq_pwd,Button_qq_pwd1;
    private CheckBox Button_love_read,Button_love_sing,Button_love_code,Bubbon_love_swim,Button_love_sport,Button_love_game;
    private Button ButtonSubmit,Button_qq_login,Button_qq_index;
    private Spinner Spinner_city;
    private ArrayAdapter arrayadapter;  //存储spinner数据

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qqregister);

        initView();

        Button_qq_username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String username = Button_qq_username.getText().toString();
                if (username.length()<6){
                    Toast.makeText(getApplicationContext(),"用户名不得少于6位",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button_qq_pwd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String pwd = Button_qq_pwd.getText().toString();
                if(pwd.length()<8){
                    Toast.makeText(getApplicationContext(),"输入密码不得少于8位",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button_qq_pwd1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String pwd = Button_qq_pwd.getText().toString();
                String pwd1 = Button_qq_pwd1.getText().toString();
                if(!pwd.equals(pwd1)){
                    Toast.makeText(getApplicationContext(),"俩次输入的密码不一致",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(Button_love_code.isChecked()||Button_love_read.isChecked()||Button_love_game.isChecked()||Button_love_sing.isChecked()||Button_love_sport.isChecked()||Bubbon_love_swim.isChecked())){
                    Toast.makeText(getApplicationContext(),"兴趣爱好必须选择一个",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"注册成功",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button_qq_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QQRegister.this,QQLoginPage1.class);
                startActivity(intent);
            }
        });

        Button_qq_index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QQRegister.this,MainActivity.class);
                startActivity(intent);
            }
        });

        String[] city_list = new String[] {"江苏省","上海市","北京市"};
        arrayadapter = new ArrayAdapter(QQRegister.this,android.R.layout.simple_dropdown_item_1line,city_list);
        Spinner_city.setAdapter(arrayadapter);

        Spinner_city.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

    void initView(){
        Button_qq_username = (EditText) findViewById(R.id.qq_username);
        Button_qq_pwd = (EditText) findViewById(R.id.qq_pwd);
        Button_qq_pwd1 = (EditText) findViewById(R.id.qq_pwd1);

        Bubbon_love_swim = (CheckBox) findViewById(R.id.love_swim);
        Button_love_game = (CheckBox) findViewById(R.id.love_game);
        Button_love_code = (CheckBox) findViewById(R.id.love_code);
        Button_love_sing = (CheckBox) findViewById(R.id.love_sing);
        Button_love_read = (CheckBox) findViewById(R.id.love_read);
        Button_love_sport = (CheckBox) findViewById(R.id.love_sport);

        ButtonSubmit = (Button) findViewById(R.id.submit);
        Button_qq_login = (Button) findViewById(R.id.qq_register_login);
        Button_qq_index = (Button) findViewById(R.id.page_index);

        Spinner_city = (Spinner) findViewById(R.id.spinner_city);
    }
}
