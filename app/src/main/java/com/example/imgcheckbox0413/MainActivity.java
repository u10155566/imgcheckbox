package com.example.imgcheckbox0413;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        //設定各屬性的值
        CheckBox chk;
        ImageView imgMina,imgMomo,imgSana,imgTzuyu;

        //取得答案區各圖片的id
        imgMina=findViewById(R.id.imgMina);
        imgMomo=findViewById(R.id.imgMomo);
        imgSana=findViewById(R.id.imgSana);
        imgTzuyu=findViewById(R.id.imgTzuyu);

        //完全隱藏答案區四張圖片
        imgMina.setVisibility(View.GONE);
        imgMomo.setVisibility(View.GONE);
        imgSana.setVisibility(View.GONE);
        imgTzuyu.setVisibility(View.GONE);

        //當圖片被勾選後按下確認會顯示出被選中的圖片
        int[] id={R.id.chkMina, R.id.chkMomo, R.id.chkSana, R.id.chkTzuyu };

        for(int i:id) {
            chk = findViewById(i);

            if(chk.isChecked()){
                if(chk.getId() == R.id.chkMina)
                    imgMina.setVisibility(View.VISIBLE);
                if(chk.getId() == R.id.chkMomo)
                    imgMomo.setVisibility(View.VISIBLE);
                if(chk.getId() == R.id.chkSana)
                    imgSana.setVisibility(View.VISIBLE);
                if(chk.getId() == R.id.chkTzuyu)
                    imgTzuyu.setVisibility(View.VISIBLE);
            }
        }
    }
}
