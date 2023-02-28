package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log4j2App
 *
 *  <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-api</artifactId>
 *     <version>2.20.0</version>
 *   </dependency>
 *   <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-core</artifactId>
 *     <version>2.20.0</version>
 *   </dependency>
 *  默认加载的配置文件时resources下面的log4j2.xml https://logging.apache.org/log4j/2.x/manual/configuration.html
 *
 * @author WangYouzheng
 * @version 1.0
 * @since 2023/2/28 19:24
 */
public class Log4j2App {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4j2App.class);
        logger.fatal("我是log4j2 - fatal");
        logger.error("我是log4j2 - error");
        logger.warn("我是log4j2 - warn");
        logger.info("我是log4j2 - info");
        logger.debug("我是log4j2 - debug");
        logger.trace("我是log4j2 - trace");
    }
}
