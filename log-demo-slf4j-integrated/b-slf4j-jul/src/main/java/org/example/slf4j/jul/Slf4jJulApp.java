package org.example.slf4j.jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Slf4j与JUL集成。 Java Util logging
 *   <!-- slf4j 与 jul 桥接集成 -->
 *     <dependency>
 *       <groupId>org.slf4j</groupId>
 *       <artifactId>slf4j-jdk14</artifactId>
 *       <version>1.7.36</version>
 *     </dependency>
 */
public class Slf4jJulApp {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jJulApp.class);

        logger.info("slf4j + JUL");
        logger.debug("slf4j + JUL");
        logger.warn("slf4j + JUL");
        logger.trace("slf4j + JUL");
        logger.error("slf4j + jul");
    }
}
