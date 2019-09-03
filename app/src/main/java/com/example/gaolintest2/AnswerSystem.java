package com.example.gaolintest2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AnswerSystem extends AppCompatActivity {
    private TabHost tabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_system);

        initview();
        tabHost.setup();
        Drawable drawable1 = getResources().getDrawable(R.drawable.answer_danxuan);
//        TabHost.TabSpec tabspe1 = tabHost.newTabSpec("tab1").setIndicator("单选题",drawable1).setContent(R.id.addres_city);
        TabHost.TabSpec tabspe1 = tabHost.newTabSpec("tab1").setIndicator(getTabitems(R.drawable.answer_danxuan,"单选题")).setContent(R.id.addres_city);
        tabHost.addTab(tabspe1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2").setIndicator(getTabitems(R.drawable.answer_duoxuan,"多选题")).setContent(R.id.love);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tab3").setIndicator(getTabitems(R.drawable.answer_tiankong,"填空题")).setContent(R.id.write);
        tabHost.addTab(tabSpec3);

        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("tab4").setIndicator(getTabitems(R.drawable.answer_danxuan,"判断题")).setContent(R.id.marry);
        tabHost.addTab(tabSpec4);

        //设置打开页面默认显示tab
        tabHost.setCurrentTabByTag("tab3");

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                //根据切换tab提示对应选取
                if(s.equals("tab1")){
                    Toast.makeText(getApplicationContext(),"单选题",Toast.LENGTH_LONG).show();
                }
                if(s.equals("tab2")){
                    Toast.makeText(getApplicationContext(),"多选题",Toast.LENGTH_LONG).show();
                }
                if(s.equals("tab3")){
                    Toast.makeText(getApplicationContext(),"填空题",Toast.LENGTH_LONG).show();
                }
                if(s.equals("tab4")){
                    Toast.makeText(getApplicationContext(),"判断题",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    void initview(){
        tabHost = (TabHost) findViewById(R.id.tabs);

    }

    public View getTabitems(int ImgId, String text){
        LinearLayout ll = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.tabicon,null);
        ImageView img = (ImageView) ll.findViewById(R.id.img_duanxuan);
        img.setBackgroundResource(ImgId);
        TextView tv = (TextView) ll.findViewById(R.id.text_danxuan);
        tv.setText(text);
        return ll;
    }
}
