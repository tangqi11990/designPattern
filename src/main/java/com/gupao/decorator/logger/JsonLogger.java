package com.gupao.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

/**
 * @ProjectName: DesignPattern
 * @ClassName: JsonLoggerDecorator
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/12 9:57 上午
 * @Version v1.0
 */
public class JsonLogger extends LoggerDecorator{

    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void error(String s) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", s);
        logger.error(jsonObject.toString());
    }

    @Override
    public void info(String s) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", s);
        logger.info(jsonObject.toString());
    }

    public void error(Exception e) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", e.getMessage());
        jsonObject.put("stacktrace", Arrays.toString(e.getStackTrace()));
        logger.error(jsonObject.toString());
    }

}
