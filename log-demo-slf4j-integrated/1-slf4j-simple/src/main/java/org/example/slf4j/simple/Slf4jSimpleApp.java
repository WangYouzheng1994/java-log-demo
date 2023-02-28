package org.example.slf4j.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * sfl4j 官方的 简单日志实现
 * <!-- slf4j 自带的日志实现   -->
 * <!--
 *      <dependency>
 *          <groupId>org.slf4j</groupId>
 *          <artifactId>slf4j-simple</artifactId>
 *          <version>1.7.36</version>
 *      </dependency>
 * -->
 */
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
