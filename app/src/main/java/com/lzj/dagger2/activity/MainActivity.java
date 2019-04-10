package com.lzj.dagger2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lzj.dagger2.activity.cat.DaggerCatComponent;
import com.lzj.dagger2.activity.cat.OrangeCat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    OrangeCat orangeCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一种方式
        DaggerCatComponent.create().inject(this);
        //第二种方式
       // DaggerCatComponent.builder().build().inject(this);

        String context=orangeCat.eat();

        Log.i("test","-----------------"+context);

    }
}
