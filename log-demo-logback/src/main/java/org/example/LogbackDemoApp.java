package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback demo
 */
public class LogbackDemoApp {
    public static void main(String[] args) {
        // 设置读取配置文件的地址。
        System.setProperty("logback.configurationFile", "1.xml");

        final Logger logger = LoggerFactory.getLogger(LogbackDemoApp.class);

        // Logback配置文件的使用
        logger.trace("i am logback, {}", "its trace api");
        logger.debug("i am logback, {}", "its debug api");
        logger.info("i am logback, {}", "its info api");
        logger.warn("i am logback, {}", "its warn api");
        logger.error("i am logback, {}", "its error api");
    }
}
