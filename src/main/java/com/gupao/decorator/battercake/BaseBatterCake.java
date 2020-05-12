package com.gupao.decorator.battercake;

/**
 * @ProjectName: DesignPattern
 * @ClassName: BaseBatterCake
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:38 上午
 * @Version v1.0
 */
public class BaseBatterCake extends BatterCake{

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
