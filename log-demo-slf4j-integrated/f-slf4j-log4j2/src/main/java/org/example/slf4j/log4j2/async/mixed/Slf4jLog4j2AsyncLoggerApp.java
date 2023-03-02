package org.example.slf4j.log4j2.async.mixed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4jLog4j2AsyncAppenderApp
 * resources中增加log4j2.compopent.properties
 *
 * @author WangYouzheng
 * @version 1.0
 * @since 2023/3/1 10:01
 */
public class Slf4jLog4j2AsyncLoggerApp {
    public static void main(String[] args) {
        // 同步日志
//         syncLog();

        // 异步日志
        asyncAppenderLog();
    }

    /**
     * 异步，使用asyncLogger
     */
    static void asyncAppenderLog() {
        System.setProperty("log4j2.configurationFile", "async/global/logger/log4j2-asynclogger.xml");
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2AsyncLoggerApp.class);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            logger.error("slf4j + log4j2 error， {}", i);
            logger.warn("slf4j + log4j2 warn, {}", i);
            logger.info("slf4j + log4j2 info, {}", i);
            logger.debug("slf4j + log4j debug, {}", i);
            logger.trace("slf4j + log4j2 trace, {}", i);
        }
        System.out.println(System.currentTimeMillis());
    }

}
