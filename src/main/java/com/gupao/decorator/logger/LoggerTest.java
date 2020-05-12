package com.gupao.decorator.logger;
/**
 * @ProjectName: DesignPattern
 * @ClassName: LoggerTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:51 上午
 * @Version v1.0
 */
public class LoggerTest {

    private static final JsonLogger logger = JsonLoggerFactory.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        logger.error("异常测试");
    }
}
