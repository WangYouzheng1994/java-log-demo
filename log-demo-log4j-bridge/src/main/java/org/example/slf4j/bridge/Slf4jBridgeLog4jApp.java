package org.example.slf4j.bridge;

import org.apache.log4j.Logger;

/**
 * @Description: slf4j 使用桥接器 解决原有项目使用log4j 后 引入slf4j 报错的问题。
 * @Author: WangYouzheng
 * @Date: 2022/7/13 15:11
 * @Version: V1.0
 */
public class Slf4jBridgeLog4jApp {
    public static void main(String[] args) {
        derived();
    }

    /**
     * 使用原生Log4j
     */
    public static void logNative() {
        /**
         * 假设 原有项目使用的是 Log4j API
         */
        Logger logger = Logger.getLogger(Slf4jBridgeLog4jApp.class);

        logger.info("我是原生log4j--info");
        logger.warn("我是原生log4j--warn");
        logger.debug("我是原生log4j--debug");
        logger.error("我是原生log4j--error");
        logger.trace("我是原生log4j--trace");
        logger.fatal("我是原生log4j--fatal");
    }

    /**
     * slf4j Bridge 桥接log4J
     */
    public static void derived() {

        /**
         * 假设 原有项目使用的是 Log4j API
         */
        Logger logger = Logger.getLogger(Slf4jBridgeLog4jApp.class);

        logger.info("我是Slf4J派生的log4j--info");
        logger.warn("我是Slf4J派生的--warn");
        logger.debug("我是Slf4J派生的--debug");
        logger.error("我是Slf4J派生的--error");
        logger.trace("我是Slf4J派生的--trace");
        logger.fatal("我是Slf4J派生的--fatal");

    }
}
