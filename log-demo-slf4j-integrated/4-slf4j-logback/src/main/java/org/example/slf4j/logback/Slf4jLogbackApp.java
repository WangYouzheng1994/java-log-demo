package org.example.slf4j.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * sfl4j 集成 logback
 */
public class Slf4jLogbackApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jLogbackApp.class);
        logger.trace("trace, {}", 5);
        logger.debug("debug, 3");
        logger.info("info，1");
        logger.warn("warn，2");
        logger.error("error，4");
    }
}
