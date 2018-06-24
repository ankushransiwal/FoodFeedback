package com.example.ankush.foodfeedback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    RadioGroup rgMeal;
    RadioButton rbBurger, rbPizza, rbDosa;
    RatingBar rBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        rgMeal = (RadioGroup)findViewById(R.id.rgMeal);
        rbBurger = (RadioButton)findViewById(R.id.rbBurger);
        rbDosa = (RadioButton)findViewById(R.id.rbDosa);
        rbPizza = (RadioButton)findViewById(R.id.rbPizza);
        rBar = (RatingBar)findViewById(R.id.rBar);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1 = rgMeal.getCheckedRadioButtonId();
                RadioButton rgMeal = (RadioButton)findViewById(s1);
                String msg = rgMeal.getText().toString() +" "+ rBar.getRating() + " stars";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
