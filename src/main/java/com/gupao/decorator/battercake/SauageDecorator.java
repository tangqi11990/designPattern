package com.gupao.decorator.battercake;

/**
 * @ProjectName: DesignPattern
 * @ClassName: BatterCakeWithEgg
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:40 上午
 * @Version v1.0
 */
public class SauageDecorator extends BatterCakeDecorator{

    public SauageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个火腿";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
