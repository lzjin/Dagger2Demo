package com.lzj.dagger2.activity.cat;

import javax.inject.Inject;

/**
 * Created by lzj on 2019/4/10
 * Describe ：注释
 */
public class PersianCat {
    @Inject
    public RedCat redCat;

    @Inject
    public PersianCat(RedCat redCat) {
        this.redCat = redCat;
    }
    public String eat() {

        return "波斯猫爱吃鱼干!";
    }

}
