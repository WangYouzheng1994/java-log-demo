package org.example.jul.bridge;


import java.util.logging.Logger;

/**
 * @Description: slf4j 使用桥接器 解决原有项目使用log4j后，引入slf4j的报错的问题。
 * @Author: WangYouzheng
 * @Date: 2022/7/13 15:11
 * @Version: V1.0
 */
public class Slf4jBridgeLog4jApp {
    public static void main(String[] args) {
        logNative();
    }

    /**
     * 使用原生JUL
     */
    public static void logNative() {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("我是jul的info");
        logger.warning("我是jul的warn");
        logger.config("我是jul的config");
        logger.fine("我是jul的fine");
        logger.finer("我是jul的warn");
    }
}
