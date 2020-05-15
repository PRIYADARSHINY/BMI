package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class secondActivity extends AppCompatActivity {
    private TextView resultText;
    private ImageView resultImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        float user_bmi=intent.getFloatExtra("BMI",0);

        if(25.0>=user_bmi && 17.0<=user_bmi)
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are healthy");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.healthy);
            resultImage.setImageDrawable(drawable);
        }
        else if(user_bmi<=17.0)
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are Undernurished");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.weak);
            resultImage.setImageDrawable(drawable);
        }
        else
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are Overnurished!");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.over);
            resultImage.setImageDrawable(drawable);
        }
    }
}
