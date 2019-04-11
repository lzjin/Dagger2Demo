package com.lzj.dagger2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.lzj.dagger2.activity.cat.DaggerPersianCatComponent;
import com.lzj.dagger2.activity.cat.PersianCat;

import javax.inject.Inject;

/**
 * Created by lzj on 2019/4/11
 * Describe ：注释
 */
public class SecondActivity extends AppCompatActivity {
      @Inject
      PersianCat persianCat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPersianCatComponent.create().inject(this);
        String str=persianCat.eat();
        String str2=persianCat.redCat.eat();


        Log.i("test","-----------------"+str);
        Log.i("test","-----------------"+str2);


    }
}
