package org.example;

import java.util.logging.Logger;

/**
 * java util logging， 会读取resources下面的logging.properties
 */
public class JulApp {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("我是jul的info");
        logger.warning("我是jul的warn");
        logger.config("我是jul的config");
        logger.fine("我是jul的fine");
        logger.finer("我是jul的warn");

        /*// 以下使用slf4j的api
        org.slf4j.Logger logSlf4j = LoggerFactory.getLogger(JulApp.class);
        logSlf4j.debug("你好啊，我是jul +slf4j");*/
    }
}
