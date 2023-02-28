package org.example.jul.bridge;


import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Logger;

/**
 * @Description: slf4j 使用桥接器 解决原有项目使用jul后，桥接给logback
 * @Author: WangYouzheng
 * @Date: 2022/7/13 15:11
 * @Version: V1.0
 */
public class Slf4jBridgeJulApp {
    public static void main(String[] args) {
        logNative();
    }

    /**
     * 使用原生JUL
     */
    public static void logNative() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        Logger logger = Logger.getAnonymousLogger();
        logger.info("我是jul的info");
        logger.warning("我是jul的warn");
        logger.config("我是jul的config");
        logger.fine("我是jul的fine");
        logger.finer("我是jul的warn");
    }
}
