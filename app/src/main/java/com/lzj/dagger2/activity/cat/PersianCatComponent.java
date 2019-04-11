package com.lzj.dagger2.activity.cat;

import com.lzj.dagger2.activity.SecondActivity;

import dagger.Component;

/**
 * Created by lzj on 2019/4/11
 * Describe ：注释
 */
@Component
public interface PersianCatComponent {
    void inject(SecondActivity activity);
}
