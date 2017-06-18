package com.example.admin.tutorial6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by admin on 2017-06-12.
 */

public class SubActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub);
        TextView nametext = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nametext.setText(intent.getStringExtra("nameText").toString());
    }
}
