package com.gupao.flyweight.pool;

import java.sql.Connection;

/**
 * Created by Tom.
 */
public class PoolTest {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConn();
        System.out.println(conn);
    }
}
