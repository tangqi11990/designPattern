package com.gupao.flyweight.ticket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: DesignPattern
 * @ClassName: TicketFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 9:51 上午
 * @Version v1.0
 */
public class TicketFactory {

    public static Map<String, ITicket> ticketPools = new ConcurrentHashMap<>();

    public ITicket query(String from ,String to) {

        String key = from + "--->" + to;

        if (ticketPools.containsKey(key)) {
            System.out.println("使用缓存获取");
            return ticketPools.get(key);
        }

        ITicket ticket = new TrainTicket(from, to);
        System.out.println("缓存没有，首次创建");
        ticketPools.put(key, ticket);
        return ticket;
    }
}
