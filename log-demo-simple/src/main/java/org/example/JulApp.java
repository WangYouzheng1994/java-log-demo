package org.example;

import java.util.logging.Logger;

/**
 * java util logging， 会读取resources下面的logging.properties
 */
public class JulApp {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("啦啦啦啦啦");

        /*// 以下使用slf4j的api
        org.slf4j.Logger logSlf4j = LoggerFactory.getLogger(JulApp.class);
        logSlf4j.debug("你好啊，我是jul +slf4j");*/
    }
}
