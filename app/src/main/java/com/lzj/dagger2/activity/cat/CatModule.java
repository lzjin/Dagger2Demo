package com.lzj.dagger2.activity.cat;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lzj on 2019/4/10
 * Describe ：有第三方库时 才使用
 */
//第一步 添加@Module 注解
@Module
public class CatModule {
    //第二步 使用Provider 注解 实例化对象
    @Provides
    OrangeCat providerCat() {
        return new OrangeCat();
    }

}
