package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback整合的时候，logback的classic包已经自动整合了slf4j。 会读取 logback.xml
 */
public class LogbackApp {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogbackApp.class);
        logger.info("logback info");
        logger.warn("logback warn");
        logger.debug("logback debug");
        logger.error("logback error");
        logger.trace("logback trace");
    }
}
