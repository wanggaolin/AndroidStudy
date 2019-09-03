package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class FromInput extends AppCompatActivity {
    private RadioGroup rad;
    private RadioButton  radbig,radben,radyan;
    private RatingBar pingjia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_input);

        initView();

        rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radben:
                        Toast.makeText(getApplicationContext(),radben.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radbig:
                        Toast.makeText(getApplicationContext(),radben.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radyan:
                        Toast.makeText(getApplicationContext(),radben.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        pingjia.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getApplicationContext(),v+"",Toast.LENGTH_SHORT).show();
            }
        });
    }


    void initView(){
        rad = (RadioGroup) findViewById(R.id.rad);
        radbig = (RadioButton) findViewById(R.id.radbig);
        radben = (RadioButton) findViewById(R.id.radben);
        radyan = (RadioButton) findViewById(R.id.radyan);
        pingjia = (RatingBar) findViewById(R.id.pingjia);
    }
}
