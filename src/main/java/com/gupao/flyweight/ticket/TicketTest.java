package com.gupao.flyweight.ticket;

/**
 * @ProjectName: DesignPattern
 * @ClassName: TicketTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 9:55 上午
 * @Version v1.0
 */
public class TicketTest {

    public static void main(String[] args) {
        TicketFactory ticketFactory = new TicketFactory();
        ITicket ticket = ticketFactory.query("北京", "上海");
        ticket.show("硬座");

        ticket = ticketFactory.query("北京", "上海");
        ticket.show("软卧");
    }
}
