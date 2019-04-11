package com.lzj.dagger2.activity.cat;

import javax.inject.Inject;

/**
 * Created by lzj on 2019/4/11
 * Describe ：注释
 */
public class RedCat {
    @Inject
    public RedCat() {
    }

    public String eat() {
        return "红猫爱吃鱼干!";
    }
}
