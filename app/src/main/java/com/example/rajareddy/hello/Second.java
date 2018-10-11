package com.example.rajareddy.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Raja Reddy on 10/9/2018.
 */

public class Second extends AppCompatActivity{
    public static final String TAG=Second.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Intent in=new Intent(getApplicationContext(),MainActivity.class);
                in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //        startActivity(in);
               startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
    }
}
