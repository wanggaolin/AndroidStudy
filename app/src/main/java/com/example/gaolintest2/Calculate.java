package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private Button[] btn = new Button[10];
    int[] btnId = {R.id.calcul_0,R.id.calcul_1,R.id.calcul_2,R.id.calcul_3,R.id.calcul_4,R.id.calcul_5,R.id.calcul_6,R.id.calcul_7,R.id.calcul_8,R.id.calcul_9};


    private Button btn_jia,btn_jian,btn_sheng,btn_chu,btn_deng,btn_xiaoshudian;
    private Button btn_c,btn_del;
    private TextView text_result;
    private StringBuffer digTextA = new StringBuffer();   //保存第一个数
    private StringBuffer digTextB = new StringBuffer();   //保存第二个数
    private boolean isChar = false;                       //标记是否按下运算符号
    private int operation = 0;                            //默认运算符号是+/0=+/1=0/2*/3=/
    private boolean isdigTextA = true;                    //默认清空a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        //绑定监听事件
        initView();

        class_btn class_btn = new class_btn();
        for (int i=0;i<btnId.length;i++){
            btn[i].setOnClickListener(class_btn);
        }
        btn_jia = (Button) this.findViewById(R.id.calcul_jiahao);
        btn_jian = (Button) this.findViewById(R.id.calcul_jianhao);
        btn_sheng = (Button) this.findViewById(R.id.calcul_shenghao);
        btn_chu = (Button) this.findViewById(R.id.calcul_chuhao);
        btn_deng = (Button) this.findViewById(R.id.calcul_dengyuhao);
        btn_c = (Button) this.findViewById(R.id.calcul_c);
        btn_del = (Button) this.findViewById(R.id.calcul_del);
        btn_xiaoshudian.setOnClickListener(class_btn);

        btn_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digTextA.length()==0){
                    return;
                }
                text_result.setText("0");
                isChar = true;
                operation = 0;
                isdigTextA = false;
            }
        });
        btn_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digTextA.length()==0){
                    return;
                }
                text_result.setText("0");
                isChar = true;
                operation = 1;
                isdigTextA = false;
            }
        });
        btn_sheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digTextA.length()==0){
                    return;
                }
                text_result.setText("0");
                isChar = true;
                operation = 2;
                isdigTextA = false;
            }
        });
        btn_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digTextA.length()==0){
                    return;
                }
                text_result.setText("0");
                isChar = true;
                operation = 3;
                isdigTextA = false;
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isdigTextA){
                    if(digTextA.length()>0){
                        String temp = digTextA.substring(0,digTextA.length()-1);
                        digTextA = new StringBuffer();
                        digTextA.append(temp);
                        text_result.setText(digTextA.toString());
                    }
                }else{
                    if(digTextB.length()>0){
                        String temp = digTextB.substring(0,digTextB.length()-1);
                        digTextB = new StringBuffer();
                        digTextB.append(temp);
                        text_result.setText(digTextB.toString());
                    }
                }

            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isdigTextA){
                    digTextA = new StringBuffer();
                }else {
                    digTextB = new StringBuffer();
                }
                isChar = false;
                text_result.setText("0");
            }
        });

        btn_deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(digTextA.length()==0||digTextB.length()==0){
                    return;
                }
                float a = Float.parseFloat(digTextA.toString());
                float b = Float.parseFloat(digTextB.toString());
                float c = 0;
                switch (operation){
                    case 0:
                        c = a + b;
                        break;
                    case 1:
                        c = a - b;
                        break;
                    case 2:
                        c = a * b;
                        break;
                    case 3:
                        c = a / b;
                        break;
                }
                text_result.setText(c+"");
                digTextA = new StringBuffer();
                digTextB = new StringBuffer();
                isChar = false;
            }
        });



        /*
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_result.setText("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_result.setText("1");
            }
        });
        btn2.setOnClickListener(class_btn);
        btn3.setOnClickListener(class_btn);
        btn4.setOnClickListener(class_btn);
        btn5.setOnClickListener(class_btn);
        btn6.setOnClickListener(class_btn);
        btn7.setOnClickListener(class_btn);
        btn8.setOnClickListener(class_btn);
        btn9.setOnClickListener(class_btn);
        */


    }
    void initView(){
        for(int i=0;i<btnId.length;i++){
            btn[i] = (Button) findViewById(btnId[i]);

        }
        /*
        用for循环代替这些代码
        btn0 = (Button) this.findViewById(R.id.calcul_0);
        btn1 = (Button) this.findViewById(R.id.calcul_1);
        btn2 = (Button) this.findViewById(R.id.calcul_2);
        btn3 = (Button) this.findViewById(R.id.calcul_3);
        btn4 = (Button) this.findViewById(R.id.calcul_4);
        btn5 = (Button) this.findViewById(R.id.calcul_5);
        btn6 = (Button) this.findViewById(R.id.calcul_6);
        btn7 = (Button) this.findViewById(R.id.calcul_7);
        btn8 = (Button) this.findViewById(R.id.calcul_8);
        btn9 = (Button) this.findViewById(R.id.calcul_9);
         */
        btn_xiaoshudian = (Button) this.findViewById(R.id.calcul_xiaoshudian);

        text_result = (TextView) this.findViewById(R.id.calcul_text);
    }
    class class_btn implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.calcul_0:
                    if(isChar){
                        digTextB.append("0");
                        text_result.setText(digTextB.toString());
                    }else{
                        digTextA.append("0");
                        text_result.setText(digTextA.toString());
                    }
                    break;
                case R.id.calcul_1:
                    setVal("1");
                    break;
                case R.id.calcul_2:
                    setVal("2");
                    break;
                case R.id.calcul_3:
                    setVal("3");
                    break;
                case R.id.calcul_4:
                    setVal("4");
                    break;
                case R.id.calcul_5:
                    setVal("5");
                    break;
                case R.id.calcul_6:
                    setVal("6");
                    break;
                case R.id.calcul_7:
                    setVal("7");
                    break;
                case R.id.calcul_8:
                    setVal("8");
                    break;
                case R.id.calcul_9:
                    setVal("9");
                    break;
                case R.id.calcul_xiaoshudian:
                    setVal(".");
                    break;
            }
        }
        public void setVal(String v){
            if(isChar){
                digTextB.append(v);
                text_result.setText(digTextB.toString());
            }else{
                digTextA.append(v);
                text_result.setText(digTextA.toString());
            }
        }
    }
}
