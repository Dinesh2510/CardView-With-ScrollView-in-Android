package com.dinesh.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View imgbtn1 = findViewById(R.id.imgbtn1);

        imgbtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.imgbtn1:
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);

                break;

        }

    }
}
