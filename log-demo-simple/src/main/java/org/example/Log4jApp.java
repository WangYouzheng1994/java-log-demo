package org.example;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * log4j 1.x 会读取resources下面的 log4j.properties
 */
public class Log4jApp {
    private static final Logger logger = LogManager.getLogger("App");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        logger.info("aaaaaaaaaaaaaa");

        logger.error("aaaaaaaaaaaaaa");
    }
}
