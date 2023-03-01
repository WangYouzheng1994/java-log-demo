package org.example.slf4j.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用slf4j的门面接口，通过适配器 让log4j2进行输出
 */
public class Slf4jLog4j2App {
    public static void main(String[] args) {
//        fileXML();
        splitFile();
    }

    public static void defaultXML() {
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2App.class);
        logger.warn("slf4j + log4j");
        logger.info("slf4j + log4j");
        logger.debug("slf4j + log4j");
    }

    /**
     * 写入到日志文件
     * https://logging.apache.org/log4j/2.x/manual/configuration.html#AutomaticConfiguration
     */
    public static void fileXML() {
        System.setProperty("log4j2.configurationFile", "log4j2-file.xml");
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2App.class);
        logger.error("slf4j + log4j2 error");
        logger.warn("slf4j + log4j2 warn");
        logger.info("slf4j + log4j2 info");
        logger.debug("slf4j + log4j debug");
        logger.trace("slf4j + log4j2 trace");
    }

    /**
     * 日志拆分
     */
    public static void splitFile() {
        System.setProperty("log4j2.configurationFile", "log4j2-splitfile.xml");
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2App.class);
        logger.error("slf4j + log4j2 error");
        logger.warn("slf4j + log4j2 warn");
        logger.info("slf4j + log4j2 info");
        logger.debug("slf4j + log4j debug");
        logger.trace("slf4j + log4j2 trace");
    }
}
