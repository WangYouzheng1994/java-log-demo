package org.example.slf4j.multiimport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * slf4j 多个under实现引用对比
 */
public class Slf4jMultiImportApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jMultiImportApp.class);

        logger.info("info，1");
        logger.warn("warn，2");
        logger.debug("debug, 3");
        logger.error("error，4");
        logger.trace("trace，5");
    }
}
