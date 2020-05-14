package com.gupao.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @ProjectName: DesignPattern
 * @ClassName: ConnectionPool
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 10:02 上午
 * @Version v1.0
 */
public class ConnectionPool {


    private  Vector<Connection> pools;

    private int initPoolsSize = 100;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String pwd = "root";
    private String driverName = "com.mysql.jdbc.Driver";

    public ConnectionPool(int initPoolsSize) {
        this.initPoolsSize = initPoolsSize;
        new ConnectionPool();
    }

    public ConnectionPool() {
        pools = new Vector<>(initPoolsSize);
        try {
            Class.forName(driverName);
            for (int i = 0; i < initPoolsSize; i++) {
                pools.add(DriverManager.getConnection(url, username, pwd));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConn() {
        if (pools.size() > 0) {
            Connection connection = pools.get(0);
            pools.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized boolean releaseConn(Connection connection) {
       return pools.add(connection);
    }
}
