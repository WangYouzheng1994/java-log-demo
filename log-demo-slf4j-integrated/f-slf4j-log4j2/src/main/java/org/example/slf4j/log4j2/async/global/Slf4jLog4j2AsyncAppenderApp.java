package org.example.slf4j.log4j2.async.global;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4jLog4j2AsyncAppenderApp
 *
 * @author WangYouzheng
 * @version 1.0
 * @since 2023/3/1 10:01
 */
public class Slf4jLog4j2AsyncAppenderApp {
    public static void main(String[] args) {
        // 同步日志
//         syncLog();

        // 异步日志
        asyncAppenderLog();
    }

    /**
     * 异步
     */
    static void asyncAppenderLog() {
        System.setProperty("log4j2.configurationFile", "async/log4j2-splitfile.xml");
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2AsyncAppenderApp.class);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            logger.error("slf4j + log4j2 error");
            logger.warn("slf4j + log4j2 warn");
            logger.info("slf4j + log4j2 info");
            logger.debug("slf4j + log4j debug");
            logger.trace("slf4j + log4j2 trace");
        }
        System.out.println(System.currentTimeMillis());
    }

    /**
     * 同步 对照组
     * sout和err不一样~ 具体的自己百度
     */
    static void syncLog() {
        System.setProperty("log4j2.configurationFile", "log4j2-splitfile.xml");
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2AsyncAppenderApp.class);
        System.out.println(System.currentTimeMillis());

        for (int i = 0; i < 5; i++) {
            logger.error("slf4j + log4j2 error, 当前循环{}", i);
            logger.warn("slf4j + log4j2 warn, 当前循环{}", i);
            logger.info("slf4j + log4j2 info, 当前循环{}", i);
            logger.debug("slf4j + log4j debug, 当前循环{}", i);
            logger.trace("slf4j + log4j2 trace, 当前循环{}", i);
        }
        System.out.println(System.currentTimeMillis());

    }
}
