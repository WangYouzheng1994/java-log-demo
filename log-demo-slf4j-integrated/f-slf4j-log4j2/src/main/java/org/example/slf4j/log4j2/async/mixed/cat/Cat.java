package org.example.slf4j.log4j2.async.mixed.cat;

import org.example.slf4j.log4j2.async.mixed.Slf4jLog4j2AsyncLoggerApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cat
 *
 * @author WangYouzheng
 * @version 1.0
 * @since 2023/3/2 15:47
 */
public class Cat {
    public static void logOut() {
//        System.setProperty("log4j2.configurationFile", "async/mixed/log4j2-asynclogger.xml");

        Logger logger = LoggerFactory.getLogger(Cat.class);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            logger.error("cat error， {}", i);
            logger.warn("cat warn, {}", i);
            logger.info("cat info, {}", i);
            logger.debug("cat debug, {}", i);
            logger.trace("cat trace, {}", i);
        }
        System.out.println(System.currentTimeMillis());
    }
}
