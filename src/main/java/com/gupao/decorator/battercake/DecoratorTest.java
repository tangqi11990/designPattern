package com.gupao.decorator.battercake;

/**
 * @ProjectName: DesignPattern
 * @ClassName: DecoratorTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:44 上午
 * @Version v1.0
 */
public class DecoratorTest {

    public static void main(String[] args) {
        BatterCake batterCake ;
        batterCake  = new BaseBatterCake();
        System.out.println(batterCake.getMsg() + ", 价格为:" + batterCake.getPrice());

        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ", 价格为:" + batterCake.getPrice());

        batterCake = new SauageDecorator(batterCake);
        System.out.println(batterCake.getMsg() + ", 价格为:" + batterCake.getPrice());
    }
}

