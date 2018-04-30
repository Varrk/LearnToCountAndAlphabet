package com.example.ignat.learntocountandalphabet;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityCount extends AppCompatActivity implements OnClickListener{
    Button btnToCount;
    TextView textViewCount;
    LinearLayout layoutCount;
    ImageView imgKitten;
    MediaPlayer kittenSound;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        btnToCount = findViewById(R.id.btnToCount);
        btnToCount.setOnClickListener(this);
        textViewCount = findViewById(R.id.textViewCount);
        imgKitten = findViewById(R.id.imgKitten);
        imgKitten.setOnClickListener(this);

        kittenSound = MediaPlayer.create(this, R.raw.meow);
        //imageClick();
    }

    /*public void imageClick(){
      //  imgKitten.setOnClickListener(
        //        new View.OnClickListener(){
          //          @Override
            //        public void onClick(View view){
              //          playSound(kittenSound);
                    }
                }
        );
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnToCount:
                //запускаем функцию изменения кнопки
                //btnChange();
                // запускаем функцию счета
                countFunc();
                break;
            case R.id.imgKitten:
                //мяуканье
                playSound(kittenSound);
                break;
            default:
                break;
        }

    }

    //функция изменения кнопки
   /* public void btnChange(){
        btnToCount.setText("ЖМИ!");
        btnToCount.setW
    }*/

    //функция счета
    public void countFunc(){
        count ++;
        textViewCount.setText(String.valueOf(count));
        textViewCount.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 70);
        if (count == 10) {
            count = 0;
        }
    }
    //звук при нажатии
    public void playSound(MediaPlayer sound){
        sound.start();
    }
}
