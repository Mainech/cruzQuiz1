package com.cruz.cruzquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
    }


    public void toHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toIS(View view) {
        Intent intent = new Intent(this, ISActivity.class);
        startActivity(intent);
    }

    public void toIT(View view) {
        Intent intent = new Intent(this, ITActivity.class);
        startActivity(intent);
    }

}
