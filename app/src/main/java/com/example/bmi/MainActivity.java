package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText heightText,weightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        heightText=findViewById(R.id.height);
        weightText=findViewById(R.id.weight);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height=Float.parseFloat(heightText.getText().toString());
                float weight=Float.parseFloat(weightText.getText().toString());
                float bmi= weight/(height*height);
                Toast.makeText(getApplicationContext(),"BMI is: "+bmi, Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(),secondActivity.class);

                i.putExtra("BMI",bmi);
                startActivity(i);


            }
        });

    }
}
