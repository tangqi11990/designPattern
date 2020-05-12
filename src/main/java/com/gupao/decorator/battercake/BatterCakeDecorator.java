package com.gupao.decorator.battercake;

/**
 * @ProjectName: DesignPattern
 * @ClassName: BatterCakeDecorator
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:39 上午
 * @Version v1.0
 */
public class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
