package org.example.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSimpleApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jSimpleApp.class);

        logger.info("info，1");
        logger.warn("warn，2");
        logger.debug("debug, 3");
        logger.error("error，4");
        logger.trace("trace，5");
    }
}