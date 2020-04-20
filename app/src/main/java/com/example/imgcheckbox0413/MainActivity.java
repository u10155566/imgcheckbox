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
        CheckBox chk;

        ImageView imgMina,imgMomo,imgSana,imgTzuyu;

        imgMina=findViewById(R.id.imgMina);
        imgMomo=findViewById(R.id.imgMomo);
        imgSana=findViewById(R.id.imgSana);
        imgTzuyu=findViewById(R.id.imgTzuyu);

        imgMina.setVisibility(View.GONE);
        imgMomo.setVisibility(View.GONE);
        imgSana.setVisibility(View.GONE);
        imgTzuyu.setVisibility(View.GONE);

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
