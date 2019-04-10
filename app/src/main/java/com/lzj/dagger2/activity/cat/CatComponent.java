package com.lzj.dagger2.activity.cat;

import com.lzj.dagger2.activity.MainActivity;

import dagger.Component;

/**
 * Created by lzj on 2019/4/10
 * Describe ：注释
 */
//第一步 添加@Component
//第二步 添加module
@Component(modules = {CatModule.class})
public interface  CatComponent {
    //第三步  写一个方法 绑定Activity /Fragment
    void inject(MainActivity activity);
}
