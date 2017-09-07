package com.cruz.cruzquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);
    }

    public void toCS(View view) {
        Intent intent = new Intent(this, CSActivity.class);
        startActivity(intent);
    }

    public void toHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toIT(View view) {
        Intent intent = new Intent(this, ITActivity.class);
        startActivity(intent);
    }

}
