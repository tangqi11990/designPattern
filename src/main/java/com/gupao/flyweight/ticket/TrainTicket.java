package com.gupao.flyweight.ticket;

import java.util.Random;

/**
 * @ProjectName: DesignPattern
 * @ClassName: TrainTicket
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 9:48 上午
 * @Version v1.0
 */
public class TrainTicket implements ITicket{

    private String from;

    private String to;

    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void show(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(from + "--->" + to + " 座位:" +bunk +  " 票价为:" + price );
    }
}
