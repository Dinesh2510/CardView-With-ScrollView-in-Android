package com.dinesh.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View card1 = findViewById(R.id.card1);

        card1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.card1:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

                break;

        }
    }
}