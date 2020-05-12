package com.gupao.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ProjectName: DesignPattern
 * @ClassName: JsonLoggerFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 10:01 上午
 * @Version v1.0
 */
public class JsonLoggerFactory {

    public static final JsonLogger getLogger(Class<?> clazz) {
        Logger logger = LoggerFactory.getLogger(clazz);
        JsonLogger jsonLogger = new JsonLogger(logger);
        return jsonLogger;
    }

}
